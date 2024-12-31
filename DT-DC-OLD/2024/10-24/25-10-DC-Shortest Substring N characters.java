/*The program must accept a string S and N unique characters as the input. The program must
print the shortest substring in S containing all the N characters. If two or more such substrings
are present in S, the program must print the first occurring substring as the output. If there is
no such substring, the program must print -1 as the output.

Input:
shopKeeper
3
p e K

Output:
pKe

Explanation:
The substring pKe is the shortest substring containing all the 3 characters p, e and K.
Hence the output is pKe.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  		String S = sc.nextLine();
  		int N = sc.nextInt();
  		char charSet[] = new char[N];
  		sc.nextLine();
  		for(int i =0 ; i < N ; i++){
  		    charSet[i]=sc.next().charAt(0);
  		}
  		
  		String result=S.concat("a");
  		
  		int stPointer=0;
  		int endPointer=1;

  		while(endPointer!=S.length()-1 && stPointer !=S.length()-1){
  		  
  		  
  		  //expanding the window
  		  while(endPointer!=S.length()-1 && !checker(S.substring(stPointer,endPointer+1),charSet)){
  		    endPointer++;
  		  }
  		  
  		  //contracting the window
  		  while(stPointer!=S.length()-1 && checker(S.substring(stPointer,endPointer+1),charSet)){
  		    stPointer++;
  		  }
  		  
  		  if(result.length()>S.substring(stPointer-1,endPointer+1).length()){
  		    result=S.substring(stPointer-1,endPointer+1);
  		  }
  		  
  		  
  		}

		if(result.length()==S.length()+1){
			System.out.print("-1");
		}else{
  			System.out.print(result);
		}
  }
  static boolean checker (String str , char charSet[]){
	    for(char ch : charSet){
	        boolean flag = false;
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i) == ch){
	                flag=true;
	                break;
	            }
	        }
	        if(!flag){
	            return false;
	        }
	    }
	    return true;
	}
}