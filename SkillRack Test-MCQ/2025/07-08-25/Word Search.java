/*
 * Given a 2D board of characters and a word, return true if the word exists in
 * the grid. The word can be constructed from letters of sequentially adjacent
 * cells, where "adjacent" cells are horizontally or vertically neighboring. The
 * same letter cell may not be used more than once.
 * 
 * Input:
 * First: board dimensions (m n)
 * Next m lines: n characters each (the board)
 * Last line: the word to search
 * 
 * Example Input:
 * 
 * 3 4
 * A B C E
 * S F C S
 * A D E E
 * ABCCED
 * 
 * Example Output:
 * 
 * true
 */

//IMP CANT BE DONE IN BFS
class Solution {
  int R, C;
  int offsets[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
  boolean visited[][];

  boolean isValid(int currR, int currC) {
    return currR >= 0 && currR < R && currC >= 0 && currC < C;
  }

  public boolean dfs(int currR, int currC, String word, int currIndex, int N, char matrix[][]) {
    if (currIndex == N) {
      return true;
    }

    for (int index = 0; index < 4; index++) {
      int newR = currR + offsets[index][0];
      int newC = currC + offsets[index][1];
      if (isValid(newR, newC) && matrix[newR][newC] == word.charAt(currIndex) && !visited[newR][newC]) {
        visited[newR][newC] = true;
        if (dfs(newR, newC, word, currIndex + 1, N, matrix)) {
          return true;
        }
        visited[newR][newC] = false;
      }
    }
    return false;
  }

  public boolean exist(char[][] matrix, String word) {
    R = matrix.length;
    C = matrix[0].length;
    visited = new boolean[R][C];
    int N = word.length();

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == word.charAt(0)) {
          visited[i][j] = true;
          if (dfs(i, j, word, 1, N, matrix)) {
            return true;
          }
          visited[i][j] = false;
        }
      }
    }
    return false;
  }
}
