/*The program must accept an integer N as the input. The program must find the binary
representation of N. Then the program must form a string S by replacing Os with the lower
case vowels and Is with the lower case consonants circularly in alphabetical order. Finally, the
program must print the string S as the output.

Input:
528

Output:
baeiocuaei

Explanation:
Here N=528, the binary representation of 528 is 1000010000.
After replacing Os with the lower case vowels circularly in alphabetical order, the string
becomes laeiol uaei.
After replacing Is with the lower case consonants circularly in alphabetical order, the string
becomes baeiocuaei.
So baeiocuaei is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String BinaryString=Long.toBinaryString(sc.nextLong());
		
		int vowelCounter[]={0};
		
		char consCounter[]={'a'};

        for(int i=0;i<BinaryString.length();i++){
            
            boolean flag = (BinaryString.charAt(i)=='1')? false:true;
            
            System.out.printf("%c",helper(flag,vowelCounter,consCounter));
        }
	}
	
	static char helper(boolean vowelFlag,int vowelCounter[],char consCounter[]){
	    
	    if(vowelFlag){
	        
	        vowelCounter[0]++;
	        
	        switch(vowelCounter[0]){
	            
	            case 1:return 'a';
	            case 2:return 'e';
	            case 3:return'i';
	            case 4:return 'o';
	            case 5:return 'u';
	            default:{
	                vowelCounter[0]=1;
                    return 'a';
	            }
	       }
	       
	    }else{
	        
	        consCounter[0]++;
	        
	        while(consCounter[0] =='a' || consCounter[0]=='e'||consCounter[0] =='i' || consCounter[0]=='o' || consCounter[0]=='u'){
	            
	            if(consCounter[0] >='z'){
	                consCounter[0]='a';
	            }
	            else{
	                consCounter[0]++;
	            }
	           
	        }
	        if(consCounter[0] >'z'){
	            consCounter[0]='b';
	        }
	        return consCounter[0];
	    }
	}
}