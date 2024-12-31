/*The program must accept two integers N and K as the input The must form a string S
based on the following conditions-
• Initially, the string S contains the binary representation of N without any leading zeroes.
- Then the program must concatenate the reverse of S to the string S.
- Then the program must insert the character '1' at the middle of the string S,
- Similarly, the must expand the string S by corxatenating its reverse inserting • I •
at the middle until the length of S reaches K.
Finally, the program must print the Kth character in the string S.

Input
12 13

Explanation:
Here N 12 K 13_
The binary representation Of 12 is f 1100.
So the string S = 1100.
After concatenating its reverse. the string becomes 11000011.
After inserting the character  1 at the middle, the string becomes 110010011.
The 13th character in S is O which is printed as the output

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String bin = Integer.toBinaryString(sc.nextInt());
      int K = sc.nextInt();
      while(bin.length() < K){
        bin = bin + "1" + new StringBuilder(bin).reverse().toString();
      }
      System.out.print(bin.charAt(K-1));
  }
}