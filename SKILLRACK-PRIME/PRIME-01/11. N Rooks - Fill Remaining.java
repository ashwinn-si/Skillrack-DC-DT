
/*
 * In a N*N square chessboard, certain number of rooks are placed. The program
 * must accept the positions of R
 * rooks (marked by 1). The empty squares are marked by the value O. The program
 * must fill in the remaining N-
 * R rooks with the condition that only one rook must be in a row and one rook
 * must be in a column so that the
 * rooks do not attack each other. The program must finally print the
 * arrangement of the rooks in the chessboard
 * (if multiple arrangements are possible print the possibility which occurs
 * with the left most column filled starting
 * from the top row).
 * Note: In Chess, a rook can move along a row or a column. The movement can
 * happen till the end of the
 * board is reached or another piece (like Rook, Knight, Bishop, Pawn etc is
 * encountered). But in this program
 * only the N rooks are placed and no other pieces will be present on the board.
 * 
 * Input:
 * 4
 * 1 0 0 0
 * 0 0 0 0
 * 0 0 0 1
 * 0 1 0 0
 * 
 * Output:
 * 1 0 0 0
 * 0 0 1 0
 * 0 0 0 1
 * 0 1 0 0
 */
import java.util.*;

public class Hello {
  static int N;
  static int matrix[][];

  static boolean isValid(int currR, int currC) {

    for (int col = 0; col < N; col++) {
      if (col == currC)
        continue;
      if (matrix[currR][col] == 1) {
        return false;
      }
    }

    for (int row = 0; row < N; row++) {
      if (row == currR)
        continue;
      if (matrix[row][currC] == 1) {
        return false;
      }
    }
    return true;
  }

  static boolean dfs(int currR, int currC, boolean isFilled[]) {
    matrix[currR][currC] = 1;

    if (!isValid(currR, currC)) {
      matrix[currR][currC] = 0;
      return false;
    }

    for (int row = 0; row < N; row++) {
      if (isFilled[row])
        continue;
      boolean filledFlag = false;
      for (int col = 0; col < N; col++) {
        isFilled[row] = true;
        if (dfs(row, col, isFilled)) {
          return true;
        }
        isFilled[row] = false;
      }
      if (!filledFlag) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    matrix = new int[N][N];
    boolean isFilled[] = new boolean[N];
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
      boolean filledFlag = false;
      for (int col = 0; col < N; col++) {
        isFilled[row] = true;
        if (dfs(row, col, isFilled)) {
          filledFlag = true;
          for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
          }
        }
        isFilled[row] = false;
      }

      if (!filledFlag) {
        System.out.print("Not Possible");
        return;
      }
    }

  }
}