/*The program must accept an odd integer N as the input The program must print a grid of characters representing the crown
pattem based on the following conditions.
- The number of rows R in the grid must be (N-1)/2.
- The number of columns C in the grid must be N.
- In the ISt row of the grid, the first column, the middle column and the last column have the asterisks (i). The remaining columns
in the ISt row have the plus symbols
- In the 2nd row of the grid, the first column, the middle column and the last column have the hash symbols (#). The remaining
columns in the 2nd row have the plus symbols (+).
- In the 3rd row of the grid, the first 2 columns, the middle 3 columns and the last 2 columns have the hash symbols The
remaining columns in the 3rd row have the plus symbols
- In the 4th row of the grid, the first 3 columns, the middle 5 columns and the last 3 columns have the hash symbols (#). The
remaining columns in the 4th row have the plus symbols (+).
- Similarly, the first R - ((R-1)/2) lines Of the grid (consider integer division for / operation).
- The remaining rows of the grid have only hash symbols (#).
Finally, the program must print the RxC grid as the output

Input:
11

Output
*++++*++++*
#++++#++++#
##++###++##
###########
###########
*/

import java.util.*;
public class Hello {
    public static void changer(int i,int j,int matrix[][],int C,int R){
        int cpy_i=i;
        int cpy_j=j;
        while(i<R && j<C){
            for(int k=0;k<=j;k++){
                matrix[i][k]=1;
            }
            i++;
            j++;
        }
        i=cpy_i;
        j=C-1;
        while(i<R&&j>=0){
            for(int k=C-1;k>=j;k--){
                matrix[i][k]=1;
            }
            i++;
            j--;
        }
        i=1;
        int pointer_left=(int)C/2;
        int pointer_right=(int)C/2;
        while(i<R){
            for(int k=pointer_left;k<=pointer_right;k++){
                matrix[i][k]=1;
            }
            pointer_left--;
            pointer_right++;
            i++;
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int matrix[][]=new int[(N-1)/2][N];
		changer(1,0,matrix,N,(N-1)/2);
        for(int i=0;i<(N-1)/2;i++){
            for(int j=0;j<N;j++){
                if(i==0 && (j==0 || j==N-1||j==(int)N/2)){
                    System.out.printf("*");
                }else if(matrix[i][j]==1){
                    System.out.printf("#");
                }else{
                    System.out.printf("+");
                }
            }
            System.out.println();
        }
	}
}