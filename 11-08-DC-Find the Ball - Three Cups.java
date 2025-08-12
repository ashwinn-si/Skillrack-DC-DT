
/*
 * There are three cups on a table, at the positions 1, 2,
 * and 3. Initially, there is a ball hidden under the cup at
 * the position P. The program must accept N pairs of
 * integers and the value of P as the input. Each pair (X,
 * Y) represents the positions of two cups to be
 * swapped. After performing N swaps on the three cups,
 * the program must print the position of the ball as the
 * output.
 * 
 * Input:
 * 4 2
 * 1 2
 * 3 1
 * 1 2
 * 3 1
 * 
 * Output:
 * 1
 */
import java.util.*;

public class Main {
  static void swap(int nums[], int start, int end) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    sc.nextLine();
    int cups[] = new int[3];
    for (int i = 0; i < 3; i++) {
      cups[i] = i + 1;
    }
    for (int i = 0; i < N; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();
      swap(cups, start - 1, end - 1);
    }

    for (int i = 0; i < 3; i++) {
      if (cups[i] == P) {
        System.out.println(i + 1);
      }
    }
  }
}