/*
The program must accept a character matrix of size R*C representing the primary colors (R, G, B) as the
input. The value of C is always even. The program must fold the given color matrix vertically and print the
resulting colours based on the following conditions.
1) Red + Red = Red
2) Green + Green Green
3) Blue + Blue = Blue
4) Green + Blue = Cyan
5) Red + Blue = Magenta
6) Red + Green = Yellow
Note:
Cyan must be represented as C.
Magenta must be represented as M.
Yellow must be represented as Y.

Input:
5 6
R G B B G B
B R B G R G
R G R R B R
R R G R G R
G R B R R G

Output:
M G B
C R C
R C R
R Y Y
G R M
 */

import java.util.*;

public class Hello {

    static char helper(char c1, char c2) {
        if (c1 == 'R') {
            if (c2 == 'R') {
                return 'R';
            } else if (c2 == 'B') {
                return 'M';
            } else {
                return 'Y';
            }
        } else if (c1 == 'G') {
            if (c2 == 'G') {
                return 'G';
            } else {

                return 'C';

            }
        } else {
            return 'B';
        }
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        char matrix[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C / 2; j++) {
                char max = (char) Math.max(matrix[i][j], matrix[i][C - 1 - j]);
                char min = (char) Math.min(matrix[i][j], matrix[i][C - 1 - j]);
                System.out.print(helper(max, min) + " ");
            }
            System.out.println();
        }

    }
}