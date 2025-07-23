/*The program must accept a string S containing only alphabets and equal number of vowels
and consonants. Then the program must swap the first vowel with the first consonant, second
vowel with the second consonant and so on. Then the program must print the revised string
value as the output.

Example Input/Output l:

Input:
aeroplanes

Output:
rpaleonase
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int string_len=s.length();
		char vowel[]=new char[(int)string_len/2];
		char cons[]=new char[(int)string_len/2];
		int cons_c=0;
		int vowel_c=0;
		for(int i=0;i<string_len;i++){
		    char ch=Character.toLowerCase(s.charAt(i));
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		        vowel[vowel_c]=s.charAt(i);
		        vowel_c++;
		    }else{
		        cons[cons_c]=s.charAt(i);
		        cons_c++;
		    }
		}
		cons_c=0;
		vowel_c=0;
		for(int i=0;i<string_len;i++){
		    char ch=Character.toLowerCase(s.charAt(i));
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		        System.out.printf("%c",cons[cons_c]);
		        cons_c++;
		    }else{
		        System.out.printf("%c",vowel[vowel_c]);
		        vowel_c++;
		    }
		}
	}
}