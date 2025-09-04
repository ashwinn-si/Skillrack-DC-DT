
/*
In a N*N square chessboard, certain number of bishops are placed. The program must accept the positions of
B bishops(marked by 1). The empty squares are marked by the value O. The program must fill in the
remaining N-B bishops with the condition that only one bishop must be in a row and one bishop must be in a
column so that the bishops do not attack each other. The program must finally print the arrangement of the
bishops in the chessboard (if multiple arrangements are possible print the possibility which occurs with the left
most column filled starting from the top row). If such an arrangement is not possible, then the program must
print NotPossible as the output.
Note: In Chess, a bishop can move diagonally. The movement can happen till the end of the board is reached
or another piece (like Rook, Knight, Bishop, Pawn etc is encountered). But in this program only the N bishops
are placed and no other pieces will be present on the board.

Input:
4
1 0 0 0
0 0 0 0
0 0 0 1
0 1 0 0

Output:
1 0 0 0
1 0 0 0
0 0 0 1
0 1 0 0
 */
import java.util.*;

public class Hello {
  static int N;
  static int matrix[][];

  static boolean helper(int currR, int currC, int incR, int incC) {
    while (currR >= 0 && currR < N && currC >= 0 && currC < N) {
      if (matrix[currR][currC] == 1) {
        return false;
      }
      currR += incR;
      currC += incC;
    }
    return true;
  }

  static boolean checker(int currI, int currJ) {
    return (helper(currI + 1, currJ + 1, 1, 1) &&
        helper(currI + 1, currJ - 1, 1, -1) &&
        helper(currI - 1, currJ + 1, -1, 1) &&
        helper(currI - 1, currJ - 1, -1, -1));
  }

  static boolean dfs(int currR, int currC, boolean isFilled[]) {
    matrix[currR][currC] = 1;

    if (!checker(currR, currC)) {
      matrix[currR][currC] = 0; // undo if invalid right away
      return false;
    }

    for (int row = 0; row < N; row++) {
      if (isFilled[row])
        continue;
      for (int col = 0; col < N; col++) {
        isFilled[row] = true;
        if (dfs(row, col, isFilled)) {
          return true;
        }
        isFilled[row] = false;
      }
      // if we reached here, this unfilled row can't be solved with current placement
      matrix[currR][currC] = 0; // backtrack current placement before failing
      return false;
    }
    // no more unfilled rows -> success
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    sc.nextLine();
    boolean isFilled[] = new boolean[N];
    matrix = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        matrix[i][j] = sc.nextInt();
        if (matrix[i][j] == 1)
          isFilled[i] = true;
      }
    }

    for (int row = 0; row < N; row++) {
      if (isFilled[row])
        continue;
      boolean flag = false;
      for (int col = 0; col < N; col++) {
        isFilled[row] = true;
        if (dfs(row, col, isFilled)) {
          for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
          }
          return;
        }
        isFilled[row] = false;
      }
      if (!flag) {
        System.out.print("NotPossible");
        return;
      }
    }
    // if all rows already filled and valid
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
