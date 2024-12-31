/*The program must accept two string values (Sl and S2) and a character CH (The character can be +, - or *)
as the input. The program must print the output based on the following conditions.
- If CH is +. the program must concatenate the string values SI and S2. Then the program must print the
concatenated string as the output.
- If CH is the program must remove the characters of S2 in Sl (from left to right) and print the modified
string Sl. If all characters are removed in Sl. then the program must print -1 as the output.
- If CH is the program must print the characters in the string Sl interlaced with the characters in the
string S2 (i.e., ISt character of Sl, ISt character of S2, 2nd character of Sl, 2nd character of S2, and so on).

Input:
#ProGramming#
mango#

Output:
PrGrmi#

Explanation:
Sl =
S2 = mango#
CH = -
So the characters of S2 must be removed in the string Sl (from left to right).
After removing the characters of S2 in SI, the string SI becomes PrGrmi#.
Hence the output is
PrGrmi#
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char op=sc.next().charAt(0);
		if(op == '+'){
		    System.out.printf("%s%s",s1,s2);
		}else if(op=='-'){
		    StringBuilder str=new StringBuilder(s1); //!STRING BUILDER APPROACH
		    for(int i=0;i<s2.length();i++){
		        for(int j=0;j<str.length();j++){
		            if(s2.charAt(i)==str.charAt(j)){
		                str.deleteCharAt(j);
		                break;
		            }
		        }
		    }
		    System.out.print(str.length()==0?"-1":str);
		}else{
		    int pointer=0;
		    while(pointer<s1.length() && pointer<s2.length()){
		        System.out.printf("%c%c",s1.charAt(pointer),s2.charAt(pointer));
		        pointer++;
		    }
		    while(pointer<s1.length() || pointer<s2.length()){
		        if(pointer<s1.length()){
		            System.out.printf("%c",s1.charAt(pointer));
		        }
		        if(pointer<s2.length()){
		            System.out.printf("%c",s2.charAt(pointer));
		        }
		        pointer++;
		    }
		}
	}
}