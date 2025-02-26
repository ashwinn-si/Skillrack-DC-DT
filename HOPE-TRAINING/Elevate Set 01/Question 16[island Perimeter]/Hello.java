import java.util.*;

public class Hello {
    static boolean helper2(int i, int j, int R, int C, int incR, int incC, int matrix[][]) {
        return (i + incR >= 0 && i + incR < R && j + incC >= 0 && j + incC < C && matrix[i + incR][j + incC] == 0);
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int matrix[][] = new int[R][C];
        sc.nextLine();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1) {
                    if (helper2(i, j, R, C, 0, 1, matrix)) {
                        count++;
                    }
                    if (helper2(i, j, R, C, 1, 0, matrix)) {
                        count++;
                    }
                    if (helper2(i, j, R, C, -1, 0, matrix)) {
                        count++;
                    }
                    if (helper2(i, j, R, C, 0, -1, matrix)) {
                        count++;
                    }
                    if (i == 0) {
                        count++;
                    }
                    if (i == R - 1) {
                        count++;
                    }
                    if (j == 0) {
                        count++;
                    }
                    if (j == C - 1) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);

    }
}