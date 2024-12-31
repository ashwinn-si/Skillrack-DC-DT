/*The program must accept an integer N as the input The program must modify the integer N
by replacing each even digit with its square. Then the program must print the reverse of the
modified N as the output.
Note: The reverse of the modified N must not have any leading zeros.

Input:
12345

Output:
561341

Explanation:
The even digits in the integer 12345 are 2 and 4.
After replacing the even digits 2 and 4 with 4 and 16 respectively, the integer becomes
143165.
After reversing the integer 143165, the integer becomes 561341.
So 561341 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextInt();
		
	    long res=0;
	    
	    while(N!=0){
	        
	        long digit=N%10;
	        
	        if((digit&1)==1){ // 1->true[odd] 0-> false[even] 
	            res=res*10+digit;
	        }else{
	            if(digit<4){
	                res=res*10+(digit*digit);
	            }else{
	                res=res*100+((digit*digit)%10*10)+(((digit*digit)/10)%10);
	            }
	        }
	        N/=10;
	    }
	    
	    System.out.printf("%d",res);

	}
}