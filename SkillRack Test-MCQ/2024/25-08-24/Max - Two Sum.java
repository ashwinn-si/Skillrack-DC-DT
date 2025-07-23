/*The program must accept two arrays of size N and then for each element position, the
program must print find the sum of odd elements till that position for both the arrays and then
print the sum which is higher.

Input:
6
8 1 7 8 2 1
1 3 2 5 6 2

Output:
1 4 8 9 9 9
 */

import java.util.*;
public class Hello {
    public static int max_sum_two_array(int position,String num_1[],String num_2[]){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<position;i++){
            int n1=Integer.parseInt(num_1[i]);
            int n2=Integer.parseInt(num_2[i]);
            if(n1%2==1){
                sum1+=n1;
            }
            if(n2%2==1){
                sum2+=n2;
            }
        }
        if(sum1>sum2){
            return sum1;
        }
        return sum2;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String num_1[]=sc.nextLine().split(" ");
		String num_2[]=sc.nextLine().split(" ");
        for(int i=1;i<=n;i++){
            System.out.printf("%d ",max_sum_two_array(i,num_1,num_2));
        }
     
	}
}
