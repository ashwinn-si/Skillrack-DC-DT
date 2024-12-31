/* 
The program must N integers as the input The program must swap every tvo subsets Of size 3
among the N integers. Then the program must pont the sum ot every two integers as the output.
Note: The value of N is always a multiple of 6.

Input:
12
2 7 4 15 5 9 11 10 6 12 14 1

Output:
20 11 11 26 12 16

The given 12 integers are 2 7 4 15 5 91110 612141.
The sum of 15 and 5 is 20,
The sum of 9 and 2 is 11.
The sum Of 7 and 4 11.
The sum of 12 and 14 iS 26.
The sum of I and II is 12.
The sum of 10 and 6 is 16.

Hence the output is
20 11 11 26 12 16
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[N];
		for(int i = 0; i < N ;i++){
		    arr[i] = sc.nextInt();
		}
		
		int count = 0;
		int a = 0 ;
		int b = 0 ;
	    for(int i = 0 ; i < N ; i++){
	        for(int j = i+1 ; j < N ; j++){
	            if(arr[i] > arr[j]){
	                count++;
	                a = i;
	                b = j;
	            }
	        }
	    }
	    System.out.printf("%d\n%d %d",count,arr[a],arr[b]);

	}
}