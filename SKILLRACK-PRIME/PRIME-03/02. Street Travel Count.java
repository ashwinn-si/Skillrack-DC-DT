//IMP TLE
/*
Mr.X has a bike and is travelling in a town which has N horizontal (West to East direction) and N vertical
(North to South direction) streets. At the meeting junctions of these horizontal and vertical streets there may
be a block. If there is a block Mr.X can take diversion to any other street and travel to his destination. A value
of 1 indicates that a junction (meeting point of two roads) is NOT blocked and a value of O indicates that a
junction is blocked. The streets are numbered from O to N-1 (similar to array indices). The source (starting
junction of Mr.X and the destination junctions details are passed as the input. The program must print the
number of streets through which Mr.X must travel to travel from the source to destination.

Input:
3
1 0 1
1 0 1
1 1 1
0 0
0 2

Output:
3
 */

import java.util.*;

public class Hello {
  static int matrix[][];
  static int N;
  static boolean visited[][];
  static List<Offset> offsets;

  static boolean isValid(int newR, int newC) {
    return newR >= 0 && newR < N && newC >= 0 && newC < N;
  }

  static int dfs(int currR, int currC, char dir, int endR, int endC, int streetCount) {
    if (currR == endR && currC == endC) {
      return streetCount;
    }

    int result = Integer.MAX_VALUE;
    for (int index = 0; index < 4; index++) {
      Offset obj = offsets.get(index);
      int newR = currR + obj.rowInc;
      int newC = currC + obj.colInc;
      int newCount = dir == obj.dir ? streetCount : streetCount + 1;
      if (isValid(newR, newC) && !visited[newR][newC] && matrix[newR][newC] == 1) {
        visited[newR][newC] = true;
        result = Math.min(result, dfs(newR, newC, obj.dir, endR, endC, newCount));
        visited[newR][newC] = false;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    matrix = new int[N][N];
    visited = new boolean[N][N];
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < N; col++) {
        matrix[row][col] = sc.nextInt();
      }
    }

    int startR = sc.nextInt();
    int startC = sc.nextInt();
    sc.nextLine();

    int endR = sc.nextInt();
    int endC = sc.nextInt();

    if (matrix[startR][startC] == 0) {
      System.out.println("-1");
      return;
    }

    offsets = new ArrayList<>();
    offsets.add(new Offset(1, 0, 'h'));
    offsets.add(new Offset(-1, 0, 'h'));
    offsets.add(new Offset(0, 1, 'v'));
    offsets.add(new Offset(0, -1, 'v'));

    System.out.println(dfs(startR, startC, 's', endR, endC, 0));
  }
}

class Offset {
  int rowInc, colInc;
  char dir;

  Offset(int rowInc, int colInc, char dir) {
    this.rowInc = rowInc;
    this.colInc = colInc;
    this.dir = dir;
  }
}
