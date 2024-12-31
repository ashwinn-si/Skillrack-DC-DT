/*The program must accept a character matrix of size RxC containing only A's and B's as the
input. The program must remove all occurrences of B and shift the occurrences of A to the top.
The empty cells must be replaced with the hyphens. Then the program must print the modified
matrix as the output.

Input:
3 4
A A B A
B B A A
A B A A

Output:
A A A A
A - A A
- - - A

Explanation:
After removing all the occurrences of B, the empty cells are replaced with the hyphens.
A A - A
- - A A
A - A A
After shifting the occurrences of A to the top, the matrix becomes
A A A A
A - A A
- - - A
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char matrix[][] = new char[R][C];
		int countA[]=new int[C];
		for(int i=0 ; i < R ; i++){
		    for(int j = 0; j < C ; j++){
		        matrix[i][j]=sc.next().charAt(0);
		        if(matrix[i][j]=='A'){
		            countA[j]++;
		        }
		    }
		}
		for(int i=0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        if(countA[j]!=0){
		            System.out.printf("A ");
		            countA[j]--;
		        }else{
		            System.out.printf("- ");
		        }
		    }
		    System.out.println();
		}
		

	}
}