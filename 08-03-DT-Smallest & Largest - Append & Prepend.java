/*

The program must accept N integers as the input. For each integer X among the N integers, the program
must find the smallest digit and the largest digit in X. Then the program must append(inserting at the end)
the smallest digit to X and prepend(inserting at the beginning) the largest digit to X. Finally, the program
must print the sum of the N modified integers as the output.


Example Input/Output 1:

Input:
4
1234 405 12088 15

Output:
8592422

Explanation:
Here N = 4.
ISt integer 1234 -> 412341
2nd integer 405 -> 54050
3rd integer 12088 8120880
4th integer 15 5151
The sum of the 4 modified values is 8592422.
So 8592422 is printed as the output.

 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int copyNum = num;
            int maxDigit = Integer.MIN_VALUE, minDigit = Integer.MAX_VALUE;
            while (copyNum > 0) {
                int digit = copyNum % 10;
                copyNum /= 10;
                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);
            }
            int len = (int) ((Math.log10(num)));
            num += (int) (maxDigit * Math.pow(10, len + 1));
            num = num * 10 + minDigit;

            result += num;
        }
        System.out.print(result);

    }
}