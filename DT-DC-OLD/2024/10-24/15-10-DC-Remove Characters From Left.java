/*The program must accept two string values Sl and S2 as the input. The program must print
the minimum number of characters M to be removed from the left side of the given string
values so that the revised string values become equal (ignoring the case). If it is not possible,
then the program must print -I as the output.

Input:
Cream
JAM

Output:
4

Explanation:
After removing the first 3 characters from the string Cream, the string becomes am.
After removing the first character from the string JAM, the string becomes AM.
The revised string values am and AM are equal by ignoring the case.
The minimum number of characters to be removed from the left side of the given string values
So 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		
		String s2=sc.nextLine();
		
		int minLen=s1.length()>s2.length()?s2.length():s1.length();
	
		int lastPossibleIndex=0;
		
		while(lastPossibleIndex<minLen){
		    
		    if(!s1.substring(s1.length()-lastPossibleIndex-1).equalsIgnoreCase(s2.substring(s2.length()-lastPossibleIndex-1))){
		        break;
		    }
		    lastPossibleIndex++;
		}

        if(lastPossibleIndex==0){
            System.out.printf("-1");
        }else{
            System.out.printf("%d",s1.length()-lastPossibleIndex+s2.length()-lastPossibleIndex);
        }
	}
}