/*The program must accept an integer matrix of size RxC containing only Os and Is as the input.
The program must print the count of lonely Is in the matrix as the output. If is a
lonely 1, then all other elements in the row i and the column j are O.

Input:
1 0 0 
0 1 0
0 0 1
0 1 0

Output:
2

Explanation:
The lonely Is in the given matrix are highlighted below.
1 0 0
0 1 0
0 0 1
0 1 0
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
		boolean rowFlag [] = new boolean[R];
		boolean colFlag [] = new boolean[C];
		for(int i =0 ; i < R ; i++){
		    int countOne = 0;
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		        if(matrix[i][j]==1){
		            countOne++;
		        }
		    }
		    if(countOne == 1){
		        rowFlag[i] = true;
		    }else{
		        rowFlag[i] = false;
		    }
		}
        for( int j = 0 ; j < C ; j++){
            int countOne = 0 ;
            for( int i = 0 ; i < R ; i++){
                if(matrix[i][j]==1){
                    countOne++;
                }
            }
            if(countOne==1){
                colFlag[j]=true;
            }else{
                colFlag[j]=false;
            }
        }
        int resCount = 0 ;
        for(int i = 0 ; i < R ; i++){
            if(rowFlag[i]){
                for(int j = 0 ; j < C ;j++){
                    if(colFlag[j] && matrix[i][j]==1){
                        resCount++;
                    }
                }
            }
        }
        System.out.printf("%d",resCount);
	}
}