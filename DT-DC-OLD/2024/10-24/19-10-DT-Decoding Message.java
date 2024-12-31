/*The program must accept three string values SII S2 and S3 as the input. The program must
decode the given three string values based on the following conditions.
- Each alphabet must be decoded as a digit from O to 9.
A O, 1, 2, ...l 9, O, 1, M 2, ...X-> 3, Y 4 and 5
(Same decoding applies for the lower case alphabets).
After decoding each alphabet, the three string values become three integers. The program
must print YES if Sl + S2 = S3, Else the program must print NO as the output.

Input:
Foot
Basket
Vbdets

Output:
YES

Explanation:
The string Foot can be decoded as 5449.
The string Basket can be decoded as 108049.
The string Vbdets can be decoded as 113498.
The sum of 5449 + 108049 is equal to 113498.
So YES is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		
		String s2=sc.nextLine();
		
		String s3=sc.nextLine();
		
		if(helper(s1)+helper(s2)==helper(s3)){
		    
		    System.out.print("YES");
		    
		}else{
		    
		    System.out.print("NO");
		}

	}
	
	static int helper(String s){
	    
	    int count=0;
	    
	    for(int i=0;i<s.length();i++){
	        
	        count=(count*10)+((Character.toLowerCase(s.charAt(i))-'a')%10);
	        
	    }
	    
	    return count;
	    
	}
}