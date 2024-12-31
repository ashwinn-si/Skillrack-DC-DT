/*The program must accept two integers N and K as the input. The program must print YES if
there are at least K zeroes between two every two Is in the binary representation of N. Else
the program must print NO as the output.

Input:
290 2

Output:
YES

Explanation:
Here N = 290 and K = 2.
The binary representation of 290 is 100100010.
There are 2 zeroes present between first two Is.
There are 3 zeroes present between last two Is.
So YES is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        
        String binaryNumber=Integer.toBinaryString(sc.nextInt());
        
        int min=sc.nextInt();
        
        int previousIndex=-1;
        
        for(int i=0;i<binaryNumber.length();i++){
            
            if(binaryNumber.charAt(i)=='1'){
                
                if(previousIndex==-1){
                    
                    previousIndex=i;
                    
                }else{
                    
                    if(i-previousIndex<=min){
                        
                        System.out.printf("NO");
                        return;
                        
                    }
                    previousIndex=i;
                }
            }
        }
        System.out.printf("YES");
	}
}