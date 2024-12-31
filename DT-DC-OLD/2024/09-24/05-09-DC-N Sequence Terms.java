/*The program must accept an integer N as the input. The program must generate a sequence of
integers based on the following conditions,
- The first term of the sequence is always N.
- The current term of the sequence is (previous term / 2) if the previous term is even. Else the
current term of the sequence is (previous term * 3) + 1.
- The sequence always ends with I.
Finally, the program must print the integers in the generated sequence as the output.

Example Input/Output 1:
Input:
13

Output:
13 40 20 10 5 16 8 4 2 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(true){
		    System.out.printf("%d ",N);
		    if(N==1){
		        break;
		    }
		    if(N%2==0){
		        N=(int)N/2;
		    }else{
		        N=(N*3)+1;
		    }
		}

	}
}
