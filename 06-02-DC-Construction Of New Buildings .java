import java.util.*;
public class Hello {
    static boolean boundaryChecker(int currI, int currJ, int R, int C){
        return (currI >=0 && currI < R && currJ >=0 && currJ < C);
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] matrix = new char[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ;j++){
		        matrix[i][j] = sc.next().charAt(0);
		    }
		}
		
		int buildingCount = 0;
		int offsets[][] = new int[][]{{1,-1},{1,1},{-1,1},{-1,-1}};
		for(int row = 0 ; row < R ; row++){
		    for(int col = 0 ; col < C ;col++){
		        for(int k = 0; k < 4 ; k++){
		            int adjR = row + offsets[k][0];
		            int adjC = col + offsets[k][1];
		            if(boundaryChecker(adjR, adjC, R, C) && matrix[adjR][adjC] == '-' && matrix[row][col] == '*'){
		                matrix[adjR][adjC] = '#';
		                buildingCount++;
		            }
		        }
		    }
		}
	
		System.out.print(buildingCount);

	}
}