/*
The program must accept an integer N as the input. The program must print the first N terms in the following sequence as the output.
1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, ... and so on. 
The 1st integer is 1. So the integer 1 has occurred once. 
The 2nd integer is 2. So the integer 2 has occurred 2 times. 
The 3rd integer is 2. So the integer 3 has occurred 2 times. 
The 4th integer is 3. So the integer 4 has occurred 3 times. 
The 5th integer is 3. So the integer 5 has occurred 3 times. 
The 6th integer is 4. So the integer 6 has occurred 4 times.
The 7th integer is 4. So the integer 7 has occurred 4 times and so on.

Input:
10

Output:
1 2 2 3 3 4 4 455
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt()-1;
	    int arr[] = new int[N+1];
	    arr[0]=1;
	    int currNumber = 2;
	    int index = 1;
	    System.out.printf("1 ");
	    while(N > 0){
	       if(N==0){
	           return;
	       }
	       int repeatCount = 0;
	       if(currNumber == 2){
	           repeatCount = 2;
	       }else{
	           repeatCount = arr[currNumber-1];
	       }
	       for(int i = 0 ; i < repeatCount ; i++){
	           if(N==0){
	               return;
	           }
	           System.out.printf("%d ",currNumber);
	           arr[index] = currNumber;
	           index++;
	           N--;
	       }
	       currNumber++;
	    }

	}
}