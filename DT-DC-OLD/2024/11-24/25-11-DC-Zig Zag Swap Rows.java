/*
The program must accept an integer matrix of size RxC as the input. The program must modfy the matrix
by swapping the rmvs in zig-zag fashion based on the following conditions.
- The first half of the ISt rw,l must be swapped woth the second half of the Rth row.
- The second half of the 2nd row must swapped with the first half of the (R-l)th row.
- The first halt ot the 3rd row must be swapped with the second halt ot the (R-2)th row.
- The second half Of the 4th must be swapped With the first halt Of the (R-3)th row.
- Similarly. the program must swap the remaining rows till (R/2)fi row in the matrix
Finally, the program must print the modified matrix as the output.
Note; The values of R and C are always even,

Input:
6 8
83 27 59 55 25 13 38 80
40 33 13 69 72 31 39 13
11 13 40 51 14 27 33 50
54 49 31 45 10 22 75 59
75 47 18 60 33 20 61 68
73 38 14 19 28 70 76 55

Output:
28 70 76 ss 25 13 38 80
40 33 13 69 75 47 18 60
10 22 75 59 14 27 33 so
54 49 31 45 11 13 40 51
72 31 39 13 33 20 61 68
73 38 14 19 83 27 59 55
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int arr[][] = new int[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
		for(int i = 0 ; i < R ; i+=2){
		    for(int j = 0 ; j < C/2 ; j++){
		        //swapping
		        int temp = arr[i][j];
		        arr[i][j]=arr[R-i-1][(C/2)+j];
		        arr[R-i-1][(C/2)+j] = temp; 
		    }
		}
		for(int i = 0 ; i < R ; i++){
		    for(int j =0 ;j < C ; j++){
		        System.out.printf("%d ",arr[i][j]);
		    }
		    System.out.println();
		}
	}
}