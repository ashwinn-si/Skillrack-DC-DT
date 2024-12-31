/*The program must accept an integer matrix of size RxC and the position of cell (X, Y) as the
input. The program must divide the matrix into four submatrices based on the position of the
given cell.
- The integers present above the row and before the Yth column in the matrix represent the
top-left submatrix,
- The integers present above the X row and after they column in the matrix represent the
top-right submatrix.
- The integers present below the row and before the Yth column in the matrix represent the
bottom-left submatrix.
- The integers present below the row and after the Yth column in the matrix represent the
bottom-right submatrix.
The program must print the maximum integer in each submatrix as the output.

Input:
5 6
27 39 26 36 12 30
25 84 77 52 97 34
99 87 62 28 19 21
22 72 70 47 90 73
82 68 59 33 38 96
3 4

Output:
84 97 82 96

Explanation:
Here X = 3 and Y 4.
The top-left submatrix is given below.
27 39 26
25 84 77
The top-right submatrix is given below.
12 30
97 34
The bottom-left submatrix is given below.
22 72 70
82 68 59
The bottom-right submatrix is given below.
90 73
38 96
So the maximum integer in each submatrix is printed.
Hence the output is
84 97 82 96
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        int R,C;
        R=sc.nextInt();
        C=sc.nextInt();
        sc.nextLine();
        int matrix[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.nextLine();
        int target_r=sc.nextInt();
        int target_c=sc.nextInt();
        System.out.printf("%d %d %d %d",helpper(matrix,target_r-2,target_c-2,0,0),helpper(matrix,target_r-2,C-1,0,target_c),helpper(matrix,R-1,target_c-2,target_r,0),helpper(matrix,R-1,C-1,target_r,target_c));
	}
    static int helpper(int matrix[][],int end_r,int end_c,int st_r,int st_c){
        int max_value=Integer.MIN_VALUE;
        for(int i=st_r;i<=end_r;i++){
            for(int j=st_c;j<=end_c;j++){
                if(matrix[i][j]>max_value){
                    max_value=matrix[i][j];
                }
            }
        }
        return max_value;
    }
}