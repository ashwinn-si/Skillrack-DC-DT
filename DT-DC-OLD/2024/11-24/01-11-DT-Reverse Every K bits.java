/*
The program must accept two integers N and K as
the input The program must reverse every K bits
from right to lett in the binary representation of N.
If the number of bits in the last set is less than K,
then reverse the remaining bits for the last set
Finally, the program must print the decimal
equivalent of the modified binary representation of
N as the output.

Input:
153 3

Output:
116
Explanation:
The binary representation of 153 is 10011001.
After reversing every 3 bits from right to left, the
binary representation becomes 01110100.
The decimal equivalent of 01110100 is 116.
So 116 is printed as the output.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        StringBuffer binary = new StringBuffer(Integer.toBinaryString(N));
        int len = binary.length();

        StringBuffer answerString = new StringBuffer();
        for (int i = 0; i < len; i += K) {
          
            StringBuffer segment = new StringBuffer(binary.substring(i, Math.min(i + K, len)));
    
            answerString.insert(0,segment);
        }
        System.out.println(answerString);

        int result = Integer.parseInt(answerString.toString(), 2);
        System.out.println(result);
    }
}