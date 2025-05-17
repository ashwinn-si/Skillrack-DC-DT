/*
The program must accept a time T in 12-hr format HH:MM. The program must print the time if the 12 numbers on the
clock are rotated by X positions in clockwise or anticlockwise direction(the hour handle and the minute handle are
always fixed in the clock). The value of X is also passed as the input. The positive value of X indicates the clockwise
direction and the negative value of X indicates the anticlockwise direction.
Note: The value of X is always not equal to O.

Input:
10:25
-4

Output:
02:45

Explanation:
Here the given is 10:25 and the value of X is -4.
After rotating the 12 numbers by 4 positions in anticlockwise direction , the time becomes 02:45.
So 02:45 is printed as the output.

 */

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().strip().split(":");
		int hr = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]) / 5;
		int move = sc.nextInt() % 12;
		int resultHr = ((hr - move)) % 12;
		int resultMin = (((min - move)) % 12 * 5) + (Integer.parseInt(str[1]) - (min * 5));
        System.out.printf("%02d:%02d", resultHr, resultMin);
	}
}