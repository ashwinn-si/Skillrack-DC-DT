/*
The program must accept a character matrix of size R*C and a string S as the input. In each column, the
program must find the cell X which contains the first occurrence of the first character of S. Then the program
must replace the characters from the cell X with the characters of S vertically in the column. If the column
has no L characters from the cell X, then the column remains the same without any change (L denotes the
length of the string S). Finally, the program must print the modified matrix as the output.

Input:
85
m i b o o
r c m y t
k t y g m
o t a c p
d x w o o
z l e a u
c k n o i
d f o z g
open

Output:
m i b o o
r c p y p
k t e g e
o t n c n
p x w o o
e l e p u
n k n e i
d f o n g
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        ArrayList<List<Character>> matrix = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (i == 0) {
                    matrix.add(new ArrayList<>(Arrays.asList(sc.next().charAt(0))));
                } else {
                    matrix.get(j).add(sc.next().charAt(0));
                }
            }
        }
        sc.nextLine();
        String str = sc.nextLine();
        int len = str.length();
        for (int i = 0; i < C; i++) {
            int index = matrix.get(i).indexOf(str.charAt(0));
            if (index != -1) {
                if (index + len - 1 < R) {
                    for (int j = 0; j < len; j++) {
                        matrix.get(i).set(index, str.charAt(j));
                        index++;
                    }
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix.get(j).get(i) + " ");
            }
            System.out.println();
        }
    }
}