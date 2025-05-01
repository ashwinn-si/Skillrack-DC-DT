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
        int N = sc.nextInt();
        int pointer1 = N - 1, pointer2 = N;
        while (pointer1 >= 0 && pointer2 < R) {
            for (int j = 0; j < C; j++) {
                matrix[pointer1][j] += matrix[pointer2][j];
            }
            pointer1--;
            pointer2++;
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = pointer2; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}