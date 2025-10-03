/*
Two string values are given as the input. The program must extract the digits in each string and form two
integers X and Y. Then the program must print the HCF (GCD) - Greatest Common Divisor of X and Y as
the output.

Input:
a2xc+4
3bzoomc6

Output:
12

Explanation:
Here and X = 24 & Y=36. Their GCD is 12.
 */

import java.util.*;

public class Main {
    static int helper(String str) {
        int result = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result = (result * 10) + (ch - '0');
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = helper(sc.nextLine());
        int N2 = helper(sc.nextLine());
        int large = Math.max(N1, N2);
        int small = Math.min(N1, N2);
        while (small != 0) {
            int temp = small;
            small = large % small;
            large = temp;
        }
        System.out.print(large);

    }
}