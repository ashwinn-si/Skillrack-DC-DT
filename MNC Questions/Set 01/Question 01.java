/*
Invalid Mobile Numbers

The program must accept a list of mobile numbers (in separate lines) as the input. The character q or Q
represents the end of the input. The program must print the number of invalid mobile numbers among the
given list of mobile numbers as the output. A valid mobile number contains exactly 10 digits.

Boundary Condition(s):
1 Length of each string 20

Input Format:
The lines, each contains a string value.

Output Format:
The first line contains the number of invalid mobile numbers.

Example Input/Output 1:
Input:
9854653221
997878A1576
9992224578
999225789900
986578989B
817524990

Output:
4

Explanation:
The 4 invalid mobile numbers are given below.
997878A1576
999225789900
986578989B
817524990
Hence the output is 4.
 */

 import java.util.*;

public class Hello {
    static boolean helper(String str, int len) {
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            String str = sc.nextLine().strip();
            if (str.equals("Q") || str.equals("q")) {
                System.out.print(count);
                return;
            }
            int len = str.length();
            if (len != 10 || helper(str, len)) {
                count++;
            }
        }

    }
}