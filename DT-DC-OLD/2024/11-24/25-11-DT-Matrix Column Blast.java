/*
The program must accept an integer matrix Ot size RxC as the input. The program must modty the matrix
based on the follow-tng conditions-
- If an integer X in a column contains at least one O. then all the integers in that column must be
incremented by 1 except the integer X.
* It there are two or more such integers in a column. then column will remain the same.
Finally, the program must print the matrix as the output.

Input:
841 535 297 203
978 881 700 815
290 927 615 280

Output:
842 535 298 203
979 881 700 815
290 927 616 280
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		int count[] = new int[C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		        if(Integer.toString(matrix[i][j]).indexOf("0") != -1){
		            count[j]++;
		        }
		    }
		}
		for(int i = 0 ;i < R ; i++){
		    for(int j = 0 ;j < C ;j++){
		        if(count[j] == 1 && Integer.toString(matrix[i][j]).indexOf("0")==-1){
		            matrix[i][j]++;
		        }
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}

	}
}