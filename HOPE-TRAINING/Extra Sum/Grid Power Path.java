/*
 * Try this program ->
 * In a grid, a boy B has N power points. He must reach the magical wand 'W'.
 * During his course of reaching the magical band, his power points will be
 * deducted if a cell has a positive integer value. Print if the boy can reach
 * the magical wand with the N power points. The boy can travel to left, right,
 * top or bottom cells. He must visit each cell only once during his course. If
 * the power points becomes negative, he cannot travel further.
 * 
 * Example Input/Output 1:
 * Input:
 * 5 6
 * 0 B 1 1 1 1
 * 1 1 0 0 1 0
 * 1 0 1 0 0 0
 * 0 1 0 1 0 4
 * 0 1 1 1 0 W
 * 2
 * 
 * Output:
 * yes
 * 
 * Example Input/Output 2:
 * Input:
 * 5 6
 * 0 B 1 1 1 1
 * 1 1 0 0 1 0
 * 1 0 1 0 0 0
 * 0 1 0 1 0 4
 * 0 1 1 1 0 W
 * 1
 * 
 * Output:
 * no
 */

import java.util.Scanner;

public class Main {
  static int R, C;
  static boolean dfsTerminationFlag = false;
  static int[][] offsets = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
  static boolean visited[][];

  static boolean isValid(int currR, int currC) {
    return currR >= 0 && currR < R && currC >= 0 && currC < C;
  }

  static void dfs(int currR, int currC, int availablePower, int targetR, int targetC, int matrix[][]) {
    if (availablePower < 0) {
      return;
    }
    if (currR == targetR && currC == targetC) {
      dfsTerminationFlag = true;
      return;
    }

    for (int index = 0; index < 4; index++) {
      int newR = currR + offsets[index][0];
      int newC = currC + offsets[index][1];
      if (isValid(newR, newC) && !visited[newR][newC] && availablePower - matrix[newR][newC] >= 0) {
        visited[newR][newC] = true;
        dfs(newR, newC, availablePower - matrix[newR][newC], targetR, targetC, matrix);
        if (dfsTerminationFlag) {
          return;
        }
        visited[newR][newC] = false;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    R = sc.nextInt();
    C = sc.nextInt();
    visited = new boolean[R][C];
    sc.nextLine();
    int matrix[][] = new int[R][C];
    int sourceR = -1, sourceC = -1, targetR = -1, targetC = -1;
    for (int r = 0; r < R; r++) {
      for (int c = 0; c < C; c++) {
        String val = sc.next();
        if (val.equals("B")) {
          sourceR = r;
          sourceC = c;
          matrix[r][c] = 0;
        } else if (val.equals("W")) {
          targetR = r;
          targetC = c;
          matrix[r][c] = 0;
        } else {
          matrix[r][c] = Integer.parseInt(val);
        }
      }
    }
    int availablePower = sc.nextInt();

    if (sourceR == -1 || targetR == -1) {
      System.out.println("no");
      return;
    }

    visited[sourceR][sourceC] = true;
    dfs(sourceR, sourceC, availablePower, targetR, targetC, matrix);
    System.out.println(dfsTerminationFlag ? "yes" : "no");
  }
}