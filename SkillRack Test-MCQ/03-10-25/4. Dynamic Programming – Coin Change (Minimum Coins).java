
/*
Problem:
You are given N coin denominations and an amount X. Find the minimum number of coins required to make the amount X. If it is not possible, print -1.
Input Format:
- First line: integers N X
- Second line: N integers (coin denominations)
Constraints:
- 1 ≤ N ≤ 100
- 1 ≤ X ≤ 10^4
- 1 ≤ coin[i] ≤ 10^4
Output Format:
- Print minimum number of coins or -1.
Test Cases:
Input:
3 11
1 2 5
Output:
3
Explanation: 5+5+1 = 11

Input:
2 7
2 4
Output:
-1
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int target = sc.nextInt();
    sc.nextLine();
    int coins[] = new int[N];
    for (int index = 0; index < N; index++) {
      coins[index] = sc.nextInt();
    }
    int dp[][] = new int[N][target + 1];

    for (int index = 0; index < N; index++) {
      for (int K = 1; K <= target; K++) {
        int noPick = index == 0 ? Integer.MAX_VALUE : dp[index - 1][K];
        int pick = Integer.MAX_VALUE;
        if (K >= coins[index] && dp[index][K - coins[index]] != Integer.MAX_VALUE) {
          pick = 1 + dp[index][K - coins[index]];
        }
        dp[index][K] = Math.min(pick, noPick);
      }
    }
    System.out.println(dp[N - 1][target] == Integer.MAX_VALUE ? -1 : dp[N - 1][target]);
    sc.close();
  }
}
