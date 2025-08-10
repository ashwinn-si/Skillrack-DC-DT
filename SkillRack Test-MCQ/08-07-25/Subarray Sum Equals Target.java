/*
 * Given an array of integers and a target value, return the number of
 * continuous subarrays that sum up to the given target.
 * 
 * Input:
 * First line: Two integers, n (size of array) and target
 * Second line: n integers, the elements of the array
 * 
 * Example Input:
 * 5 100
 * 20 30 50 15 5
 * 
 * Example Output:
 * 2
 */

//IMP use hashmap if there are non negative numbers

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int target = sc.nextInt();
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }

    Queue<Integer> queue = new LinkedList<>();
    int sum = 0;
    int result = 0;

    for (int num : nums) {
      queue.offer(num);
      sum += num;

      while (sum > target && !queue.isEmpty()) {
        sum -= queue.poll();
      }

      if (sum == target) {
        result++;
      }
    }

    System.out.print(result);
  }
}
