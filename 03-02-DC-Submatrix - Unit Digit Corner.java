import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt();
        int matrix[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int resR = -1, resC = -1, resSum = 0;
        int digit = sc.nextInt();
        for (int i = 0; i <= R - 3; i++) {
            for (int j = 0; j <= C - 3; j++) {
                if (matrix[i + 2][j + 2] % 10 == digit) {
                    int sum = 0;
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            sum += matrix[k][l];
                        }
                    }
                    if (resSum < sum) {
                        resSum = sum;
                        resR = i;
                        resC = j;
                    }
                }
            }
        }
        if (resR == -1) {
            System.out.print("-1");
            return;
        }
        for (int i = resR; i < resR + 3; i++) {
            for (int j = resC; j < resC + 3; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}