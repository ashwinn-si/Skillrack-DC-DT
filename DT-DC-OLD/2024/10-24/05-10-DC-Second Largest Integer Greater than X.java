/*The program must accept N integers and an integer X as the input The program must print
the second largest integer greater X among the given N integers as the output.
Note: At least two integers are always greater than X in the given N integers.

Input:
8
1811 139625 362
15

Output:
25

Explanation:
The second largest integer greater than 15 among the given 8 integers is 25.
So 25 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int nums[]=new int[N];
		for(int i=0;i<N;i++){
		    nums[i]=sc.nextInt();
		}
		sc.nextLine();
		int target=sc.nextInt();
		Arrays.sort(nums);
		int count=0;
		int first_largest=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
		    if(nums[i]>target && first_largest!=nums[i]){
		        count++;
		        first_largest=nums[i];
		        if(count==2){
		            System.out.print(nums[i]);
		        }
		    }
		}
	}
}