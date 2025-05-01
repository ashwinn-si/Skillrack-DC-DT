
/*
Largest Square Matrix - Words
The program must accept a string S containing multiple words as the input. The program must form a
largest possible square matrix of size N*N based on the following conditions.
- The words of equal length must be used to form the square matrix (i.e., each row in the matrix contains all
the characters of a word).
- The words in the given string must be used in the order of their occurrence.
Finally, the program must print the largest possible square matrix as the output. If there are two or more
such largest square matrices, the program must print the matrix with the first N words of length N as the
output. If it is not possible to form such a matrix, the program must print -1 as the output.

Example Input/Output 1:

Input:
book planet MOON earth satellite stars rocket lava Aeroplane Fuel radar

Output:
b o o k
M O O N
l a v a

Explanation:
The 4 letter words are book, MOON, lava and Fuel. These words can form a 4x4 square matrix.
The 5 letter words are earth, stars and radar. These words cannot form a square matrix.
The 6 letter words are planet and rocket. These words cannot form a square matrix.
The 9 letter words are satellite and Aeroplane. These words cannot form a square matrix.

Hence the output is
b 00k
MOON
lava
Fuel
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().strip().split(" ");
        int len = str.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int currLen = str[i].length();
            if (hash.get(currLen) == null) {
                hash.put(currLen, 1);
            } else {
                hash.put(currLen, hash.get(currLen) + 1);
            }
        }
        int maxLen = -1;
        for (int key : hash.keySet()) {
            if (key <= hash.get(key)) {
                maxLen = Math.max(key, maxLen);
            }
        }
        if (maxLen == -1) {
            System.out.print("-1");
            return;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            int currLen = str[i].length();
            if (count == maxLen) {
                return;
            }
            if (currLen == maxLen) {
                for (int j = 0; j < currLen; j++) {
                    System.out.print(str[i].charAt(j) + " ");
                }
                count++;
                System.out.println();
            }
        }
    }
}