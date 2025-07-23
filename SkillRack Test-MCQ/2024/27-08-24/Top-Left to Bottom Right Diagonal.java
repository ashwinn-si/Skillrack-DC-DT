/*The program must accept an integer matrix of size R*C and a nonzero digit D as the input. The
program must print the integers till the first occurring multiple of D in each top-left to
bottom-right diagonal in separate lines. If there is no multiple of D in a diagonal, then all
integers in that diagonal must be printed as the output.

Input:
56
978744 59 21 91
93 91 51 90 68 35
36 24 45 93 74 41
21 15 65477837
92 77 57 32 59 74
5

Output:
92
21 77
36 15
93 24 65
97 91 45
87 51 93 78 74
44 90
59 68 41
21 35
91
*/ 

import java.util.*;
public class Hello {
    public static void printer(int curr_i,int curr_j,int matrix[][],int N,int rows,int cols){
        while(curr_i>=0 && curr_i<=rows-1 && curr_j>=0 && curr_j<=cols-1){
            System.out.printf("%d ",matrix[curr_i][curr_j]);
            if(matrix[curr_i][curr_j]%N==0){
                break;
            }
            curr_i+=1;
            curr_j+=1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
		    for(int j=0;j<cols;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int N=sc.nextInt();
		/*diagonal element accessing*/
		for(int i=rows-1;i>=0;i--){
		   printer(i,0,matrix,N,rows,cols);
		}
		for(int j=1;j<=cols-1;j++){
		    printer(0,j,matrix,N,rows,cols);
		}

	}
}