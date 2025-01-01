/*A train consists of R*C coaches. The train is standing on a railway platform which is designed in
a vertical zig-zag fashion. The program must accept an integer matrix of size R*C containing
only I's and O's representing coaches of the train. The top-left cell of the matrix represents the
one of the ends of the train. The integer 1 indicates that the coach is full and O indicates that
the coach is empty. The program must print the length of the longest empty coaches in the
train.

Input:
10 7
1 1 1 0 1 1 0
1 1 0 1 1 0 1
0 0 0 0 0 0 0
1 0 1 1 0 1 0
0 0 1 0 1 1 1
1 0 0 0 0 0 0
1 1 0 1 0 0 0
1 1 0 1 0 0 1

Output
6
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int flattenMatrix[] = new int[R*C];
		int currIndex=0;
	   //flattening the 2D matrix into 1D matrix
        for(int j = 0 ; j < C ; j++){
            int i = (j%2==0)? 0 : R-1;
            int inc = (j%2==0)? 1 : -1;
            while(i>=0 && i<R){
                flattenMatrix[currIndex]=matrix[i][j];
                i+=inc;
                currIndex++;
            }
        }
        long result = -1;
        long currCount = 0;
        for(int i : flattenMatrix){
            if(i == 1){
                if(result < currCount){
                    result = currCount;
                }
                currCount=-1;
            }
            currCount++;
        }
        //main test case if all the elements are 0
        if(currCount > result){
            result = currCount;
        }
        System.out.print(result);
	}
}