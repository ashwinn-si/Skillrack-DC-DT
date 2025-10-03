/*
 * Given a matrix where 0 represents a path and 1 represents a blocked cell,
 * print the length of the shortest path from 'R' (start) to 'C' (destination).
 * Cells marked 'R' and 'C' are guaranteed to be on the border. You may move up,
 * down, left, or right.
 * 
 * Input:
 * Matrix as rows of space-separated values. Use 'R' for start, 'C' for
 * destination, zero for open path, one for blocked.
 * 
 * Example Input:
 * 4 5
 * 1 0 1 0 1
 * R 0 1 0 0
 * 0 0 1 1 0
 * 0 0 0 0 C
 * 
 * Example Output:
 * 7
 */

import java.util.*;

public class Main {
  static int R;
  static int C;
  static int result;
  static int offsets[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
  static boolean visited[][];

  static boolean isValid(int currR, int currC) {
    return currR >= 0 && currR < R && currC >= 0 && currC < C;
  }

  static void dfs(int currR, int currC, int targetR, int targetC, int matrix[][], int steps) {
    if (currR == targetR && currC == targetC) {
      result = Math.min(steps, result);
    }
    for (int index = 0; index < 4; index++) {
      int newR = offsets[index][0] + currR;
      int newC = offsets[index][1] + currC;
      if (isValid(newR, newC) && matrix[newR][newC] != 1 && !visited[newR][newC]) {
        visited[newR][newC] = true;
        dfs(newR, newC, targetR, targetC, matrix, steps + 1);
        visited[newR][newC] = false;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    R = sc.nextInt();
    C = sc.nextInt();
    result = Integer.MAX_VALUE;
    sc.nextLine();
    int matrix[][] = new int[R][C];
    visited = new boolean[R][C];
    int startR = -1, startC = -1, endR = -1, endC = -1;
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        char ch = sc.next().charAt(0);
        if (ch == 'R') {
          startR = i;
          startC = j;
        } else if (ch == 'C') {
          endR = i;
          endC = j;
        } else {
          matrix[i][j] = ch - '0';
        }
      }
    }
    visited[startR][startC] = true;
    dfs(startR, startC, endR, endC, matrix, 0);
    System.out.println(result + 1);
  }
}

// BFS

// import java.util.*;

// public class Main {
// static int R, C;
// static int offsets[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0
// } };
// static boolean visited[][];

// static boolean isValid(int currR, int currC) {
// return currR >= 0 && currR < R && currC >= 0 && currC < C;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// R = sc.nextInt();
// C = sc.nextInt();
// sc.nextLine();
// int matrix[][] = new int[R][C];
// visited = new boolean[R][C];
// int startR = -1, startC = -1, endR = -1, endC = -1;
// for (int i = 0; i < R; i++) {
// for (int j = 0; j < C; j++) {
// char ch = sc.next().charAt(0);
// if (ch == 'R') {
// startR = i;
// startC = j;
// } else if (ch == 'C') {
// endR = i;
// endC = j;
// } else {
// matrix[i][j] = ch - '0';
// }
// }
// }
// visited[startR][startC] = true;
// Queue<Coor> queue = new LinkedList<>();
// queue.offer(new Coor(startR, startC, 1));
// while (!queue.isEmpty()) {
// Coor currCoor = queue.poll();
// if (currCoor.row == endR && currCoor.col == endC) {
// System.out.println(currCoor.step);
// return;
// }
// for (int i = 0; i < 4; i++) {
// int newR = offsets[i][0] + currCoor.row;
// int newC = offsets[i][1] + currCoor.col;
// if (isValid(newR, newC) && !visited[newR][newC] && matrix[newR][newC] != 1) {
// visited[newR][newC] = true;
// queue.offer(new Coor(newR, newC, currCoor.step + 1));
// }
// }
// }
// System.out.println("-1");
// }
// }

// class Coor {
// int row, col, step;

// Coor(int row, int col, int step) {
// this.row = row;
// this.col = col;
// this.step = step;
// }
// }