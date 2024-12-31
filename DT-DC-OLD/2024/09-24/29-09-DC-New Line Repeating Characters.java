/*The program must accept a string S as the input. The program must split the string S wherever
a character occurs repeatedly(i.e„ two or more occurrences). Then the program must print the
substrings as the output.

Input:
skillrack
Output:

skil
Irac

Explanation:
Here S = skillrack.
The string S can be divided into three substrings as given below.
skil Irac k
The 5th character I is a repeated character.
The 9th character k is a repeated character.
Hence the output is
skil
Irac
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> hash=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(hash.get(ch)!= null &&hash.get(ch)==1){
		        System.out.println();
		        System.out.printf("%c",ch);
		        hash.put(ch,1);
		    }else{
		        System.out.printf("%c",ch);
		        hash.put(ch,1);
		    }
		}
	}
}