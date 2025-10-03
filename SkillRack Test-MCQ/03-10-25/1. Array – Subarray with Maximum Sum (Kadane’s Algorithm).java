/*
Given an array of integers, find the maximum possible sum of a contiguous subarray.
Input Format :
- First line: integer N (size of array)
- Second line: N integers (array elements)
Constraints:
- 1 ≤ N ≤ 10^5
- –10^4 ≤ arr[i] ≤ 10^4
Output Format:
- Print the maximum subarray sum.
Test Cases:
Input:
5
-2 1 -3 4 -1
Output:
4

Input:
6
5 4 -1 7 8 -2
Output:
23
 */

import java.util.*;

class Main {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int nums[] = new int[N];
    for (int index = 0; index < N; index++) {
      nums[index] = sc.nextInt();
    }

    int maxValue = nums[0];
    for (int num : nums) {
      maxValue = Math.max(maxValue, num);
    }
    int currSum = 0;
    for (int num : nums) {
      if (currSum < 0) {
        currSum = 0;
      }
      currSum += num;
      maxValue = Math.max(currSum, maxValue);
    }
    System.out.println(maxValue);
    sc.close();
  }
}
