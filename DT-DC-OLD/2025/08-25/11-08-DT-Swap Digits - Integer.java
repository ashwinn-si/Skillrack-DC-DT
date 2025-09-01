/*
 * The program must accept an integer N and Q queries
 * as the input. Each query contains two integers X and Y
 * representing the positions of two digits in the integer
 * N. For each query (X, Y), the program must swap the
 * digits at the specified positions in the integer N. After
 * Q swaps, if the resulting integer R is equal to the given
 * integer N, then the program must print "YES". Else the
 * program must print the value of 2*R.
 * 
 * Input:
 * 1234
 * 6
 * 1 3
 * 1 4
 * 2 4
 * 2 3
 * 1 4
 * 1 2
 * 
 * Output:
 * YES
 * 
 * Explanation:
 * Here N = 1234.
 * ISt swap: 1 3 -> 3214
 * 2nd swap: 1 4 -> 4213
 * 3rd swap: 2 4 -> 4312
 * 4th swap: 2 3 -> 4132
 * 5th swap: 1 4 -> 2134
 * 6th swap: 1 2 -> 1234
 * After 6 swaps, the resulting integer R
 * equal to N.
 * Hence YES is printed as the output.
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] nums = sc.nextLine().toCharArray();
    char[] cpy = nums.clone();

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int start = sc.nextInt() - 1;
      int end = sc.nextInt() - 1;

      char temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
    }

    if (Arrays.equals(nums, cpy)) {
      System.out.println("YES");
    } else {
      System.out.println(Integer.parseInt(new String(nums)) * 2);
    }

  }
}
