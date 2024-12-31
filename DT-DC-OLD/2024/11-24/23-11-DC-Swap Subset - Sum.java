/* 
The program must accept N integers as the input. It the first integer is greater than the second integer in a
pair of integers, then it is said to be an inversion pair. The program must print the count of inversions
and the last occurring inversion pair among the N integers as the output.
Note; At least one inversion pair IS always present in the given N integers.

Input:
5
2 4 5 1 3

Output:
5
5 3
The possible inversion pairs are (2. 1). (4. 1), (4.3), (S, 1) and (5, 3).
The count of inversions ts 5 and the last occurring inversion pair is (S, 3).
Hence the output is
5
5 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		int index = 0;
		for(int i = 0 ; i < N/6 ; i++){
		    System.out.printf("%d %d %d ",arr[index+3]+arr[index+4],arr[index+5]+arr[index],arr[index+1]+arr[index+2]);
		    index+=6;
		}

	}
}
