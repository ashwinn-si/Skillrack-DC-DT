/*
Submatrix Sum - Integers Start with D

The program must accept an integer matrix of size R*C and two integers K, D as the input. D represents a
non-zero digit. The program must print the sum of all the integers present in the first occurring K*K
submatrix where each integer starts with the digit D. If there is no such submatrix, the program must print -1
as the output.

Example Input/Output 1:

Input:
12 57 23 22 61
64 45 52 51 19
25 55 55 53 40
45 65 84 68 81
25

Output:
211

Explanation:
Here K = 2 and D = 5.
The only 2*2 submatrix where each integer starts with 5 is given below.
52 51
55 53
The sum of integers in the above 2*2 submatrix is 211, which is printed as the output.
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int matrix[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        int K = sc.nextInt();
        int D = sc.nextInt();

        for (int i = 0; i <= R - K; i++) {
            for (int j = 0; j <= C - K; j++) {
                boolean validFlag = true;
                int sum = 0;

                for (int k = i; k < i + K; k++) {
                    for (int l = j; l < j + K; l++) {
                        int digit = matrix[k][l];
                        while (digit >= 10) {
                            digit /= 10;
                        }
                        if (digit != D) {
                            validFlag = false;
                            break;
                        }
                        sum += matrix[k][l];
                    }
                    if (!validFlag) {
                        break;
                    }
                }
                if (validFlag) {
                    System.out.print(sum);
                    return;
                }
            }
        }
        System.out.print("-1");

    }
}