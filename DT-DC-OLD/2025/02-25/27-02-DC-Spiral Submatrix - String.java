import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char matrix[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String str = sc.nextLine();
        int offsets[][] = new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 },
                { -1, 1 } };

        for (int i = 0; i <= R - 3; i++) {
            for (int j = 0; j <= C - 3; j++) {
                int midRow = i + 1;
                int midCol = j + 1;
                int pointer = 0;
                // boolean flag = true;

                if (matrix[midRow][midCol] != str.charAt(0))
                    continue;

                for (int offsetNo = 0; offsetNo < 8; offsetNo += 2) {
                    String currString = "";
                    currString += matrix[midRow][midCol];
                    for (int l = offsetNo; l < offsetNo + 8; l++) {
                        int k = l % 8;
                        char ch = matrix[midRow + offsets[k][0]][midCol + offsets[k][1]];
                        currString += ch;
                    }
                    if (currString.equals(str)) {
                        System.out.print("YES");
                        return;
                    }
                }

                // System.out.println(currentString);
            }
        }
        System.out.print("NO");
    }
}