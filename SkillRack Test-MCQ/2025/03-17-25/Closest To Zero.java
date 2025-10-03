/*
Given an integer array of size N, return the number with the value closest to O in the array. If there are
multiple answers, return the number with the largest value.

Input:
3
2 -1 1

Output:
1

Explanation:
Both -1 and 1 are closest. But 1 being the larger between these two is printed as the output.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int currNum = sc.nextInt();
            if (Math.abs(result) > Math.abs(currNum)) {
                result = currNum;
            } else if (Math.abs(result) == Math.abs(currNum)) {
                result = Math.abs(result);
            }
        }
        System.out.print(result);

    }
}