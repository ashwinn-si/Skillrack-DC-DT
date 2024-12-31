/*The program must accept N integers as the input. The program must find the number of digits
D in the smallest integer among the N integers. Then the program must remove the last D-l
digits in each integer among the N integers. Finally, the program must print the sum of the N
modified integers as the output.

Input:
5
9408 80 331 10455 900

Output:
2116

Explanation:
The smallest integer among the 5 integers is 80.
The number of digits in 80 is 2.
After removing the last digit (2 - I = I) in each integer, the integers become 940, 8, 33, 1045
and 90.
The sum of the 5 modified integers is 2116 which is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
		long arr[]=new long[N];
		
		long smallestElement=Long.MAX_VALUE;
		
		for(int i=0;i<N;i++){
		    
		    arr[i]=sc.nextLong();
		    
		    smallestElement=smallestElement>arr[i]?arr[i]:smallestElement;
		    
		}
		
		int divideValue=1; //says the no of digits in smallest Number
		
		while(smallestElement >=10){
		    
		    divideValue*=10;
		    
		    smallestElement/=10;
		    
		}

        long result=0;
        
        for(int i=0;i<N;i++){
            
            result+=(int)(arr[i]/divideValue);
            
        }
        
        System.out.printf("%d",result);
        
	}
}