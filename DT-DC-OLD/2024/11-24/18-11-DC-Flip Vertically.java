/*
The program must accept two integer matrices M1 and M2 of size RxC as the input. The program must flip the matrix M2 vertically (i.e., reversing each column of the matrix). Then the program must print the product of the two matrices M1 and M2 (i.e., multiplying the integers in the same position).

Input:
3 3
1 3 5
8 26 7
25 36 2
5 6 31
6 47 40
3 10 7

Output:
3 30 35
48 1222 280
125 216 62
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
        int matrix1[][] = new int [R][C];
        int matrix2[][] = new int [R][C];
        inputGetter(R,C,matrix1,sc);
        inputGetter(R,C,matrix2,sc);
        for(int i = 0 ; i < R ;i++){
            for(int j = 0 ; j < C ; j++){
                System.out.printf("%d ",matrix1[i][j]*matrix2[R-1-i][j]);
            }
            System.out.println();
        }
	}
	static void inputGetter(int R, int C ,int matrix[][],Scanner sc){
	   for(int i = 0 ; i < R ;i++){
    	   for(int j = 0 ; j < C ; j++){
    	       matrix[i][j] = sc.nextInt();
    	   }
	   }
	}
}

