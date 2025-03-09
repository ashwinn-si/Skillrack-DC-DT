import java.util.*;

public class Hello {
    static int top, bottom, left, right;
    static int matrix1[][], matrix2[][];
    static int currSum = 0;

    private static boolean isSame() {
        // boundary element accessing
        currSum = 0;
        for (int i = left; i <= right; i++) {
            if (matrix1[top][i] != matrix2[top][i])
                return false;
            currSum += matrix1[top][i];
        }

        for (int i = top + 1; i <= bottom; i++) {
            if (matrix1[i][right] != matrix2[i][right])
                return false;
            currSum += matrix1[i][right];
        }

        if (top != bottom) {
            for (int i = right - 1; i >= left; i--) {
                if (matrix1[bottom][i] != matrix2[bottom][i])
                    return false;
                currSum += matrix1[bottom][i];
            }

        }
        if (left != right) {
            for (int i = bottom - 1; i > top; i--) {
                if (matrix1[i][left] != matrix2[i][left])
                    return false;
                currSum += matrix1[i][left];
            }

        }
        return true;
    }

    private static void inputGetter(int matrix[][], int N, Scanner sc) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        matrix1 = new int[N][N];
        matrix2 = new int[N][N];
        inputGetter(matrix1, N, sc);
        inputGetter(matrix2, N, sc);

        // four pointer approach
        if (N % 2 == 1) {
            top = bottom = left = right = N / 2;
        } else {
            top = left = N / 2 - 1;
            right = bottom = N / 2;
        }

        int sum = 0;
        while (top >= 0 && bottom < N && left >= 0 && right < N) {
            if (isSame()) {
                sum += currSum;
                top--;
                left--;
                right++;
                bottom++;
            } else {
                break;
            }
        }
        if (sum == 0) {
            System.out.print("-1");
            return;
        }
        System.out.print(sum);
    }
}