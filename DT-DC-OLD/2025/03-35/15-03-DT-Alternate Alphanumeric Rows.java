
/*
The program must accept an integer N as the input. The program must form an integer matrix MI of size
N*N using the sequence of N*N integers from 1 to N*N. Then the program must form a character matrix M2
of size N*N using the sequence of N*N lower case alphabets from a to z circularly (i.e., after the alphabet
z, the sequence again starts from the alphabet a). The program must print the output based on the following
conditions.
- If N is odd, then the program must print the ISt row of MI, 2nd row of M2, 3rd row of MI, 4th row of M2,
and so on.
- If N is even, then the program must print the ISt row of M2, 2nd row of MI, 3rd row of M2, 4th row of MI,
and so on.

Input:
3

Output:
1 2 3
d e f
7 8 9
*/

import java.util.*;

public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean alphaFlag = (N % 2 == 0); // true -> start  with row | false -> start with col
		int number = 1;
		char alpha = 'a';
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ; j < N ; j++){
		        if(alphaFlag){
		            System.out.print(alpha+" ");
		        }else{
		            System.out.print(number+" ");
		        }
		        alpha =(char) ('a' + ((alpha - 'a' + 1) % 26));
		        number++;
		    }
		    alphaFlag = !alphaFlag;
		    System.out.println();
		}
	}
} 