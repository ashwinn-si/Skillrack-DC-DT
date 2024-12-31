/*The program must accept two integers R and C representing the size RxC of a grid of lamps as
the input. Initially, all the lamps turned OFF (O) in the grid. The program also accepts Q queries,
where each query contains two integers representing the position of a lamp to be turned ON
(1). For each query, the lamp present in the specified position will be turned ON and all other
lamps present in the same row, column will be toggled (OFF to ON or ON to OFF). Finally, the
program must print the status of RxC grid of lamps after processing Q queries as the output.
Input:
4 5
3
1 2
4 3
1 5

Output:
0 0 1 0 1
0 1 1 0 1
0 1 1 0 1
1 0 1 1 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
        int matrix[][]=new int[R][C];
        int N=sc.nextInt();
        sc.nextLine();
        for(int e=0;e<N;e++){
            int curr_i=sc.nextInt()-1;
            int curr_j=sc.nextInt()-1;
            matrix[curr_i][curr_j]=1;
            for(int i=0;i<R;i++){
                if(matrix[i][curr_j]==0){
                    matrix[i][curr_j]=1;
                }else{
                    matrix[i][curr_j]=0;
                }
            }
            for(int j=0;j<C;j++){
                if(matrix[curr_i][j]==0){
                    matrix[curr_i][j]=1;
                }else{
                    matrix[curr_i][j]=0;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
	}
}
