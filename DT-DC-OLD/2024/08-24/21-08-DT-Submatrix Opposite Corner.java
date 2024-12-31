/*The program must accept an integer matrix of size RxC and the positions of two cells in the
matrix as the input. The positions of the two cells representing the positions of the opposite
corners of a submatrix in any order. The program must print the integers in the submatrix as
the output.

Input:
68 58 68 15
49 32 83 64
44 31 34 84
74 80 19 81
49 9 66 86
2 2 5 4

Output:
32 83 64
31 34 84
80 19 81
9 66 86
*/ 
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		int matrix[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int pos[]=new int[4];
		pos[0]=sc.nextInt()-1;
		pos[1]=sc.nextInt()-1;
		pos[2]=sc.nextInt()-1;
		pos[3]=sc.nextInt()-1;
		/*given in the question the input can be in any order*/
		if(pos[0]>pos[2]){
		    int temp=pos[0];
		    pos[0]=pos[2];
		    pos[2]=temp;
		}
		if(pos[1]>pos[3]){
		    int temp=pos[1];
		    pos[1]=pos[3];
		    pos[3]=temp;
		}
		for(int i=pos[0];i<=pos[2];i++){
		    for(int j=pos[1];j<=pos[3];j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}