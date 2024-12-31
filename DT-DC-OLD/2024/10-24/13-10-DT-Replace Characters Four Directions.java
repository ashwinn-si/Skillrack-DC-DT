/*The program must accept a character matrix of size RxC as the input. The program must
modify the matrix based on the following conditions.
- The program must replace all characters present to the left of each occurrence of L with the
asterisks in the matrix.
- Then the program must replace all characters present above(top) each occurrence of T with
the asterisks in the matrix.
- Then the program must replace all characters present to the right of each occurrence of R
with the asterisks in the matrix.
- Then the program must replace all characters present below(bottom) each occurrence of B
with the asterisks in the matrix.
- The characters L, T, R and B are never changed in the matrix when replacing the characters as
per the above conditions.
Finally, the program must print the modified matrix as the output.

Input:
6 8
U X C S R N Z L
D U O T V G C N
J Q X Z S W B L
I R R P H X U U
L Q L J T G A A
V C D L X Z C E 

Output:
* * * * R * * L 
D U O T * G C N 
* * * * * * B L 
I R R * * * * * 
L * L J T G * A 
* * * L X Z * E 

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int R=sc.nextInt();
		int C=sc.nextInt();
		
		sc.nextLine();
		
		char matrix[][]=new char[R][C];
		
		Integer L_index[]=new Integer[R];
	    Integer R_index[]=new Integer[R];
		Integer T_index[]=new Integer[C];
		Integer B_index[]=new Integer[C];
		
		boolean L_occurance_row[]= new boolean[R];
		boolean R_occurance_row[]=new boolean[R];
		boolean T_occurance_col[]=new boolean[C];
		boolean B_occurance_col[]=new boolean[C];
		
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix[i][j]=sc.next().charAt(0);
		        if(matrix[i][j]=='L'){
		            L_index[i]=j;
		            L_occurance_row[i]=true;
		        }
		        if(matrix[i][j]=='R' && R_index[i]==null){ //!FIRST OCCURING RIGHT SHOULD BE TAKEN
		            R_index[i]=j;
		            R_occurance_row[i]=true;
		        }
		        if(matrix[i][j]=='T'){
		            T_index[j]=i;
		            T_occurance_col[j]=true;
		        }
		        if(matrix[i][j]=='B' && B_index[j]==null){ //!FIRST OCCURING BOTTOM SHOULD BE TAKEN
		            B_index[j]=i;
		            B_occurance_col[j]=true;
		        }
		    }
		}
		
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        if(matrix[i][j]=='R' || matrix[i][j]=='L'||matrix[i][j]=='T' || matrix[i][j]=='B'){
		            System.out.printf("%c ",matrix[i][j]);
		            continue;
		        }
		        if(L_occurance_row[i] && j<L_index[i]){
		            System.out.printf("* ");
		        }
		        else if(R_occurance_row[i] && j>R_index[i]){
		            System.out.printf("* ");
		        }
		        else if(T_occurance_col[j] && i<T_index[j]){
		            System.out.printf("* ");
		        }
		        else if(B_occurance_col[j] && i>B_index[j]){
		            System.out.printf("* ");
		        }else{
		        System.out.printf("%c ",matrix[i][j]);
		        }		        
		    }
		    System.out.println();
		}
	}
}