/*The program must accept an integer N as the input. The program must generate a grid of size
RxC with the asterisks, where R represents the number of rows in the grid (N) and C represents
the number of columns in the grid ((2*N)-1). Then the program must generate a sequence of
integers with the squares of the integers l, 2, 3, 4, (3*N)-3. Then the program must modify
the grid by replacing the asterisks with the integers in the generated sequence based on the
following conditions.
- The asterisks present in the cells from the bottom-left to the top-middle must be replaced
with the first N integers in the generated sequence.
- Then the asterisks present in the cells from the top-middle (exclusive) to the bottom-right
must be replaced with the next (N-1) integers in the generated sequence.
- Then the asterisks present in the alternate cells from the bottom-right to the bottom-left
(both exclusive) must be replaced with the remaining integers in the generated sequence.
Finally, the program must print the RxC grid as the output.

Example Input/Output 1:
Input:
3

Output:
**9**
*4*16*
1*36*25
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[N][(2*N)-1];
		int no_times=N;
		int number=1;
		int curr_i=N-1,curr_j=0;
		while(curr_i>=0){
		    matrix[curr_i][curr_j]=number*number;
		    number+=1;
		    curr_i-=1;
		    curr_j+=1;
		}
		curr_i+=2;
		while(curr_i<N){
		    matrix[curr_i][curr_j]=number*number;
		    number+=1;
		    curr_i+=1;
		    curr_j+=1;
		}
		curr_i=N-1;
		curr_j=(2*N-2);
		for(;curr_j>=0;curr_j-=2){
		    if(matrix[curr_i][curr_j] ==0){
		        matrix[curr_i][curr_j]=number*number;
		        number+=1;
		    }
		}
		for(int i=0;i<N;i++){
		    for(int j=0;j<2*N-1;j++){
		        if(matrix[i][j]==0){
		            System.out.printf("*");
		        }else{
		            System.out.printf("%d",matrix[i][j]);
		        }
		    }
		    System.out.println();
		}

	}
}