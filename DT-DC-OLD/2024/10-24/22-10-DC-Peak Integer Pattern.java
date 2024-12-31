/*The program must accept two integers N and K as the input. The program must print N
integers based on the following conditions.
- The program prints the integers from 1 until it reaches the peak K.
- Then the program prints the integers from K-1 until it reaches 1.
- Then the program prints the integers from 2 until it reaches the peak K.
This logic must be repeated untill N integers are printed.

Input:
15 4

Output:
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3

Explanation:
Here N = 15 and K = 4. So 15 integers are printed based on the given conditions.
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int peakValue=sc.nextInt();
		
		int currCount=0;
		
		int currNumber=1;
		
		boolean flag=true;
		
		while(true){
		    
		    if(flag){
		        
		        System.out.printf("%d ",currNumber);
		        
		        currNumber++;
		        
		    }else{
		        
		        System.out.printf("%d ",currNumber);
		        
		        currNumber--;
		        
		    }
		    
		    if(currNumber>peakValue){
		        
		        currNumber=peakValue-1;
		        flag=false;
		        
		    }
		    if(currNumber==0){
		        
		        currNumber=2;
		        flag=true;
		        
		    }
		    
		    currCount++;
		    
		    if(currCount==N){
		        break;
		    }
		    
		}

	}
}