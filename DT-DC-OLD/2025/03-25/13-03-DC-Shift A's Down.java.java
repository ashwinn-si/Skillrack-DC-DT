
/*
A matrix of dimension R*C with alphabets A or B is passed as the input. The program must remove all
occurrences of B and shift the occurrences of A down. The empty cells must be replaced with hyphens.
Then the program must print the modified matrix as the output.
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int ACount[] = new int[C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (sc.next().charAt(0) == 'A') {
                    ACount[j]++;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (R - i <= ACount[j]) {
                    System.out.print("A ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }
}