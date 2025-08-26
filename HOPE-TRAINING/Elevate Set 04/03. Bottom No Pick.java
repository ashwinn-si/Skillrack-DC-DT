
/*
 In a grid of size R*C, you can pick any one value from a given row. But in the next row you cannot pick a
value in the same column of the value picked in the previous row. The program must print the maximum
possible sum of the values picked from the R rows.

Input:
3 4
50 19 19 42
40 22 13 10
90 21 4 14

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
    int maxValues[][] = new int[R][2];

    for (int row = 0; row < R; row++) {
      int firstLargest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for (int col = 0; col < C; col++) {
        matrix[row][col] = sc.nextInt();

        int addNum = row == 0 ? 0
            : matrix[row - 1][col] == maxValues[row - 1][0] ? maxValues[row - 1][1] : maxValues[row - 1][0];

        matrix[row][col] += addNum;

        if (matrix[row][col] >= firstLargest) {
          secondLargest = firstLargest;
          firstLargest = matrix[row][col];
        } else if (matrix[row][col] > secondLargest) {
          secondLargest = matrix[row][col];
        }
      }

      maxValues[row][0] = firstLargest;
      maxValues[row][1] = secondLargest;
    }

    int result = Integer.MIN_VALUE;
    for (int i = 0; i < C; i++)
      result = Math.max(result, matrix[R - 1][i]);

    System.out.print(result);

  }
}