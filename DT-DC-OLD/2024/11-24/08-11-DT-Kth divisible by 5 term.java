/*The program must accept an integer K as the input. The program must print the Kth term in
the following series as the output.
5, 14, 19, 23, 28, 32, 37, 41, 46, and so on.
The sum of digits in each term of the above series is divisible by 5.

Input:
4

Output:
23

Explanation:
The given series is 5, 14, 19, 23, 28, 32, 37, 41, 46, and so on.
The 4 term in the series is 23. So 23 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int currNum = 5;
		while(count < N){
		    if(sumDigit(currNum)%5==0){
		       count++;
		    }
		    currNum++;
		}
		System.out.printf("%d",currNum-1);
	}
	static int sumDigit(int N){
	    int sum = 0;
	    while(N != 0){
	        sum += N%10;
	        N = N/10;
	    }
	    return sum;
	}
}