import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();
        int top, bottom, left, right;

        if (N % 2 == 1) {
            top = bottom = left = right = N / 2;
        } else {
            top = left = (N / 2) - 1;
            bottom = right = N / 2;
        }

        int sum = 0;

        for (int j = 0; j < X; j++) {
            for (int i = left; i <= right; i++) {
                sum += matrix[top][i];
                if (top != bottom)
                    sum += matrix[bottom][i];
            }

            for (int i = top + 1; i <= bottom - 1; i++) {
                sum += matrix[i][left];
                if (left != right)
                    sum += matrix[i][right];
            }

            top--;
            bottom++;
            left--;
            right++;
        }

        System.out.print(sum);
    }
}