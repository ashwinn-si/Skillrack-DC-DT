/*The program must accept N integers as the input The program must prepend the minimum
number of leading zeroes to the binary representations of the N integers so that the binary
representation of the each integer contains the same number of bits including the leading
zeroes. Finally, the program must print the revised binary representations of the N integers.

Input
4
2 7 10 3

Output
0010 0111 1010 0011

Explanation:
Here N = 4 and the four integers are 2, 7, 10 and 3.
The largest integer is 10 whose binary representation is 1010.
The number of bits in 1010 is 4.
For the ISt integer 2, two zeroes are padded. So 0010 is printed.
For the 2nd integer 7, one zero is padded. So 0111 is printed.
For the 3rd integer IO, no zeroes are padded. So 1010 is printed.
For the 4th integer 3, two zeroes are padded. So 0011 is printed.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String binaryString[] = new String[N];
		int largestLen=Integer.MIN_VALUE;
		for(int i = 0 ; i < N ; i++){
		    binaryString[i]=Integer.toBinaryString(sc.nextInt());
		    if(largestLen < binaryString[i].length()){
		        largestLen = binaryString[i].length();
		    }
		}
		
		for(int i = 0 ; i < N ; i++){
		    int extra = largestLen - binaryString[i].length();
		    for(int j =0 ; j < extra ; j++){
		        System.out.printf("0");
		    }
		    System.out.printf("%s ",binaryString[i]);
		}

	}
}