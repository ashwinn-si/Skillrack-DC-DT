/*The program must accept an integer N containing the digits 2 and 5 as the input. The program
must find the maximum value M by replacing at most one digit in N (2 with 5 or 5 with 2). Then
the program must print square of M as the output.

Input:
5225

Output:
30525625

Explanation:
The four possible combinations are given below.
2225, 5525, 5255 and 5222.
The maximum value M is 5525 which is obtained by replacing the 2nd digit 2 with 5.
The square of 5525 is 30525625.
So 30525625 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextLong();
		
	    long cpy=N;
	    
	    long result=N*N;
	    
	    int curr_multi=1;
	    
	    while(cpy!=0){
	        
	        long dummy=N;
	        
	        if(cpy%10==2){
	            
	            dummy+=3*curr_multi;
	            
	        }else{
	            
	            dummy-=3*curr_multi;
	            
	        }
	        
	        if(dummy*dummy > result){
	            
	            result =dummy*dummy;
	            
	        }
	        
	        cpy/=10;
	        curr_multi*=10;    
	    }
	    
	    System.out.printf("%d",result);

	}
}