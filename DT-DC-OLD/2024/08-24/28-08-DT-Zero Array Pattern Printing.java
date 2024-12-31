/*The program must accept an integer N as the input. The program must print the pattern of
(2*N)-1 lines based on the following conditions.
- Each row of the pattern contains N characters.
- In the ISt row, the Nth character is O and the remaining characters are asterisks.
- In the 2nd row, the Nth, (N-l)th characters are O and the remaining characters are asterisks.
- In the 3rd row, the Nth, (N-2)th characters are O and the remaining characters are asterisks.
- Similarly, the first N lines of the pattern are printed.
- In the (N+l)th row, the Nth 2nd characters are O and the remaining characters are asterisks.
- In the (N +2)th row, the Nth, 3rd characters are O and the remaining characters are asterisks.
- Similarly, the remaining lines of the pattern are printed.
Note: All characters in each row must be separated by a space.

Input:
3

Output:
* * 0
* 0 0
0 * 0
* 0 0
* * 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[(2*n)-1][n];
		int j=n-1;
		boolean flag=true;
	    for(int i=0;i<(2*n)-1;i++){
	        matrix[i][j]++;
	        if(j==0){
	            flag=false;
	        }
	        if(flag){
	            j--;
	        }else{
	            j++;
	        }
	        matrix[i][n-1]++;
	    }
	    for(int i=0;i<2*n-1;i++){
	        for(j=0;j<n;j++){
	            if(matrix[i][j]==0){
	                System.out.printf("* ");
	            }else{
	                System.out.printf("0 ");
	            }
	        }
	        System.out.println();
	    }

	}
}