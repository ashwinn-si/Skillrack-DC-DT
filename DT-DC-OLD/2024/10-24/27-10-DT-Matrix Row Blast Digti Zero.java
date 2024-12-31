/*The program must accept an integer matrix of size RxC as the input. The program must modify
the matrix based on the following conditions.
- If an integer X in a row contains at least one O, then all the integers in that row must be
incremented by 1 except the integer X.
- If there are two or more such integers in a row, then the row will remain the same.
Finally, the program must print the modified matrix as the output.

Input:
748416 10
435 341 552
900 98 533
80 124 805

Output:
749417 10
435 341 552
900 99 534
80 124 805
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
        boolean rowChangeFlag[]=new boolean [R];
        Integer zeroIndex[]=new Integer[R];
        for(int i=0;i<R;i++){
            int currRowZeroCount=0;
            int currRowZeroIndex=0;
            for(int j=0;j<C;j++){
                matrix[i][j]=sc.nextInt();
                int dummy=matrix[i][j];
                while(dummy !=0){
                    if(dummy%10==0){
                        currRowZeroCount++;
                        currRowZeroIndex=j;
                        break;
                    }
                    dummy/=10;
                }
            }
            if(currRowZeroCount==1){
                rowChangeFlag[i]=true;
                zeroIndex[i]=currRowZeroIndex;
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(rowChangeFlag[i] && zeroIndex[i]!=j){
                    System.out.printf("%d ",matrix[i][j]+1);
                }else{
                    System.out.printf("%d ",matrix[i][j]);
                }
            }
            System.out.println();
        }
	}
}