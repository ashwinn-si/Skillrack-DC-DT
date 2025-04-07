
//! two test case failed
/*
The program must accept an integer N as the input. The program must print the first N rows of the Pascal's
triangle as shown in the Example Input/Output section. At the beginning of each row, the program must
print hyphens instead of empty spaces. Pascal's triangle is a triangular array constructed by summing
adjacent integers in preceding rows.

Input:
5

Output:
- - - - 1
- - - 1 * 1
- - 1 * 2 * 1
- 1 * 3 * 3 * 1
1 * 4 * 6 * 4 * 1
cxzczc
 */

import java.util.*;

public class Hello {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int matrix[][] = new int[N][N * 2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("- ");
                matrix[i][j] = -1;
            }
            for (int j = N - i - 1; j < N - 1 - i + (i * 2) + 1; j++) {
                if (j == N - i - 1 || j == N - 1 - i + (i * 2)) {
                    matrix[i][j] = 1;
                    if (j == N - 1 - i + (i * 2)) {
                        System.out.print("1");
                        continue;
                    }
                    System.out.print("1 ");
                } else {
                    if ((N % 2 == 1 && i % 2 == 0 && j % 2 == 1) ||
                            (N % 2 == 1 && i % 2 == 1 && j % 2 == 0) ||
                            (N % 2 == 0 && i % 2 == 1 && j % 2 == 1) ||
                            (N % 2 == 0 && i % 2 == 0 && j % 2 == 0)) {
                        System.out.print("* ");
                    } else {
                        matrix[i][j] = Math.abs(matrix[i - 1][j - 1] + matrix[i - 1][j + 1]);
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}