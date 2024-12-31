/*The program must accept two integer matrices MI and M2 of equal size RxC as the input. If it is possible to equalize the
sum of the integers in MI and M2 by swapping an integer at the same position between two matrices, then the program
must print the integers after the swapping as the output. If two or more such swaps are possible, then the program must
consider the first occurring swap. If it is not possible to equalize the sum of the integers in MI and M2 or they are already
equal, then the program must print -l as the output.

Input:
2 2
3 2
3 4
1 4
1 2

Output:
1 3

Explanation :
The sum of integers in the first 2x2 matrix is 12.
The sum of integers in the second 2x2 matrix is 8.
There are 3 possible ways to equalize the sum of the integers in MI and M2.
Swapping integers at (O. O).
Swapping integers at (1. O).
Swapping integers at (I, I).
The integers swapped in the first occurring swap are 3 and I.
After swapping the integers in MI and M2, the integers 1 and 3 are printed as the output
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R,C;
		R=sc.nextInt();
		C=sc.nextInt();
		int matrix1[][]=new int[R][C];
		int matrix2[][]=new int[R][C];
		int sum2=0;
		int sum1=0;
		sc.nextLine();
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix1[i][j]=sc.nextInt();
		        sum1+=matrix1[i][j];
		    }
		}
		sc.nextLine();
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix2[i][j]=sc.nextInt();
		        sum2+=matrix2[i][j];
		    }
		}
		if(sum1==sum2){
		   System.out.print("-1");
		   return;
		}
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        if(swap(matrix1,matrix2,i,j,sum1,sum2)){
		            System.out.printf("%d %d",matrix2[i][j],matrix1[i][j]);
		            return;
		        }
		    }
		}
		System.out.print("-1");
	}
	static boolean swap(int m1[][],int m2[][],int i,int j,int s1,int s2){
	    if(s1-m1[i][j]+m2[i][j]==s2-m2[i][j]+m1[i][j]){
	        return true;
	    }
	    return false;
	}
}