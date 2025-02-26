import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int matrix[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int S = sc.nextInt();

        for (int i = 0; i < R - S; i++) {
            for (int j = 0; j < C - S; j++) {
                int sum = 0;
                for (int k = i; k < i + S; k++) {
                    for (int l = j; l < j + S; l++) {
                        sum += matrix[k][l];
                    }
                }
                if (sum % (S * S) == 0) {
                    for (int k = 0; k < R; k++) {
                        for (int l = 0; l < C; l++) {
                            if (k >= i && k < i + S && l >= j && l < j + S) {
                                System.out.printf("%d ", sum / (S * S));
                            } else {
                                System.out.printf("%d ", matrix[k][l]);
                            }
                        }
                        System.out.println();
                    }
                    return;

                }
            }
        }
    }
}