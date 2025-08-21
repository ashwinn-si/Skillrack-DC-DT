
//IMP 3 TC FAILED
import java.util.*;

public class Hello {

  static void helperNonEqualMatrix(int R, int C, char matrix[][]) {
    boolean isRowCondition = R > C;
    int stC = 0;
    int endC = 0;

    if (!isRowCondition) {
      endC = C - R;
    }

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (stC <= j && j <= endC) {
          System.out.print(matrix[i][j] + " ");
        } else {
          System.out.print("* ");
        }
      }
      if (isRowCondition) {
        if (i < R / 2) {
          endC++;
        } else {
          stC++;
          endC++;
        }
      } else {
        stC++;
        endC++;
      }
      System.out.println();
    }
  }

  static void helperEqualMatrix(int R, int C, char matrix[][]) {
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (i != j) {
          System.out.print("* ");
        } else {
          System.out.print(matrix[i][j] + " ");
        }
      }
      System.out.println();
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

    if (R == C) {
      helperEqualMatrix(R, C, matrix);
    } else {
      helperNonEqualMatrix(R, C, matrix);
    }

  }
}