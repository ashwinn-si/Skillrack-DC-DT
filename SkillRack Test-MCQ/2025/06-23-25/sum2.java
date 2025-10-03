/*
The program must accept a matrix of size N*N and scale down the matrix. The matrix can be scaled down if the value in the sub-matrix
of size K are equal and thus can be represented by just that equal value. If the matrix cannot be scaled down
, then print the original matrix as such

Input
6
0 0 1 1 0 0
0 0 1 1 0 0
1 1 1 1 1 1
1 1 1 1 1 1
1 1 0 0 0 0
1 1 0 0 0 0

Output
0 1 0
1 1 1
1 0 0
 */

import java.util.Scanner;

public class sum2 {
  static boolean helper(int N, int K, int matrix[][]) {
    for (int i = 0; i < N; i += K) {
      for (int j = 0; j < N; j += K) {
        for (int l = i; l < i + K; l++) {
          for (int m = j; m < j + K; m++) {
            if (matrix[l][m] != matrix[i][j]) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    int matrix[][] = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int K = N / 2; K >= 0; K--) {
      if (helper(N, K, matrix)) {
        for (int i = 0; i < N; i += K) {
          for (int j = 0; j < N; j += K) {
            System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
        }
      }
    }
  }
}
