/*The program must accept an integer matrix of size NXN as the input. The program must print
YES if the sum of integers in any two quadrants among the four quadrants of the matrix are
equal. Else the program must print NO as the output
Note; The value of N is always even.

Input:
4
1 2 2 1
2 3 2 2
2 3 3 2
1 2 2 2

Output:
YES

Explanation:
The sum of integers in the top-left quadrant of the matrix (I +2+2+3) is 8.
The sum of integers in the top-right quadrant of the matrix (2+1+2+2) is 7.
The sum of integers in the bottom-left quadrant of the matrix (2+3+1+2) is 8.
The sum of integers in the bottom-right quadrant of the matrix (3+2+2+2) is 9.
Here the sum of integers in the top-left quadrant is equal to the sum of integers in the
bottom-left quadrant.
So YES is printed as the output.
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		int N=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int inc=N/2;
		for(int i=0;i<=N-(N/2);i+=inc){
		    for(int j=0;j<=N-(N/2);j+=inc){
		        int sum=0;
		        for(int k=i;k<i+(N/2);k++){
		            for(int l=j;l<j+(N/2);l++){
		                sum+=matrix[k][l];
		            }
		        }
		        if(map.get(sum)!=null){
		            System.out.print("YES");
		            return;
		        }else{
		            map.put(sum,true);
		        }
		    }
		}
		System.out.print("NO");

	}
}
