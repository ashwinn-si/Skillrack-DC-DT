/*The program must accept N integers as the input. The program must print the sum of the
middle integer and the first integer among the N integers. Then the program must print the
sum of the middle integer and the last integer among the N integers, The program must print
the sum of the middle integer and the second integer among the N integers. Then the
program must print the sum of the middle integer and the last but one integer among the N
integers. Similarly, the program must print the sum for the remaining integer values as the
output.
Note: The value of N is always odd.

Input:
11
92 86 84 80 75 71 6865 51 50 21
Output:
163 92 157 121 155 122 151 136 146 139
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int middleInt = N/2;
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0 ;i < middleInt ; i++){
		    System.out.printf("%d %d ",arr[middleInt]+arr[i],arr[middleInt]+arr[N-1-i]);
		}

	}
}