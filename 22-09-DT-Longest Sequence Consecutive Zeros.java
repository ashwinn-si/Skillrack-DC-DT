/*
The program must accept N integers and print the integers having the longest sequence of consecutive
zeroes in their reverse order of occurrence.

Input:
5
9 10 32 65 7

Output:
65 32
 */

import java.util.*;

public class Main {
  static long findZeroMax(long num) {
    long result = 0;
    long count = 0;
    while (num > 0) {
      count = num % 10 == 1 ? 0 : count + 1;
      num /= 10;
      result = Math.max(count, count);
    }
    return result;
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long nums[] = new long[N];
    HashMap<Long, Long> hash = new HashMap<>();
    long max = 0;
    for (int index = 0; index < N; index++) {
      long num = sc.nextLong();
      hash.put(num, findZeroMax(num));
      max = Math.max(hash.get(num), max);
      nums[index] = num;
    }
    for (int index = N - 1; index >= 0; index--) {
      if (hash.get(nums[index]) == max) {
        System.out.print(nums[index] + " ");
      }
    }
  }
}
