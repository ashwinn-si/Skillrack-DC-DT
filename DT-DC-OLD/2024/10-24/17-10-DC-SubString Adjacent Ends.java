/*The program must accept a string S containing only alphabets as the input The program must
print the number of substrings in S where the first alphabet and the last alphabet are adjacent
to each other in the English alphabet set. The string S is case insensitive.
NQtg The alphabets a and z are adjacent to each other (by ignoring the case).

Input:
enVlronMENT

Output:
6

Explanation:
Here S = enVlronMENT.
There are 6 substrings where the first alphabet and the last alphabet are adjacent to each
other in the English alphabet set.
nVIro
nVlronM
on
onMEN
MEN
so 6 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++){
		    
		    for(int j=i+1;j<s.length();j++){
		        
		        if(checker(s.charAt(i),s.charAt(j))){
		            
		            count++;
		        }
		    }
		}
		
		System.out.printf("%d",count);
	}
	
	static boolean checker(char c1 , char c2){
	    
	    c1=Character.toLowerCase(c1);
	    
	    c2=Character.toLowerCase(c2);
	    
	    if(c1=='a' && c2=='z'){
	        
	        return true;
	        
	    }
	    else if(c1==c2+1 || c1+1==c2){
	        
	        return true;
	        
	    }else{
	        
	        return false;
	        
	    }
	}
}