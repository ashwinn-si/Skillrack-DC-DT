
/*
The program must accept 6 characters and an integer N as the input. The 6 characters represent the 6
faces of a cube as given below.
*6**
4123
*5**
The integer N represents the size of each face (NXN grid) in the cube. The program must print the 6 faces of
the cube in the unfolded cube format as mentioned above. The empty spaces in the unfolded cube must be
printed as asterisks.
Boundary Condition(s):
2 N 20
Input Format:
The first line contains 6 characters separated by a space.
The second line contains N.
Output Format:
The first (3*N) lines, each contains (4*N) characters separated by a space.
Example Input/Output 1:
Input:
abcdef
3
 */
import java.util.*;

public class Hello {
    static void printer(int row, String arr[], int N) {
        for (int col = 0; col < N * 4; col++) {
            String c = "";
            if ((row >= 0 && row < N) || (row >= N * 2 && row < N * 3)) {
                if (col >= N && col < N * 2) {
                    if (row < N) {
                        c = arr[5];
                    } else {
                        c = arr[4];
                    }
                } else {
                    c = "*";
                }
            } else {
                if (col < N) {
                    c = arr[3];
                } else if (col >= N && col < N * 2) {
                    c = arr[0];
                } else if (col >= N * 2 && col < N * 3) {
                    c = arr[1];
                } else {
                    c = arr[2];
                }
            }
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        int N = sc.nextInt();

        for (int i = 0; i < N * 3; i++) {
            printer(i, arr, N);
            System.out.println();
        }
    }
}
