/*The program must accept a string S containing only lower case alphabets as the input. The program must print the missing lower case alphabets in the given string S in alphabetical order as the output.
Note: At least one lower case alphabet is always missing in the string S.

Input: 
skillrack

Output:
bdefghjmnopqtuvwxyz

Explanation:
The missing lower case alphabets in the string skillrack are b, d, e, f, g, h, j, m, n, o, p, q, t, u, v, w, x, y and z.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ch ='a';
        while(ch<='z'){
            if(s.indexOf(ch) == -1){
                System.out.printf("%c",ch);
            }
            ch++;
        }
    }
}