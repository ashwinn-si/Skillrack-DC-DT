/*The program must accept N integers as the input. The program must print the integers having
the unit digit of the last integer among the N integers in reverse order as the output.

Input:
5
108 6608 517 56 48
Output:
48 6608 108
Explanation:
The unit digit of the last integer is 8.
So the integers having the unit digit 8 among the 5 integers are printed in reverse order.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int nums[] = new int [N];
		for(int i = 0 ; i < N ; i++){
		    nums[i]=sc.nextInt();
		}
		
		for(int i = N-1 ; i >=0 ; i--){
		    if(nums[i]%10 == nums[N-1]%10){
		        System.out.printf("%d ",nums[i]);
		    }
		}

	}
}