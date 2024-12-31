/*
The program must accept a character matrix of size RxC containing only A's and B's as the input. The
program must remove all occurrences of B and shift the occurrences of A to the right. The empty cells must
be replaced With the hyphens. Then the program must print the modified matrix as the output.

Input:
A B A A B B
A A A A A A
B B A A A A

Output:
A A A A A A
- - A A A A
- A A A A A
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char matrix[][] = new char[R][C];
		sc.nextLine();
		for(int i = 0 ; i < R ; i++){
		    int count = 0;
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		        if(matrix[i][j]=='B') count++;
		    }
		    for(int j = 0 ; j < C ; j++){
		        if(j < count ){
		            System.out.printf("- ");
		        }else{
		            System.out.printf("A ");
		        }
		    }
		    System.out.println();
		}

	}
}
