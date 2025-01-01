/* 
The program must accept a character matrix of size RxC and the positions of the three corners
of a triangle (in any order) as the input. The program must replace the characters in the border
of the triangle with asterisks. Then the program must print the modified matrix as the output.
Boundary Condition(s):
2 R c 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space.
The next three lines from the (R+2)nd line, each contains two integers representing the position
of a corner of the triangle.
Output Format:
The first R lines, each contains C characters separated by a space.
Example Input/Output 1:
Input:
8 6
w p H p x u
a G i D x w
C t B m x v
m b g An B
w g o G t b
n s r G f i
t u w g y z
z u G C z r
1 3
7 3
4 2 -> missing value check ss
*/

//! Bresenham's Line Drawing Algorithm

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char matrix[][] = new char[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		    }
		}
		int R1 = sc.nextInt()-1;
		int C1 = sc.nextInt()-1;
		sc.nextLine();
		int R2 = sc.nextInt()-1;
		int C2 = sc.nextInt()-1;
		sc.nextLine();
		int R3 = sc.nextInt()-1;
		int C3 = sc.nextInt()-1;
		
		//passing all possible combinations
		modifier(R1,C1,R2,C2,R,C,matrix);
		modifier(R1,C1,R3,C3,R,C,matrix);
		modifier(R2,C2,R3,C3,R,C,matrix);
		
		print(matrix,R,C);
	}
	static void modifier(int stI , int stJ , int endI , int endJ , int R , int C ,char matrix[][]){
	    int currI = stI;
	    int currJ = stJ;
	    
	    int offSetI = (stI < endI)? 1 : -1;
	    int offSetJ = (stJ < endJ)? 1 : -1;
	    
	    int dx = Math.abs(stI - endI);
	    int dy = Math.abs(stJ - endJ);
	    
	    int distance = dx-dy;
	    
	    while(true){
	        matrix[currI][currJ] = '*';
	        if(currI == endI && currJ == endJ){
	            break;
	        }
	        int newDistance = distance*2;
	        if(newDistance < dx){
	            newDistance += dx;
	            currJ += offSetJ;
	        }
	        if(newDistance > (dy*-1)){
	            newDistance -= dy;
	            currI += offSetI;
	        }
	    }
	}
	static void print(char matrix[][] , int R, int C){
	    for(int i = 0 ; i <R ; i++){
	        for(int j = 0 ; j < C ;j++){
	            System.out.printf("%c ",matrix[i][j]);
	        }
	        System.out.println();
	    }
	}
}