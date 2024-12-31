/*The program must accept a string S representing the name of a boy as the input. His friend
shuffles the characters in the name S and inserts a random character at a random position. The
modified name M is also passed as the input to the program. The program must find the
randomly inserted character in M and print it as the output.
Note: Length of M = (Length of S) + I.

Input:
nelson
oneplsn

Output:
p

Explanation:
Here S = nelson and M = oneplsn.
The randomly inserted character in M is p.
So p is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String original=sc.nextLine();
		
		String modified=sc.nextLine();
		
		HashMap<Character,Integer> hash=new HashMap<>();
		
		for(int i=0;i<original.length();i++){
		    hash.put(original.charAt(i),hash.getOrDefault(original.charAt(i),0)+1);
		}
		
		for(int i=0;i<modified.length();i++){
		    if(hash.get(modified.charAt(i))==null || hash.get(modified.charAt(i))==0){
		        System.out.print(modified.charAt(i));
		        return;
		    }else{
		        hash.put(modified.charAt(i),hash.get(modified.charAt(i))-1);
		    }
		    
		}

	}
}