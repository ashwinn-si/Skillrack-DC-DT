/*
In a lock, there are L circular wheels. Each wheel has 10 slots from O to 9. The wheels can rotate freely in clockwise
and anticlockwise directions. The program must accept two string values Sl and S2 as the input. Both Sl and S2 have
the same length L. The string Sl represents the number in the lock. The string S2 represents the key to open the lock.
The program must print the minimum number of moves required to open the lock as the output. In one move, only one
wheel can be rotated in clockwise or anticlockwise direction.

Input:
2850
4007

Output:
12

Explanation:
Sl = 2850
S2 = 4007
The minimum number of moves required to open the lock is 12 (2+2+5+3).
 */

import java.util.*;
public class Hello {
    static int helper(int from, int to, boolean flag){
        int count = 0;
        while(true){
            if(from == to){
                return count;
            }
            count++;
            from += flag ? 1 : -1;
            if(flag &&  from == 10){
                from = 0;
            }
            if(!flag && from == -1){
                from = 9;
            }
        }

    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        int len = S1.length();
        int result = 0;
        for(int i = 0 ; i  < len ; i++){
            int from = S1.charAt(i) - '0';
            int to = S2.charAt(i) - '0';
            result += Math.min(helper(from, to, true), helper(from, to, false));
        }
        System.out.print(result);
	}
}