/*The program must accept two string values Sl and S2 of equal length as the input. The
program must print the characters from both Sl and S2 based on the following order.
- ISt character in Sl, 2nd character in S2, ISt character in S2 and 2nd character in Sl are printed.
-3 character in Sl,4 character in S2, 3rd character in S2 and 4 character in Sl are printed.
- 5th character in Sl, 6th character in S2, 5th character in S2 and 6 character in Sl are printed.
- Similarly, the remaining the characters are printed alternatively from both Sl and S2 as the
output.
Note: The length of Sl and S2 are always even.*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int len = s1.length();
	    for(int pointer = 0 ; pointer<len;pointer+=2){
	        System.out.printf("%c%c%c%c",s1.charAt(pointer),s2.charAt(pointer+1),s2.charAt(pointer),s1.charAt(pointer+1));
	    }
	}
}