import java.util.*;
public class Hello {
    static boolean boundaryChecker(int row, int col, int R, int C){
        return row >= 0 && row < R && col >=0 && col < C;
    }
    static boolean helper(char matrix[][], int row, int col,int offsets[][],int R, int C){
        for(int i = 0; i < 8 ; i++){
            int newRow = row + offsets[i][0];
            int newCol = col + offsets[i][1];
            if(boundaryChecker(newRow, newCol, R, C)){
                if(matrix[newRow][newCol] == matrix[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
    
    static void changer(char matrix[][], int row, int col, int offsets[][], int R, int C, char ch){
        for(int i = 0 ; i < 8 ; i++){
            int newRow = row + offsets[i][0];
            int newCol = col + offsets[i][1];
            if(boundaryChecker(newRow, newCol, R, C)){
                matrix[newRow][newCol] = matrix[row][col];
            }
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
	    char matrix[][] = new char[R][C];
	    sc.nextLine();
	    
	    for(int i = 0 ; i < R ; i++){
	        for(int j = 0 ; j < C ; j++){
	            matrix[i][j] = sc.next().charAt(0);
	        }
	    }
	    char target = sc.next().charAt(0);
	   
	    int offsets[][] = new int[][]{{1,1},{1,-1},{-1,1},{-1,-1},{0,-1},{0,1},{1,0},{-1,0}};
	    List<List<Integer>> resultIndex = new ArrayList<>();
	    for(int i = 0 ; i < R ; i++){
	        for(int j = 0 ; j < C ; j++){
	           if(matrix[i][j] == target && helper( matrix, i, j, offsets, R, C)){
	               resultIndex.add(new ArrayList<>(Arrays.asList(i ,j)));
	           }
	        }
	    }
        
        for(int i = 0 ; i < resultIndex.size(); i++){
            changer(matrix, resultIndex.get(i).get(0), resultIndex.get(i).get(1), offsets, R,C, target);
        }
        
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j< C ; j++){
                System.out.printf("%c ",matrix[i][j]);
            }
            System.out.println();
        }
       
        
	}
}