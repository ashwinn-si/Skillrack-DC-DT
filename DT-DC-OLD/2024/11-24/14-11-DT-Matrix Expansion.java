/*The program must accept an integer matrix of size RxC and two integers M, N as the input. The program must form a big matrix, where the number of rows is R*M and the number of columns is C*N. Then the program must fill each submatrix of size RxC in the big matrix with the given RxC matrix.

Input:
3 3
6 3 1
3 4 7
3 6 8
2 2

Output:
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8
6 3 1 6 3 1
3 4 7 3 4 7
3 6 8 3 6 8

Explanation:
Here R = 3, C = 3, M = 2 and N = 2.
So the size of the big matrix is 6x6 (3*2 x 3*2) and
it is given below.
631631
347347
368368
631631
347347
368368

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int matrix[][] = new int[R][C];
        for(int i  = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int expandR = sc.nextInt();
        int expandC = sc.nextInt();
        for(int i = 0 ; i < R*expandR ; i++){
            for(int j = 0 ; j < C*expandC ; j++){
                System.out.printf("%d ",matrix[i%R][j%C]);
            }
            System.out.println();
        }
    }
}