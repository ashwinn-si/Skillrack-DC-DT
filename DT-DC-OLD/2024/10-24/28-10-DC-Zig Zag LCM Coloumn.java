/*The program must accept an integer matrix of size RxC and two integers X, Y representing two
columns as the input. The program must print the LCM of integer in the first row, column
and the integer in the last row, Yth column of the matrix. Then the program must print the LCM
of integer in the second row, column and the integer in the last but one row, Yth column of
the matrix. Similarly, the program must print the LCM of the remaining integers in the
column and Y th column of the matrix.

Input:
58
71 22 16 30 28 31 40 51
32 88 78 58 33 10 9089
34 3841 62 12 49 72 18
45 63 91 5476 21 56 28
16 25 67 69 31 83 73 13
27
Ou tput:
1606 616 1368 630 200
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int R1=sc.nextInt();
		int R2 = sc.nextInt();
		for(int i=0;i<R;i++){
		    int A=matrix[i][R1-1];
		    int B=matrix[R-i-1][R2-1];
		    int lcm = (int)((A*B)/gcdGetter(Math.min(A,B),Math.max(A,B)));
		    System.out.printf("%d ",lcm);
		}
	}
	static int gcdGetter(int A , int B){
	    while(B != 0){
	        int temp=B;
	        B=A%B;
	        A=temp;
	    }
	    return A;
	}
}