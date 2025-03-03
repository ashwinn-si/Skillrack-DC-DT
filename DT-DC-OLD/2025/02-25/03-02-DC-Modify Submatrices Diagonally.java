import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		for(int i = 0 ;i  < R; i++){
		    for(int j = 0 ;j  < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int K = sc.nextInt();
        
        char alphaMatrix[][] = new char[R/K][C/K];
        
        alphaMatrixGenerator(alphaMatrix, R/K , C/K);

        for(int i = 0; i < R ; i++){
            for(int j =0 ; j < C ; j++){
                System.out.printf("%c ", helper(matrix[i][j] , alphaMatrix[(i) / ((K))][(j) / ((K))]));
            }
            System.out.println();
        }
      
	}
	
	private static  void alphaMatrixGenerator(char matrix[][] , int R, int C){
	    char ch = 'a';
	        
	    for(int I = R - 1; I >= 0 ; I--){
	        int currJ = 0, currI = I;
	        while(boundaryChecker(currI, currJ, R , C)){
	            matrix[currI][currJ] = ch;
	            ch++;
	            if(ch > 'z') ch = 'a';
	            currI++;
	            currJ++;
	        }
	    }
	    
	    for(int J = 1; J < C ; J++){
	        int currI = 0, currJ = J;
	        while(boundaryChecker(currI , currJ, R, C)){
	            matrix[currI][currJ] = ch;
	            ch++;
	            if(ch > 'z') ch = 'a';
	            currI++;
	            currJ++;
	        }
	    }
	}
	
	private static boolean boundaryChecker(int i , int j , int R ,int C){
	    return(i >= 0 && i < R && j >= 0 && j < C);
	}
	
	private static char helper(int num , char ch){
	    if(num == 1) return Character.toUpperCase(ch);
	    return ch;
	}
}