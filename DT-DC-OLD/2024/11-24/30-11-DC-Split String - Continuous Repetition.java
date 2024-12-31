/*
The program must accept a string S as the input. The program must split the string into
multiple substrings based on the following condition.
- If a character has repeated continuously even number of times, the program must split the
string in the middle of the continuous occurrences of the character.
Finally, the program must print the substrings of S in separate lines as the output.

Input:
SkillRack

Output:
Skil
IRack
*/

//! 4 TESTCASES FAILED

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int currIndex = 0;
		int prevStringEndIndex = 0;
		int count = 1;
		boolean sameFlag = false;
		for(; currIndex < S.length() ; currIndex++){
		    if(currIndex != 0 && S.charAt(currIndex) == S.charAt(currIndex-1)){
		        count++;
		    }else{
		        if(count % 2 == 0){
		            System.out.println(S.substring(prevStringEndIndex,currIndex-(count/2)));
		            prevStringEndIndex=currIndex-(count/2);
		        }
		        count = 1;  
		    }
		    if(currIndex == S.length()-1){
		            System.out.println(S.substring(prevStringEndIndex,S.length()));
		    }
		}
	}
}