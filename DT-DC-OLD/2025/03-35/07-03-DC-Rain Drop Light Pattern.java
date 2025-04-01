import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int T = sc.nextInt();
        sc.nextLine();
        int matrix[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int index[] = new int[C];
        for (int i = 0; i < C; i++) {
            int shiftTime = sc.nextInt();
            index[i] = R - ((T / shiftTime) % R);
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%d ", matrix[index[j] % R][j]);
                index[j]++;
            }
            System.out.println();
        }
    }
}