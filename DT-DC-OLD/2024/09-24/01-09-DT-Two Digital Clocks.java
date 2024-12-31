/*Two digital clocks CI and C2 (in 24-hr format) are hanging in a room showing two different
times in chronological order. The program must accept the current time on the clocks Cl, C2
and another time T as the input. The program must print the time on the clock C2 when the
time on the clock Cl is T.

Input:
10:30
12:00
12:45

Output:
14:15

Explanation:
Here Cl = 10:30, C2 = 12:00 and T = 12:45.
The difference between 10:30 and 12:00 is 1 Hour and 30 Minutes.
If Cl shows 12:45, then C2 shows 14:15.
So 14:15 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String t1_string[]=sc.nextLine().split(":");
        String t2_string[]=sc.nextLine().split(":");
        String res_string[]=sc.nextLine().split(":");
        int res_sec=(Integer.parseInt(res_string[0])*3600)+(Integer.parseInt(res_string[1])*60);
        int t1_sec=(Integer.parseInt(t1_string[0])*3600)+(Integer.parseInt(t1_string[1])*60);
        int t2_sec=(Integer.parseInt(t2_string[0])*3600)+(Integer.parseInt(t2_string[1])*60);
        t2_sec=(t2_sec+(res_sec-t1_sec))%86400;//if the time goes to the next day
        int res_hr=t2_sec/(3600);
        int res_min=(t2_sec-(res_hr*3600))/60;
        System.out.printf("%02d:%02d",res_hr,res_min);
	}
}