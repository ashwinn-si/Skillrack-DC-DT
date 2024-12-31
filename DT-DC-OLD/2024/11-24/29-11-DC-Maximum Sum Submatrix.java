/*
The program must accept an integer matrix of size RxC and an integer K as the input. The
program must print the 2x2 submatrix which has the maximum sum among the last K 2x2
non-overlapping submatrices in the matrix. If two or more 2x2 submatrices have the same
maximum sum, then the program must print the first occurring submatrix as the output.
The values of R and C are always even.

Input:
7 2 1 7 3 0
8 9 6 4 0 3
2 0 0 8 2 8
8 6 9 5 9 9
4

Output
2 8
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
		for(int i = 0 ; i < R ;i++){
		    for(int j = 0 ; j < C ;j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int K  = sc.nextInt();
		int stI = 0;
		int stJ = 0;
		int totalPossibleMatrixNumber = (C/2)*(R/2);
		while(totalPossibleMatrixNumber != K){
		    stJ+=2;
		    if(stJ == C){
		        stI += 2;
		        stJ = 0;
		    }
		    totalPossibleMatrixNumber--;
		}
		
		int resI = -1;
		int resJ = -1;
		int resSum = Integer.MIN_VALUE;
		for(int i = stI ; i < R ; i+=2){
		    for(int j = stJ ; j < C ;j+=2){
		        int currSum = 0;
		        for(int k = i ; k < i+2 ; k++){
		            for(int l = j ; l < j+2 ; l++){
		                currSum+=(matrix[k][l]);
		            }
		        }
		        if(currSum > resSum){
		            resSum = currSum;
		            resI = i;
		            resJ = j;
		        }
		    }
		    break;
		}
		
		for(int i = stI+2 ; i < R ; i+=2){
		    for(int j = 0 ; j < C ; j+=2){
		        int currSum = 0;
		        for(int k = i ; k < i+2 ; k++){
		            for(int l = j ; l < j+2 ;l++){
		                currSum+=(matrix[k][l]);
		            }
		        }
		        if(currSum > resSum){
		            resSum = currSum;
		            resI = i;
		            resJ = j;
		        }
		    }
		}
		
		//printing result
		for(int i = resI ; i < resI+2 ; i++){
		    for(int j = resJ ; j < resJ+2 ; j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}

	}
}