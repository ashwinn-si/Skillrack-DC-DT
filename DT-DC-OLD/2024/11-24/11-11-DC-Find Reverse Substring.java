/*The program must accept two string values SI and S2 as the input. The string values SI and S2
are always the same, but one substring of S2 is reversed in Sl. The program must find that
substring in S2 and print it as the output.

Input:
SkaRllick
SkillRack

Output:
illRa

Explanation:
Here Sl = "SkaR11ick" and S2 = "SkillRack".
The substring illRa in S2 is reversed in Sl.
So illRa is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		//two pointer approach
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		int pointerS1 = 0;
		int pointerS2 = 0;
		boolean flag = false;
		while(true){
		    if(S1.charAt(pointerS1) == S2.charAt(pointerS2)){
		        if(flag || pointerS1 == S1.length()-1){
		            StringBuffer subS1  = new StringBuffer(S1.substring(pointerS2,pointerS1+1));
		            StringBuffer subS2 = new StringBuffer(S2.substring(pointerS2,pointerS1+1));
		            if((subS1.reverse()).toString().equals(subS2.toString())){
		                System.out.print(subS1);
		                return;
		            }else{
		                pointerS1++;
		                continue;
		            }
		        }
		        pointerS1++;
		        pointerS2++;
		    }else{
		        pointerS1++;
		        flag=true;
		    }
		}
	    

	}
}