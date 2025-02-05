import java.util.*;
public class Hello {
    static void oppiedSeatFinder(int x[], int y[], char matrix[][], int R , int C){
        while(x[0] >= 0 && x[0] < R && y[0] >=0 && y[0] < C){
            if(matrix[x[0]][y[0]] != '#'){
                return;
            }
            y[0]++;
            if(y[0] == C){
                y[0] = 0;
                x[0]++;
            }
        }
    }
    
    static void emptySeatFinder(int x[] , int y[], char matrix[][], int R , int C){
        while(x[0] >= 0 && x[0] < R && y[0] >= 0 && y[0] < C){
            if(matrix[x[0]][y[0]] == '#'){
                return;
            }
            y[0]++;
            if(y[0] == C){
                y[0] = 0;
                x[0]--;
            }
        }
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char matrix[][] = new char[R][C];
		
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		    }
		}
		
		int emptySeatRow[] = new int[]{R-1};
		int emptySeatCol[] = new int[]{0};
		int oppiedSeatRow[] = new int[]{0};
		int oppiedSeatCol[] = new int[]{0};
		
		while(emptySeatRow[0] > oppiedSeatRow[0]){
		    emptySeatFinder(emptySeatRow, emptySeatCol, matrix, R, C);
		    oppiedSeatFinder(oppiedSeatRow, oppiedSeatCol, matrix, R, C);
		    if(emptySeatRow[0] > oppiedSeatRow[0]){
		        matrix[emptySeatRow[0]][emptySeatCol[0]] = matrix[oppiedSeatRow[0]][oppiedSeatCol[0]];
		        matrix[oppiedSeatRow[0]][oppiedSeatCol[0]] = '#';
		    }
		}
		
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        System.out.printf("%c ", matrix[i][j]);
		    }
		    System.out.println();
		}

	}
}