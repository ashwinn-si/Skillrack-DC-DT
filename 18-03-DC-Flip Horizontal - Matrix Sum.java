/*
The program must accept two integer matrices MI and M2 of size RxC as the input. The program must flip
the matrix M2 horizontally (i.e., reversing each row of the matrix). Then the program must print the sum of
integers in two matrices MI and M2 at the same positions.

Input:
33
10 20 30
40 50 60
70 80 90
100 200 300
400 500 600
700 800 900

Output:
310 220 130
640 550 460
970 880 790

Explanation:

After flipping the matrix M2 horizontally, the matrix becomes
300 200 100
600 500 400
900 800 700

The sum of integers in two matrices MI and M2 at the same positions is given below.
310 220 130
640 550 460
970 880 790
 */

import java.util.*;

public class Hello {
    static void inputGetter(int R, int C, int matrix[][], Scanner sc) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int matrix1[][] = new int[R][C];
        int matrix2[][] = new int[R][C];

        inputGetter(R, C, matrix1, sc);
        inputGetter(R, C, matrix2, sc);

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][C - j - 1] + " ");
            }
            System.out.println();
        }

    }
}