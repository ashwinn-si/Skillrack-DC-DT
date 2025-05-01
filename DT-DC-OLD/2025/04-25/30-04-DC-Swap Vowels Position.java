/*
The program must accept a string S as the input. The program must swap every two vowels in the string S. Then the
program must print the revised string S as the output. If the number of vowels is odd, then the last vowel will remain the
same as there is no pair to swap.

Input:
environment

Output:
inverenmont

Explanation:
There are four vowels in the given string "environment'.
After swapping the vowels e and i, the string environment becomes inveronment.
After swapping the vowels o and e, the string inveronment becomes inverenmont.
Hence the output is inverenmont.

 */

import java.util.*;
public class Hello {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		char string [] = sc.nextLine().toCharArray();
		int p1 = -1, p2 = -1;
		int len = string.length;
		for(int i = 0 ; i < len ; i++){
		    if(isVowel(string[i])){
		        if(p1 == -1){
		            p1 = i;
		        }else {
		            p2 = i;
		            char temp = string[p1];
		            string[p1] = string[p2];
		            string[p2] = temp;
		            p1 = -1;
		            p2 = -1;
		        }
		    }
		}
		System.out.print(new String(string));

	}
}