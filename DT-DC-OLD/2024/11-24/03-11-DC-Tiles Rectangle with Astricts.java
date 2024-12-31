/*The program must accept a character matrix of size RxC and the positions of the four corners
of a tilted rectangle (by 45 degrees) as the input. The program must replace the characters in
the border of the tilted rectangle with asterisks. Then the program must print the modified
matrix as the output The order of the four corners of the tilted rectangle is given below.
Top, Right, Bottom and Left.

Input:
9 7
w h g E C g E
h y b g G w A
D j s z p r r
o z q l v g y
t C s w s h y
d m g d k D f
x o C i B v z
F G F C A d m
n t u q B i z
1 3
5 7
7 5
*/
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
		int topR = sc.nextInt();
		int topC = sc.nextInt();
		sc.nextLine();
		int rightR = sc.nextInt();
		int rightC = sc.nextInt();
		sc.nextLine();
		int bottomR = sc.nextInt();
		int bottomC = sc.nextInt();
		sc.nextLine();
		int leftR = sc.nextInt();
		int leftC = sc.nextInt();
		
		helper(topR-1,topC-1,rightR,rightC,matrix,1);
		helper(rightR-1,rightC-1,bottomR-1,bottomC-1,matrix,2);
		helper(bottomR-1,bottomC-1,leftR-1,leftC-1,matrix,3);
 		helper(leftR-1,leftC-1,topR-1,topC-1,matrix,4);
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        System.out.printf("%c ",matrix[i][j]);
		    }
		    System.out.println();
		}

	}
	static void helper(int stR , int stC , int endR , int endC , char matrix[][] , int flag){
	    int incX = 0;
	    int incY = 0;
	    switch(flag){
	        case 1: // top  -> right
	            incX = 1;
	            incY = 1;
	            break;
	        case 2: // right -> bottom
	            incX = 1;
	            incY = -1;
	            break;
	        case 3:// bottom -> left
	            incX = -1;
	            incY = -1;
	            break;
	        default: // left -> top
	            incX = -1;
	            incY = 1;
	    }
	    while(stR != endR && stC != endC){
	        matrix[stR][stC]='*';
	        stR+=incX;
	        stC+=incY;
	    }
	}
}