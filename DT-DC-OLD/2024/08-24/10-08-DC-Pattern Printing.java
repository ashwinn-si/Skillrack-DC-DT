/*The program must accept an integer N as the input. The program must print the pattern which
contains N lines based on the following conditions.
In the first line, N integers are printed and the value starts from I and increments each value
by N, N-1, N-2 and so on.
In the second line, N-1 integers are printed and the value starts from 2 and increments each
value by N, N-1, N-2 and so on.
In the third line, N-2 integers are printed and the value starts from 3 and increments each
value by N, N-I, N-2 and so on.
Similarly, the remaining lines of the pattern are printed as the output.
Boundary Condition(s):
3 N 50
Input Format:
The first line contains N.
Output Format:
The first N lines, each contains the integer value(s) based on the given conditions.
Example Input/Output 1:
Input
6
Ou tput:
171216 1921
28 13 17 20
391418
410 15
511
6*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<N+1;i++){
		    int curr_value=i;
		    System.out.printf("%d ",curr_value);
		    for(int j=0;j<N-i;j++){
		        curr_value+=(N-j);
		        System.out.printf("%d ",curr_value);
		    }
		    System.out.println();
		    
		}

	}
}