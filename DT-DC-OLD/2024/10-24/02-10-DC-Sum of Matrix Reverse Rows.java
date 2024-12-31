/*The program must accept two integer matrices MI and M2 are of equal size RxC as the input. In MI and M2r the program must reverse the integers
in the odd positions of the odd rows and the integers in the even positions of the even rows. Then the program must print the sum of M 1 and M2 as
the output

Input:
5 5
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
9 3 5 6 9
4 2 8 7 6
8 6 5 9 2
4 6 2 8 1
1 6 3 4 5

Output
14 5 8 10 10
6 12 12 5 12
9 10 10 15 11
8 15 8 11 9
14 12 10 12 6

Explanation:
After reversing the integers in the odd positions of the odd rows and the integers in the even positions of the even rows, the matrix MI becomes
5 2 3 4 1
2 5 4 3 6
7 4 5 6 3
4 7 6 5 8
9 6 7 8 5
After reversing the integers in the odd positions of the odd rows and the integers in the even positions of the even rows, the matrix M2 becomes
9 3 5 6 9
4 7 8 2 6
2 6 5 9 8
4 8 2 6 1
5 6 3 4 1
The sum of MI and M2 is given below.
14 5 8 10 10
6 12 12 5 12
9 10 10 15 11
8 15 8 11 9
14 12 10 12 6
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
		int matrix1[][]=new int[R][C];
		int matrix2[][]=new int[R][C];
		
		//getting input from user
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix1[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix2[i][j]=sc.nextInt();
		    }
		} 
		
		// swapping the elements
		swapping(R,C,matrix1);
		swapping(R,C,matrix2);
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        System.out.printf("%d ",matrix1[i][j]+matrix2[i][j]);
		    }
		    System.out.println();
		}
	}
	static void swapping(int R,int C,int matrix[][]){
	    for(int i=0;i<R;i++){
	        ArrayList<Integer> curr_pos=new ArrayList<>();
	        for(int j=0;j<C;j++){
	            if(i%2==0 && j%2==0){
	                curr_pos.add(j);
	            }
	            if(i%2==1 && j%2==1){
	                curr_pos.add(j);
	            }
	        }
	        int len=curr_pos.size();
	        for(int j=0;j<(int)len/2;j++){
	            int temp=matrix[i][curr_pos.get(j)];
	            matrix[i][curr_pos.get(j)]=matrix[i][curr_pos.get(len-1-j)];
	            matrix[i][curr_pos.get(len-1-j)]=temp;
	        }
	    }
	}
	
}