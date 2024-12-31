/*The program must accept a string S as the input. The program must expand the string S by
inserting vowels after each vowel in it based on the following conditions.
- If the vowel is a or A, then the program must insert one more a or A next to it.
- If the vowel is e or E, then the program must insert two more e or E next to it.
- If the vowel is i or I, then the program must insert three more i or I next to it.
- If the vowel is o or O, then the program must insert four more o or O next to it.
- If the vowel is u or U, then the program must insert five more u or U next to it.
Finally, the program must print the modified string S as the output.
Note; The case of the vowels to be inserted must be the same as the case of the vowels
present in the string S.

Input:
Argument
Output:
AArguuuuuumeeent
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		for(int i =0 ; i < s.length() ; i++){
		    System.out.printf("%c",s.charAt(i));
		    char ch = s.charAt(i);
		    int repeatingTimes=0;
		    switch(Character.toLowerCase(ch)){
		        case 'a' : repeatingTimes=1; break;
		        case 'e' : repeatingTimes=2; break;
		        case 'i' : repeatingTimes=3; break;
		        case 'o' : repeatingTimes=4; break;
		        case 'u' : repeatingTimes=5; break;
		        default : continue;
		    }
		    for(int j=0 ; j < repeatingTimes ; j++){
		        System.out.printf("%c",ch);
		    }
		}
	}
}