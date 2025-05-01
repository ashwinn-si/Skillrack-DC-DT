
/*
The program must accept an integer N as the input. The program must form 9 integers by converting the
given integer N to each base from 2 to 10. Then the program must print the step numbers among the
obtained 9 integers as the output. If there is no step number, then the program must print -1 as the output.
A number is called a step number if all the adjacent digits have an absolute difference of 1.

Input:
10

Output:
1010
101
12
10

Explanation:
Here N 10.
The base 2 representation of 10 is 1010.
The base 3 representation of 10 is 101.
The base 4 representation of 10 is 22.
The base 5 representation of 10 is 20.
The base 6 representation of 10 is 14.
The base 7 representation of 10 is 13.
The base 8 representation of 10 is 12.
The base 9 representation of 10 is 11.
The base 10 representation of 10 is 10.
The step numbers obtained are 1010, 101, 12 and 10. So they are printed as the output.
 */

import java.util.*;

public class Hello {
    static String helper(int N, int base) {

        StringBuilder result = new StringBuilder();
        while (true) {
            result.append(new StringBuilder(Integer.toString(N % base)));
            if (N < base) {
                break;
            }

            N /= base;
        }
        return result.reverse().toString();
    }

    static boolean isStepNumber(String N) {
        // a step number is a number whose adjacent digits difference is either 1 or -1
        int len = N.length();
        for (int i = 0; i < len - 1; i++) {
            int currDigit = N.charAt(i) - '0';
            int prevDigit = N.charAt(i + 1) - '0';
            if (Math.abs(currDigit - prevDigit) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= 10; i++) {
            String base = helper(N, i);
            if (isStepNumber(base)) {
                System.out.println(base);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("-1");
        }

    }
}