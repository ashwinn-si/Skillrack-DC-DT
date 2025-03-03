import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        int len = str.length();
        char matrix[][] = new char[len + N - 1][len + len - 1];
        for (int k = 0; k < N; k++) {
            int pointer = 0;
            int leftPointerRow = k, rightPointerRow = k, leftPointerCol = 0, rightPointerCol = len + len - 2;
            while (pointer < len) {
                matrix[leftPointerRow][leftPointerCol] = str.charAt(pointer);
                matrix[rightPointerRow][rightPointerCol] = str.charAt(pointer);
                leftPointerRow++;
                leftPointerCol++;
                rightPointerRow++;
                rightPointerCol--;
                pointer++;
            }
        }
        for (int i = 0; i < len + N - 1; i++) {
            for (int j = 0; j < len + len - 1; j++) {
                if ((matrix[i][j] >= 'a' && matrix[i][j] <= 'z') || (matrix[i][j] >= 'A' && matrix[i][j] <= 'Z')
                        || (matrix[i][j] >= '1' && matrix[i][j] <= '9')) {
                    System.out.printf("%c", matrix[i][j]);
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }

    }
}