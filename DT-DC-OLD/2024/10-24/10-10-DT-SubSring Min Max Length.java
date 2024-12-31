/*The program must accept a string S and three integers X, M, N as the input. The program must
print YES if the string S contains at least one substring based on the following conditions.
- The length of the substring must be from M to N.
- The number of unique characters in the substring must be equal to X.
If there is no such substring in S, the program must print NO as the output.

Input:
skillrack

Output:
YES

Explanation:
HereX = 2, M = 3 and N = 4.
The substrings ill and llr contain 2 unique characters.
The length of ill is 3 (M <= 3 <= N).
The length of Ilr is 3 (M 3 N).
So YES is printed as the output.
*/

//! 3 TESTCASE FAILED

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int uniqCount=sc.nextInt();
        int minLen=sc.nextInt();
        int maxLen=sc.nextInt();
        for(int i=0;i<string.length()-maxLen+1;i++){
            for(int j=minLen;j<=maxLen;j++){
                if(uniqStringFinder(string.substring(i,i+j))==uniqCount){
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
	}
	static int uniqStringFinder(String subString){
	    HashMap<Character,Integer> hash=new HashMap<>();
	    int count=0;
	    for(int i=0;i<subString.length();i++){
	        hash.put(subString.charAt(i),hash.getOrDefault(subString.charAt(i),0)+1);
	    }
	    return hash.size();
	}
}