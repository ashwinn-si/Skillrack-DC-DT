import java.util.*;
public class Main {
    static boolean boundChecker(int X, int end){
        if(X >= 0 && X < end){
            return true;
        }
        return false;
    }
    static int helper(int stI , int stJ , int desI , int desJ, int R, int C, int matrix[][]){
        
        //there are two possible cases 
        // i) if the row or col 
        // ii) if row and col is same
        
        if(stI == desI || stJ == desJ){
            int currSum = 0;
            if(stI == desI){
                int st = Math.min(stJ , desJ);
                int end = Math.max(stJ, desJ);
                for(int i = st ; i <= end ; i++){
                    currSum += matrix[stI][i];
                }
            }else{
                int st = Math.min(stI, desI);
                int end = Math.max(stI, desI);
                for(int i = st ; i <= end ; i++){
                    currSum += matrix[i][stJ];
                }
            }
            return currSum;
        }else{
            int result = Integer.MAX_VALUE;
            // make the row value equal and then  make the col value equal
            int currSum = 0;
            int st = Math.min(stI , desI);
            int end = Math.max(stI , desI);
            for(int i = st ; i <= end ; i++){
                if(boundChecker( i , R)){
                  currSum += matrix[i][stJ];
                }
            }
            int offSet = (stJ > desJ) ? -1 : 1;
            st = Math.min(stJ+offSet , desJ);
            end = Math.max(stJ+offSet , desJ);
            
            for(int i = st ; i <= end ; i++){
                if(boundChecker( i , C)){
                    currSum += matrix[desI][i];
                }
            }
            
            result = Math.min(currSum , result);
            
            //make the col value equal and then row value equal
            currSum = 0;
            st = Math.min(stJ , desJ);
            end = Math.max(stJ , desJ);
            for(int i = st ; i <= end ; i++){
                if(boundChecker(i , C)){
                    currSum += matrix[stI][i];
                }
            }
            offSet = (stI > desI) ? -1 : 1;
            st = Math.min(stI+ offSet , desI);
            end = Math.max(stI+ offSet , desI);
            
            for(int i = st ; i <= end ; i++){
                if(boundChecker( i , R)){
                    currSum += matrix[i][desJ];
                }
            }
            result = Math.min(currSum , result);
            return result;
        }
        
    }
    
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
		
	    List<Position> allPosition = new ArrayList<>(); 
	    int N = sc.nextInt();
	    for(int k = 0 ; k < N ; k++){
	        int se = sc.nextInt();
	        for(int i = 0 ; i < R; i++){
	            for(int j = 0 ; j < C ;j++){
	                if(matrix[i][j] == se){
	                    allPosition.add(new Position(i , j));
	                }
	            }
	        }
	    }
	    
	    int result = 0;
	    for(int k = 1 ; k < N ; k++){
	        Position prevP = allPosition.get(k-1);
	        Position currP = allPosition.get(k);
	        
	        result += helper(prevP.x , prevP.y , currP.x , currP.y , R , C, matrix);
	        
	    }
	
	    for(int k = 1 ; k < N-1 ; k++){
	        Position p = allPosition.get(k);
	        result -= matrix[p.x][p.y];
	    }
	    
	    System.out.print(result);

	}
}

class Position{
    int x , y;
    Position(int x , int y){
        this.x = x;
        this.y = y;
    }
}