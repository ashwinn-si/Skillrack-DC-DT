/*The program must accept a string S and a character CH as the input. The program must
reverse the characters between the first occurrence of CH and the last occurrence of CH in the
string S. Then the program must print the revised string S as the output.
NQte; The character CH has always occurred more than once in the string S.

Input:
skillrack
k

Output:
skcarllik

Explanation:
The first occurrence and the last occurrence of the character k in the given string are
highlighed below.
skillrack
After reversing the characters between them, the string becomes skcarllik
So skcarllik is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char target = sc.next().charAt(0);
		int stIndex=s.indexOf(target);
		int endIndex=s.lastIndexOf(target);
	    int currPointer = 0;
	    while(currPointer<stIndex){
	        System.out.printf("%c",s.charAt(currPointer));
	        currPointer++;
	    }
	   currPointer=endIndex;
	   while(currPointer>=stIndex){
	       System.out.printf("%c",s.charAt(currPointer));
	       currPointer--;
	   }
	   currPointer=endIndex+1;
	   while(currPointer<s.length()){
	       System.out.printf("%c",s.charAt(currPointer));
	       currPointer++;
	   }

	}
}