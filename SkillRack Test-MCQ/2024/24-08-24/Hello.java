/*The program must accept a matrix of size R*C and print them diagonally starting from bottom
left.

Input
34
10 20 30 40
50 51 52 53
60 70 80 90

Output:
60
50 70
10 51 80
20 52 90
30 53
40
*/ 


import java.util.*;
public class Hello {
    public static void printer(int row,int col,int total_r,int total_c,int matrix[][]){
        while(row>=0 && row<=total_r-1 && col>=0 && col<=total_c-1){
            System.out.printf("%d ",matrix[row][col]);
            row+=1;
            col+=1;
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
		for(int i=rows-1;i>=0;i--){
		    printer(i,0,rows,cols,matrix);
		}
		for(int i=1;i<cols;i++){
		    printer(0,i,rows,cols,matrix);
		}

	}
}
