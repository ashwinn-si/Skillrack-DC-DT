/*The program must accept a character matrix of size RxC and the positions of two cells Cl (X 1,
YI), C2 (X2, Y2) as the input. The program must print the characters from the cell Cl to the cell
C2 in vertical zig-zag direction. The vertical zig-zag traversal from the cell Cl to the cell C2 is
explained below.
- The traversal always begins from the cell Cl and it moves towards the bottom in the same
column K.
- Then it moves from bottom to top in the next column K+l.
- Then it moves from top to bottom in the next column K+2.
- Similarly, it moves in vertical zig-zag direction until it reaches the cell C2.
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
		int stR = sc.nextInt()-1;
		int stC = sc.nextInt()-1;
		sc.nextLine();
		int endR = sc.nextInt()-1;
        int endC = sc.nextInt()-1;
        boolean flag=true;
        while(true){
            if(!printer(stR , stC , flag , endR , endC , R , matrix)){
                System.out.printf("%c",matrix[endR][endC]);
                break;
            }
            if(flag){ // flag -> true [moving from up to down] , flag -> false [moving from down to up]
                flag = false;
                stR = R-1; 
            }else{
                flag = true;
                stR = 0;
            }
            stC++;
            
        }
        
	}
	static boolean printer(int currR , int currC , boolean flag , int targetR , int targetC , int R , char matrix[][]){
	   int increment = (flag) ? 1 : -1 ;
	   while(currR >= 0  && currR < R && currC>=0 && (currC != targetC || currR != targetR )){
	       System.out.printf("%c",matrix[currR][currC]);
	       currR+=increment;
	   }
	   if(currC == targetC && currR == targetR){
	       return false;
	   }
	   return true;
	}
}