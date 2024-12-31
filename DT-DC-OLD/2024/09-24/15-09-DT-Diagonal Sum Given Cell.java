/*The program must accept an integer matrix of size RxC and two integers M and N as the input.
The integers M and N represent the position of a cell C in the matrix. The program must print
the sum of integers which are present in the top-left to bottom-right diagonal having the cell C
in the matrix.

Input:
5 5
4 8 9 3 6
1 4 2 9 1
3 5 6 2 6
5 7 8 9 3
8 4 3 2 1
3 4

Output:
15
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
		String matrix[][]=new String[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix[i][j]=sc.next();
		    }
		}
		int curr_r,curr_c;
		curr_r=sc.nextInt();
		curr_c=sc.nextInt();
		int sum=0;
		while(curr_r>0 && curr_c>0){
		    curr_r--;
		    curr_c--;
		}
		while(curr_r<R && curr_c<C){
		    sum+=Integer.parseInt(matrix[curr_r][curr_c]);
		    curr_r++;
		    curr_c++;
		}
		System.out.printf("%d",sum);
	}
}
