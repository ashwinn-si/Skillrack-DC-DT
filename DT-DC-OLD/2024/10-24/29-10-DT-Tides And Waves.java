/*
There are R*C piles of fish in a seashore arranged like a matrix format. Suddenly, big waves
began to come from the sea. Each wave will return the fish to the sea from the piles of fish
based on the following conditions.
- Each wave will affect the piles in the nearest X rows.
- Exactly 1 fish will be removed when a wave hits a pile.
The program must accept an integer matrix of size R*C representing the number of fish in the
piles. The R*C piles of fish are affected by W waves. The number of rows affected by each
wave is also passed as the input to the program. The program must print the number of fish
remaining in the R*C piles of fish after W waves.
Note:
The sea is always present below the matrix.
No fish will be added to the piles at any time during the waves.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][]= new int[R][C];
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowChanger[] = new int [R];
        int N = sc.nextInt();
        sc.nextLine();
        for(int i =0 ;i<N;i++){
            int currMinus=sc.nextInt();
            for(int j = R-1 ; j>R-1-currMinus;j--){
                rowChanger[j]++;
            }
        }
        
        for(int i =0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]-rowChanger[i]<=0){
                    System.out.printf("0 ");
                    continue;
                }
                System.out.printf("%d ",matrix[i][j]-rowChanger[i]);
            }
            System.out.println();
        }
        
	}
}