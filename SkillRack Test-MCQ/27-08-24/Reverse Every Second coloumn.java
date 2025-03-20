/*The program must accept an integer matrix of size R*C as the input. The program must reverse
every second column in the matrix. Then the program must print the modified matrix as the
output.

Input:
51 74 71 32 14
31 78 51 45 67
87 96 77 10 26
70 72 93 39 31

Output:
51 72 71 39 14
31 96 51 10 67
87 78 77 45 26
70 74 93 32 31
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
		  String input_string[]=sc.nextLine().split(" ");
		  for(int j=0;j<cols;j++){
		      matrix[i][j]=Integer.parseInt(input_string[j]);
		  }
		}
		int row_val=rows-1;
		for(int i=0;i<rows;i++){
		    for(int j=0;j<cols;j++){
		        if(j%2==1){
		            System.out.printf("%d ",matrix[row_val][j]);
		        }else{
		            System.out.printf("%d ",matrix[i][j]);
		        }
		    }
		    System.out.println();
		    row_val-=1;
		}
	}
}
