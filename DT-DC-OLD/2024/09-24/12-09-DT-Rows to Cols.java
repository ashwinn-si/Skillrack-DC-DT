/*The program must accept an integer matrix of size NXN as the input. The integers in the first
row of the matrix are always unique and their values range from I to N. For each integer X in
the first row of the matrix, the program must print the row as a column as the output.

Input:
3
3 1 2
8 9 10
4 2 6

Output:
4 3 8
2 1 9
6 2 10

Explanation:
The integers in the first row are 3, 1 and 2.
The ISt integer is 3, so the 3rd row is printed as the ISt column.
The 2nd integer is 1, so the ISt row is printed as the 2nd column.
The 3rd integer is 2, so the 2nd row is printed as the 3rd column.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String matrix[][]=new String[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        matrix[i][j]=sc.next();
		    }
		}
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        System.out.printf("%s ",matrix[Integer.parseInt(matrix[0][j])-1][i]);
		    }
		    System.out.println();
		}
	}
}