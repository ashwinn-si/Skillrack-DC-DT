
/*
 In a grid of size R*C, a rabbit(R) has to reach the carrot(C). The rabbit can move to the right or bottom. The
program must print if the rabbit can reach the carrot. 1 indicates a path is available in that cell and O indicates
that a path is not available through that cell.

Input:
3 4
1 0 0 0
R 1 1 0
0 1 1 C

Output:
yes
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
    int endR = -1, endC = -1, startR = -1, startC = -1;
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        char ch = sc.next().charAt(0);
        if (ch == 'R' || ch == 'C') {
          matrix[i][j] = 1;
          if (ch == 'R') {
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
    boolean visited[][] = new boolean[R][C];
    visited[startR][startC] = true;
    Queue<int[]> queue = new LinkedList<>();
    int offsets[][] = new int[][] { { 0, 1 }, { 1, 0 } };
    queue.offer(new int[] { startR, startC });

    while (!queue.isEmpty()) {
      int curr[] = queue.poll();
      if (curr[0] == endR && curr[1] == endC) {
        System.out.print("yes");
        return;
      }

      for (int i = 0; i < 2; i++) {
        int newR = curr[0] + offsets[i][0];
        int newC = curr[1] + offsets[i][1];
        if (newR >= 0 && newC < C && newR < R && newC >= 0 && !visited[newR][newC] && matrix[newR][newC] == 1) {
          queue.offer(new int[] { newR, newC });
          visited[newR][newC] = true;
        }
      }
    }
    System.out.print("no");

  }
}