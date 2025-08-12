
/*
 * Given an R x C matrix, print the two largest neighboring elements of an
 * element in the matrix.
 * 
 * Input:
 * 2 3
 * 10 20 30
 * 40 50 60
 * 
 * Ouput
 * 40 50
 * 60 50
 * 60 50
 * 50 20
 * 60 40
 * 50 30
 */
import java.util.*;

public class Main {
  static boolean isValid(int currR, int currC, int R, int C) {
    return currR >= 0 && currR < R && currC >= 0 && currC < C;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    int offsets[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    sc.nextLine();
    int matrix[][] = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int k = 0; k < 4; k++) {
          int newR = i + offsets[k][0];
          int newC = j + offsets[k][1];
          if (isValid(newR, newC, R, C)) {
            pq.offer(matrix[newR][newC]);
          }
        }
        System.out.println(pq.poll() + " " + pq.poll());
      }
    }

  }
}