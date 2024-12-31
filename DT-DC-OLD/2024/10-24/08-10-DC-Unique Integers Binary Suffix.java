/*The program must accept an integer N as the input. The program must print the unique
integers that are formed by converting the suffixes in the binary representation of N to decimal
values. The unique integers must be printed in ascending order.

Input:
12

Output:
0 4 12

Explanation:
Here N = 12.
The binary representation of 12 is 1100.
The suffixes in the binary representation of 12 are O, 00, 100 and 1100.
The unique integers that are formed by converting the above suffixes are O , 4 and 12.
So the integers O , 4 and 12 are printed in ascending order.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		Long N=sc.nextLong();
		String binaryString=Long.toBinaryString(N);
		TreeSet<Long> hash=new TreeSet<>();
		for(int i=0;i<binaryString.length();i++){
		    hash.add(Long.parseLong(binaryString.substring(binaryString.length()-1-i),2));
		}
		for(Long i:hash){
		    System.out.printf("%d ",i);
		}
	}
}