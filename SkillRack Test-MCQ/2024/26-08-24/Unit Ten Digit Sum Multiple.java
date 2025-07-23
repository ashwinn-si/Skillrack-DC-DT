/*The program must accept N integers. Then the program must print the integer values which
are multiples of the sum of the unit and tenth digits in the reverse order of input. If both unit
and tenth digits are O, then print the integer value. If there are no such integer values then
print O as the output.

Input:
6
561 105 60132 5000 10 744

Output:
744 10 5000 105
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int res[]=new int [N];
		int curr_count=0;
		for(int i=0;i<N;i++){
		    int curr_num=sc.nextInt();
		    int sum=(curr_num%10)+((curr_num/10)%10);
		    if(sum==0 || curr_num%sum==0){
		        res[curr_count]=curr_num;
		        curr_count++;
		    }
		}
		if(curr_count==0){
		    System.out.printf("0");
		    return;
		}
		for(int i=curr_count-1;i>=0;i--){
		    System.out.printf("%d ",res[i]);
		}

	}
}
