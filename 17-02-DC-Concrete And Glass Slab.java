/*
The program must accept a character matrix of size R*C containing "=" and "-" as the input. The character
"=" represents a concrete slab and the character "-" represents a glass slab. If an iron ball falls on a glass
slab, then it will break the glass and continue to fall. The iron ball stops falling when it falls on a concrete
slab, but if the iron ball falls directly on a concrete slab without breaking any glass before, then the concrete
slab will break and continue to fall till the next occurring concrete slab in that column. If a slab is broken, the
program must replace the corresponding character with the character "x". Finally, the program must print the
modified matrix representing the state of R*C slabs as the output.
 */

import java.util.*;

public class Hello {

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

        // = -> concrete slab | - -> glass slab
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                if (i == 0) {
                    if (matrix[i][j] == '=') {
                        matrix[i][j] = 'x';
                        continue;
                    }
                }
                if (matrix[i][j] == '=') {
                    break;
                }
                matrix[i][j] = 'x';
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}