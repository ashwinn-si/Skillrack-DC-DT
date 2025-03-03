import java.util.*;

public class Hello {
    static int helper(int A, int B) {
        if (B == 0) {
            return A;
        }
        return helper(B, A % B);
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int matrix1[][] = new int[R1][C1];
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        int matrix2[][] = new int[R2][C2];
        for (int i = 0; i < R2; i++) {
            for (int j = 0; j < C2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Math.min(R1, R2); i++) {
            for (int j = 0; j < Math.min(C1, C2); j++) {
                System.out.printf("%d ", helper(matrix1[i][j], matrix2[i][j]));
            }
            System.out.println();
        }
    }
}