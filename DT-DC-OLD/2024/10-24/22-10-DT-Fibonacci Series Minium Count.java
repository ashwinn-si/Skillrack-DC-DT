/*The program must accept an integer N as the input The program must print the minimum
number of integers required to form the integer N by adding the integers present in the Fibonacci Series

Input:
46

Output:
4

Explanation:
Here N = 46.
One of the possible ways to form the integer 46 by adding the integers present in the
Fibonacci series is given below.
1+3+8+34=46.
The minimum number of integers required to form 46 is 4.
So 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int a=0;
		
		int b=1;
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(a);
		
		arr.add(b);
		
		while(a+b<=N){
		    
		    arr.add(a+b);
		    
		    int c=a+b;
		    
		    a=b;
		    
		    b=c;
		    
		}
		
		int minCount=0;
		
		Collections.reverse(arr);
		
		for(int i : arr){
		    if(N==0){
                break;
            }
		    if(N!=0 && i<=N ){
		        
		        minCount++;
		        
		        N-=i;
		        
		    }
		}
		
		System.out.print(minCount);

	}
}