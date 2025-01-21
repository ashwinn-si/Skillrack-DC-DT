import java.util.*;
public class Hello {
    static void helper(int stI , int endI , int stJ , int endJ , String matrix[][]){
        String temp = matrix[stI+1][stJ];
        matrix[stI+1][stJ] = matrix[stI][stJ+1];
        matrix[stI][stJ+1] = temp;
        
        temp = matrix[stI+2][stJ];
        matrix[stI+2][stJ] = matrix[stI][stJ+2];
        matrix[stI][stJ+2] = temp;
        
        temp = matrix[stI+1][stJ+2];
        matrix[stI+1][stJ+2] = matrix[stI+2][stJ+1];
        matrix[stI+2][stJ+1] = temp;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		String matrix[][] = new String[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next();
		    }
		}
		
		for(int i = 0 ; i < R-2 ; i++){
		    for(int j = 0 ; j  < C-2 ; j++){
		        if(Character.isLetter(matrix[i+1][j+1].charAt(0))){
		            helper(i , i+3 , j , j+3 , matrix);
		        }
		    }
		}
		
		for(int i = 0 ;i < R ; i++){
		    for(int j = 0 ;j  < C ; j++){
		        System.out.printf("%s ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}