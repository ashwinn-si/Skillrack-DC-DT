
/*
In a grid of size R*C, you can pick any one value from a given col. But in the next col you cannot pick a
value in the same row of the value picked in the previous col. The program must print the maximum
possible sum of the values picked from the C columns.

Input:
4 3
50 40 90
19 22 21
19 13 4
42 10 14

Output:
162
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
    int maxValue[][] = new int[C][2];

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int col = 0; col < C; col++) {
      int firstLargest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for (int row = 0; row < R; row++) {
        int addNum = col == 0 ? 0
            : matrix[row][col - 1] == maxValue[col - 1][0] ? maxValue[col - 1][1] : maxValue[col - 1][0];

        matrix[row][col] += addNum;

        if (matrix[row][col] >= firstLargest) {
          secondLargest = firstLargest;
          firstLargest = matrix[row][col];
        } else if (matrix[row][col] >= secondLargest) {
          secondLargest = matrix[row][col];
        }
      }

      maxValue[col][0] = firstLargest;
      maxValue[col][1] = secondLargest;
    }

    int result = Integer.MIN_VALUE;
    for (int i = 0; i < R; i++)
      result = Math.max(result, matrix[i][C - 1]);

    System.out.print(result);

  }
}