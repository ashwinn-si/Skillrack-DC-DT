import java.util.*;
public class Hello {
    public static void main(String[] args) {

		String S = "ma7d7am";
		int N = S.length();
	    int palindromeL = 0;
	    int palindromeR = N-1;
	    int alphaL = 0;
	    int alphaR = N-1;
	    int numsL = 0;
	    int numsR = N-1;
	    boolean palindromeFlag = true , numsFlag = true , alphaFlag = true;
	    // if(N%2 == 0){
	    //     System.out.print("No Palindrome");
	    //     return;
	    // }
	    while(palindromeL < palindromeR){
	        
	        if(palindromeL < palindromeR && S.charAt(palindromeL) != S.charAt(palindromeR)){
	            palindromeFlag = false;
	        }
	        palindromeL++;
	        palindromeR--;	        

	        if(numsFlag && numsL < numsR){
	            while(numsL < numsR && ((!Character.isDigit(S.charAt(numsL))) || (! Character.isDigit(S.charAt(numsR))))){
	                if(!Character.isDigit(S.charAt(numsL))){
	                    numsL++;
	                }
	                if(!Character.isDigit(S.charAt(numsR))){
	                    numsR--;
	                }
	            }
	            if(numsL < numsR && S.charAt(numsL) != S.charAt(numsR)){
	                numsFlag = false;
	            }
				else{
					numsL++;
					numsR--;
				}
	        }
	        
	        if(alphaFlag && alphaL < alphaR){
	            while(alphaL < alphaR && ((!Character.isLetter(S.charAt(alphaL))) || (! Character.isLetter(S.charAt(alphaL))))){
	                if(!Character.isLetter(S.charAt(alphaL))){
	                    alphaL++;
	                }
	                if(!Character.isLetter(S.charAt(alphaR))){
	                    alphaR--;
	                }
	            }
	            
	            if(alphaL < alphaR && S.charAt(alphaL) != S.charAt(alphaR)){
	                alphaFlag = false;
	            }else{
					alphaL++;
					alphaR--;
				}
	        }
	        
	        if(!palindromeFlag && !numsFlag && !alphaFlag){
	            System.out.print("No Palindrome");
	            return;
	        }

	        
	    }
	    
	    int count = 0;
	    count += (alphaFlag) ? 1 : 0;
	    count += (numsFlag ) ? 1 : 0;
	    count += (palindromeFlag) ? 1 :0;
	    switch(count){
  case 1 : 
	            System.out.print("Single Palindrome");
	            break;
	       case 2 :
	           System.out.print("Double Palindrome");
	           break;
	       case 3:
	           System.out.print("Triple Palindrome");
	           break;
	    }
	    System.out.print("hello");

	}
}