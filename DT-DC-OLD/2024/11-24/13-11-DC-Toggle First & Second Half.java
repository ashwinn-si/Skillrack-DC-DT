/*The program must accept a string S containing only alphabets as the input. The program must
encrypt the string based on the following condition.
- If an alphabet is present in the first half of the alphabets, the program must replace the
alphabet with the corresponding alphabet in the second half of the alphabets and vice versa.
Finally, the program must print the encrypted string as the output.

Input:
SkillRack

Output:
FxvyyEnpx

Explanation:
The first half of the alphabets are a, b, c, d, e, f, g, h, i, j k, I and m.
The second half of the alphabets are n, o, p, q, r, s, t, u, v, w, x, y and z.
After replacing the first half alphabet with the corresponding alphabet in the second half of the
alphabets and vice versa, the string becomes FxvyyEnpx.
Hence the output is
FxvyyEnpx
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
        for(int i = 0 ; i < S.length() ; i++){
            char ch = Character.toLowerCase(S.charAt(i));
            boolean upperFlag = (S.charAt(i)>='A' && S.charAt(i)<='Z');
            if(ch>='a' && ch<='m'){
                if(upperFlag){
                    System.out.printf("%c",'N'+(ch-'a'));
                }else{
                    System.out.printf("%c",'n'+(ch-'a'));
                }
            }else if(ch>='n' && ch<='z'){
                if(upperFlag){
                    System.out.printf("%c",'A'+(ch-'n'));
                }else{
                    System.out.printf("%c",'a'+(ch-'n'));
                }
            }else{
                System.out.printf("%c",S.charAt(i));
            }
        }
	}
}