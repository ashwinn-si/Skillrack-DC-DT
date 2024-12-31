/*The program must accept two string values Sl and S2 as the input. The program must print
YES if both Sl and S2 are equal when they are typed into empty text editors. Else the program
must print NO as the output. The character # represents a backspace character (i.e., It will
remove the preceding character if present).

Input:
Sku#ll
Ski#ll
Output:
YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		Stack <Character> stackS1=new Stack<>();
		Stack <Character> stackS2=new Stack<>();
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		for(int i=0;i<s1.length();i++){
		    
		    if(s1.charAt(i)=='#'){
		        if(!stackS1.isEmpty()){
		            stackS1.pop();
		        }
		    }else{
		        stackS1.push(s1.charAt(i));
		    }
		    
		}
		
		for(int i=0;i<s2.length();i++){
		    if(s2.charAt(i)=='#'){
		        if(!stackS2.isEmpty()){
		            stackS2.pop();
		        }
		    }else{
		        stackS2.push(s2.charAt(i));
		    }
		}
		
		if(stackS1.size()!=stackS2.size()){
		    System.out.printf("NO");
		    return;
		}
		
		for(int i=0;i<stackS1.size();i++){
		    
		    if(stackS1.pop() != stackS2.pop()){
		        System.out.printf("NO");
		        return;
		    }
		}
	
		System.out.printf("YES");

	}
}