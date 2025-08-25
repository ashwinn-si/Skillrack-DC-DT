
/*
In a grid, a boy B has N power points. He must reach the magical wand W'. During his course of reaching the
magical band, his power points will be deducted if a cell has a positive integer value. Print if the boy can reach
the magical wand with the N power points. The boy can travel to left, right, top or bottom cells. He must visit
each cell only once during his course. If the power points becomes negative, he cannot travel further.


Input:
5 6
O B 1 1 1 1
1 1 0 0 1 0
1 0 1 0 0 0
0 1 0 1 0 4
0 1 1 1 0 W
2

Output:
yes
 */

import java.util.*;

public class Hello {
  static int R;
  static int C;
  static int offsets[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
  static boolean visited[][];

  static boolean isValid(int row, int col) {
    return row >= 0 && row < R && col >= 0 && col < C;
  }

  static boolean dfs(int currR, int currC, int matrix[][], int currPower, int targetR, int targetC) {
    if (currR == targetR && currC == targetC)
      return true;

    for (int i = 0; i < 4; i++) {
      int newR = currR + offsets[i][0];
      int newC = currC + offsets[i][1];
      if (isValid(newR, newC) && !visited[newR][newC] && currPower - matrix[newR][newC] >= 0) {
        visited[newR][newC] = true;
        if (dfs(newR, newC, matrix, currPower - matrix[newR][newC], targetR, targetC)) {
          return true;
        }
        visited[newR][newC] = false;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    R = sc.nextInt();
    C = sc.nextInt();
    sc.nextLine();
    int matrix[][] = new int[R][C];
    int startR = -1, startC = -1, endR = -1, endC = -1;
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        char ch = sc.next().charAt(0);
        if (ch == 'B' || ch == 'W') {
          matrix[i][j] = 0;
          if (ch == 'B') {
            startR = i;
            startC = j;
          } else {
            endR = i;
            endC = j;
          }
        } else {
          matrix[i][j] = ch - '0';
        }
      }
    }

    int P = sc.nextInt();

    if (startR == -1 || endR == -1) {
      System.out.print("no");
      return;
    }

    visited = new boolean[R][C];

    if (dfs(startR, startC, matrix, P, endR, endC)) {
      System.out.print("yes");
      return;
    }

    System.out.print("no");

  }
}
