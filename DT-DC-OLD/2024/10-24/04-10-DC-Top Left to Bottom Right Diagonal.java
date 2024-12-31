/*The program must accept an integer matrix of size RxC as the input. The program must print
the integers in the top-left to bottom-right diagonals from the top-right corner of the matrix.

Input
3 3
9 4 5
9 5 3
7 7 5

Output:
5
4 3
9 5 5
9 7
7
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner (System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=C-1;i>=0;i--){
            printer(R,C,0,i,matrix);
            System.out.println();
        }
        for(int i=1;i<R;i++){
            printer(R,C,i,0,matrix);
            System.out.println();
        }
        
	}
	static void printer(int R,int C,int curr_r,int curr_c,int matrix[][]){
	    while(curr_r>=0 && curr_r<R && curr_c>=0 && curr_c<C){
	        System.out.printf("%d ",matrix[curr_r][curr_c]);
	        curr_r++;
	        curr_c++;
	    }
	}
}