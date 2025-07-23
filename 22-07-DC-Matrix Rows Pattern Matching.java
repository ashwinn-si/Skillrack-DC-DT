
/*
The program must accept an integer matrix of size R*C and a string P as the input. The string P represents a
pattem for the rows of the matrix. The length of the string P is always equal to R, where each character from
left to right represents the row of the matrix from top to bottom. If a character is repeated in the string P, then
the corresponding rows in the matrix must be the same. The program must print YES if the pattern P matches
the R*C matrix. Else the program must print NO as the output.

Input:
2 8 8 3
6 8 7 2
2 8 8 3
9 6 3 4
6 8 7 2
ABACB

Output:
YES

Explanation:
Here P = 'ABACB".
ISt & 3rd alphabets are the same. Similarly, the ISt and 3rd rows of the matrix are the same.
2nd & 5th alphabets are the same. Similarly, the 2nd and 5th rows of the matrix are the same.
4th alphabet is not repeated. Similarly, the 4th row of the matrix is not repeated.
 */

import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    sc.nextLine();
    int matrix[][] = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    sc.nextLine();
    HashMap<Character, RowElement> hash = new HashMap<>();
    String str = sc.nextLine();
    int len = str.length();
    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);
      if (hash.get(ch) != null) {
        if (!hash.get(ch).compare(matrix[i])) {
          System.out.println("NO");
          return;
        }
      } else {
        for (Character hashKey : hash.keySet()) {
          if (hash.get(hashKey).compare(matrix[i])) {
            System.out.println("NO");
            return;
          }
        }
        hash.put(ch, new RowElement(C, matrix[i]));
      }
    }
    System.out.print("YES");
  }
}

class RowElement {
  int N;
  int elements[];

  RowElement(int N, int row[]) {
    this.N = N;
    this.elements = new int[N];
    for (int i = 0; i < N; i++) {
      elements[i] = row[i];
    }
  }

  boolean compare(int row[]) {
    for (int i = 0; i < this.N; i++) {
      if (elements[i] != row[i]) {
        return false;
      }
    }
    return true;
  }
}