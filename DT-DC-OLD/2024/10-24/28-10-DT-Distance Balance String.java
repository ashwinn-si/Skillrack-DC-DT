/*The program must accept a string S containing only alphabets as the input. The program must
print Yes if the sum of the positions of the alphabets in the first half is equal to the sum of the
positions of the alphabets in the second half of the string S. Else the program must print No as
the output. If the length of S is odd, the middle alphabet in S must be excluded.
Note; The position of an alphabet is calculated from the English alphabet set (a-z or A-Z).

Input:
aBcFBCDc

Output:
Yes

Explanation:
The alphabets in the first half are a, B, c and F.
Their positions are l, 2, 3 and 6. So the sum is 12.
The alphabets in the second half are B, C, D and c.
Their positions are 2, 3, 4 and 3. So the sum is 12.
Here both the first and the second halves have the same sum.
So Yes is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
        int middle=0;
        int left=0;
        int right=0;
        if(S.length()%2==1){
            middle=S.length()/2;
            left=helper(S.substring(0,middle));
            right=helper(S.substring(middle+1));
        }else{
            middle=S.length()/2;
            left=helper(S.substring(0,middle));
            right=helper(S.substring(middle));
        }
        System.out.print((left==right)?"Yes":"No");
	}
	static int helper(String s){
	    int res=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
	            res+=(int)(s.charAt(i)-'a');
	        }else{
	            res+=(int)(s.charAt(i)-'A');
	        }
	    }
	    return res;
	}
}