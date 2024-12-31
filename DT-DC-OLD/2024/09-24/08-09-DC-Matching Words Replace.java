/*The program must accept two string values P and S as input. The string P represents a pattern
The string S represents a set of words. The character in P matches any single character. The
program must print the word in S that matches the given pattern P as the output. If two or
more words match the pattern P, then the program must print the first occurring word as the
output.
Note; At least one word in S is always matched with P.

Input:
LION crane lion breath kiln

Output:
lion

Explanation:
Here P = and S = "LION crane lion breath kiln".
There are two words in S that match the pattern P.
lion klin
So the first occurring word lion is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2[]=sc.nextLine().split(" ");
		int s1_length=s1.length();
		for(int i=0;i<s2.length;i++){
		    if(s1_length==s2[i].length()){
		        boolean flag=true;
		        for(int j=0;j<s2[i].length();j++){
		            if(s1.charAt(j)=='?'){
		                continue;
		            }
		            if(s1.charAt(j)!=s2[i].charAt(j)){
		                flag=false;
		                break;
		            }
		        }
		        if(flag){
		            System.out.print(s2[i]);
		            break;
		        }
		    }
		}

	}
} 
