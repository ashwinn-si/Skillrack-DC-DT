/*
 * Given two strings, print all of the longest common substrings between them.
 * If there are multiple substrings of the same maximum length, print all such
 * substrings, one per line.
 * 
 * Input:
 * First line: String 1
 * Second line: String 2
 * 
 * Example Input:
 * 
 * evening
 * vendor
 * 
 * Example Output:
 * ven
 * 
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int R = s1.length();
    int C = s2.length();
    int dp[][] = new int[R + 1][C + 1];
    int maxLength = 0;

    for (int i = 1; i <= R; i++) {
      for (int j = 1; j <= C; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
          maxLength = Math.max(maxLength, dp[i][j]);
        }
      }
    }

    for (int i = 1; i <= R; i++) {
      for (int j = 1; j <= C; j++) {
        if (dp[i][j] == maxLength) {
          System.out.println(s1.substring(i - maxLength, i));
        }
      }
    }

  }
}