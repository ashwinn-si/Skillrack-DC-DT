/*The program must accept a string S (encrypted string) containing digits and asterisks as the
input. The encryption algorithm is given below.
- The alphabets from a to j are replaced with the digits from O to 9 respectively.
- The alphabets from k to z are replaced with the values from 10* to 25* respectively.
The program must decrypt the string S and print it as the output.
Note: The string S is always a valid encrypted string.

Input:
18*10*811*11*17*0210*

Output:
skillrack

Explanation:
Here S = skillrack
18* is replaced with the alphabet s. Now the string becomes slO*811* 11*17*0210*.
10* is replaced with the alphabet k. Now the string becomes sk811 *11*17*0210*.
8 is replaced with the alphabet i. Now the string becomes skil 1*11*17*0210*.
11* is replaced with the alphabet I, Now the string becomes skill
11* is replaced with the alphabet I. Now the string becomes
17* is replaced with the alphabet r. Now the string becomes skillr0210*.
O is replaced with the alphabet a. Now the string becomes skillra210*.
2 is replaced with the alphabet c. Now the string becomes skillrac10*.
IO* is replaced with the alphabet k. Now the string becomes skillrack.
So skillrack is orinted as the outout.
*/
//! 5 testcase failed

import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc= new Scanner (System.in);
		String input_line[]=sc.nextLine().split("\\*");
        for(int i=0;i<input_line.length;i++){
            if(input_line[i].length()<=2 ){
                if(input_line[i].length()==2 && Integer.parseInt(input_line[i])<26){
                    System.out.printf("%c",'a'+Integer.parseInt(input_line[i]));
                }
                else{
                    for(int j=0;j<input_line[i].length();j++){
                        System.out.printf("%c",'a'+Integer.parseInt(String.valueOf(input_line[i].charAt(j))));
                    }
                }
            }else{
                for(int j=0;j<input_line[i].length()-2;j++){
                    System.out.printf("%c",'a'+Integer.parseInt(String.valueOf(input_line[i].charAt(j))));
                }
                System.out.printf("%c",'a'+Integer.parseInt(input_line[i].substring(input_line[i].length()-2,input_line[i].length())));
            }
        }
	}
}