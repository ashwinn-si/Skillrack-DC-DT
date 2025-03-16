import java.util.*;

public class Hello {
    static int R, C;
    static Integer dp[][];
    static int matrix[][];

    static boolean isValid(int currR, int currC) {
        return 0 <= currR && currR < R && 0 <= currC && currC < C;
    }

    static int dfs(int currR, int currC) {
        if (!isValid(currR, currC) || matrix[currR][currC] == 1) {
            return 0;
        }

        if (currR == R - 1 && currC == C - 1) {
            return 1;
        }

        if (dp[currR][currC] != null) {
            return dp[currR][currC];
        }

        int right = dfs(currR, currC + 1);
        int bottom = dfs(currR + 1, currC);

        dp[currR][currC] = right + bottom;
        return right + bottom;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        matrix = new int[R][C];
        dp = new Integer[R][C];
        sc.nextLine();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print(dfs(0, 0));

    }
}