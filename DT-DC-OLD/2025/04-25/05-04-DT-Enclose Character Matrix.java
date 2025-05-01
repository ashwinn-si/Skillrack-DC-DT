
/*
The program must accept a character matrix of size R*C and an integer K as the input. The values of R and
C are always divisible by K. The program must enclose the given character matrix within sub matrices of
size K*K.
- The sub matrices in the border must be filled with Is and Os alternatively in clockwise direction. The first
sub matrix in the top left will be filled with Is.

Input:
9 6
h R W G v P
z n N L A Q
Y u q z j r
z O k w y V
D z D g x i
u e S R s t
l e p A M e
m c u a h l
q v x z p w
3

Output:
1 1 1 0 0 0 1 1 1 0 0 0 
1 1 1 0 0 0 1 1 1 0 0 0 
1 1 1 0 0 0 1 1 1 0 0 0 
0 0 0 h R W G v P 1 1 1 
0 0 0 z n N L A Q 1 1 1 
0 0 0 Y u q z j r 1 1 1 
1 1 1 z O k w y V 0 0 0 
1 1 1 D z D g x i 0 0 0 
1 1 1 u e S R s t 0 0 0 
0 0 0 l e p A M e 1 1 1 
0 0 0 m c u a h l 1 1 1 
0 0 0 q v x z p w 1 1 1 
1 1 1 0 0 0 1 1 1 0 0 0 
1 1 1 0 0 0 1 1 1 0 0 0 
1 1 1 0 0 0 1 1 1 0 0 0 
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        char matrix[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        int N = sc.nextInt();

        int embbedMatrix[][] = new int[(R / N) + 2][(C / N) + 2];

        for (int i = 0; i < (R / N) + 2; i++) {
            for (int j = 0; j < (C / N) + 2; j++) {
                if (i == 0) {
                    embbedMatrix[i][j] = j % 2 == 0 ? 1 : 0;
                } else {
                    embbedMatrix[i][j] = embbedMatrix[i - 1][j] % 2 == 0 ? 1 : 0;
                }
            }
        }

        for (int row = 0; row < R + (2 * N); row++) {
            if (row < N || row >= R + N) {
                for (int col = 0; col < C + (2 * N); col++) {
                    System.out.print(embbedMatrix[(row / N)][col / N] + " ");
                }
            } else {
                for (int col = 0; col < C + (2 * N); col++) {
                    if (col < N || col >= C + N) {
                        System.out.print(embbedMatrix[(row / N)][col / N] + " ");
                    } else {
                        System.out.print(matrix[row - N][col - N] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}