import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt();
        char matrix[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        int K = sc.nextInt();
        for (int i = 0; i <= R - K; i++) {
            for (int j = 0; j <= C - K; j++) {
                char ch = '0';
                boolean flag = true;
                for (int k = i; k < i + K; k++) {
                    for (int l = j; l < j + K; l++) {
                        if (ch == '0') {
                            ch = matrix[k][l];
                        } else {
                            if (ch <= matrix[k][l]) {
                                ch = matrix[k][l];
                            } else {
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    System.out.print("YES");
                    return;
                }

            }
        }
        System.out.print("NO");
    }
}