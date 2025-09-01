
/*
Four players A, B, C and D are playing a matrix game. They create a matrix of size N*N and then they fill the
matrix with the integers from 1 to N*N (starting from ISt to Nth row where left to right in each row). The player
A is sitting on the top of the matrix. The player B is sitting on the right of the matrix. The player C is sitting on
the bottom of the matrix. The player D is sitting on the left of the matrix. One of the four players rotates the
matrix 90-degree for X times in clockwise direction. The player who got the maximum edge sum is the winner
of the game. The values of N and X as the input. The program must print the name of the winner and the sum
of integers on his side of the matrix as the output.

Input:
3 2

Output:
A 24

Explanation:
Here N = 2 and X = 2.
The four players create a 3*3 matrix as given below.
1 2 3
4 5 6
7 8 9

After ISt
7 4 1
8 5 2
9 6 3

rotation(90-degree):
After 2nd rotation(90-degree):
9 8 7
6 5 4
3 2 1
Now the player A has the maximum edge sum 24 (9 + 8 + 7).
So player A is the winner of the game.

 */

import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();

    int sumEdges[] = new int[4];
    int maxElement = -1;
    int resultIndex = -1;

    for (int i = 1; i <= N; i++) {
      sumEdges[0] += i;
    }

    for (int i = 1; i <= N; i++) {
      sumEdges[1] += (i * N);
    }

    for (int i = N * (N - 1) + 1; i < N * (N - 1) + 1 + N; i++) {
      sumEdges[2] += i;
    }

    for (int i = 0; i < N; i++) {
      sumEdges[3] += i * N + 1;
    }

    for (int i = 0; i < 4; i++) {
      maxElement = Math.max(sumEdges[i], maxElement);
      if (maxElement == sumEdges[i]) {
        resultIndex = i;
      }
    }

    System.out.print((char) ('A' + (resultIndex + (X % 4)) % 4) + " " + maxElement);

  }
}