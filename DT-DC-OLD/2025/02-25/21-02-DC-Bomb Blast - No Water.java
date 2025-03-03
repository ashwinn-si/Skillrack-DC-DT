import java.util.*;
public class Hello {
    static boolean helper(int R, int C,int row, int col){
        return row >=0 && row < R && col >= 0 && col < C;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
	    sc.nextLine();
	    int matrix[][] = new int[R][C];
	    for(int i = 0 ; i < R ; i++){
	        for(int j = 0; j< C ; j++){
	            matrix[i][j] = sc.nextInt();
	        }
	    }
	    
	    //multiple of 5 na bomb
	    // multiple of 3 na water and 3 and 5 na water
	    //left, right, top, bottom order
	    int[][] offsets = new int[][]{{0,-1},{0,1},{-1,0},{1,0}}; 
	    for(int row = R-1 ; row >= 0 ; row--){
	        for(int col = C-1 ; col >= 0 ; col--){
	            if(matrix[row][col] % 5 == 0 && matrix[row][col] % 3 != 0){
	                matrix[row][col] = 0;
	                for(int i = 0 ; i < 4 ; i++){
	                    if(helper(R, C, row + offsets[i][0], col + offsets[i][1])){
	                        if(matrix[row + offsets[i][0]][col + offsets[i][1]] % 3 == 0){
	                            break;
	                        }else{
	                            matrix[row + offsets[i][0]][col + offsets[i][1]] = 0;
	                        }
	                    }
	                }
	            }
	        }
	    }
	        
	   for(int i = 0 ; i < R ; i++){
	       for(int j = 0 ; j  < C ; j++){
	           System.out.printf("%d ",matrix[i][j]);
	       }
	       System.out.println();
	       
	   }
	  
	}
}