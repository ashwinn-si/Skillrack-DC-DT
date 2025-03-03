import java.util.*;
public class Hello {
    static boolean isValidPosition(int i ,int j){
        return (i >= 0 && i < 8 && j >= 0 && j < 8);
    }
    
    static void helper(int[][] matrix, int currI, int currJ, int role, int incR, int incC){
        currI += incR;
        currJ += incC;
        while( isValidPosition(currI, currJ)){
            if(matrix[currI][currJ] != 0){
                matrix[currI][currJ] = 3;
            }else{
                matrix[currI][currJ] = role;
            }
            currI += incR;
            currJ += incC;
        }
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int rookR = sc.nextInt()-1;
		int rookC = sc.nextInt()-1;
		int bishopR = sc.nextInt()-1;
		int bishopC = sc.nextInt()-1;
        int matrix[][] = new int[8][8]; // 1-> rook | 2 -> bishop
        matrix[rookR][rookC] = 1;
        matrix[bishopR][bishopC] = 2;
        
        //stimulating bishop move
        helper(matrix, bishopR, bishopC, 2, 1, 1);
        helper(matrix, bishopR, bishopC, 2, 1, -1);
        helper(matrix, bishopR, bishopC, 2, -1, 1);
        helper(matrix, bishopR, bishopC, 2, -1, -1);
        
        //stimulating rooks move
        helper(matrix, rookR, rookC, 1, 1, 0);
        helper(matrix, rookR, rookC, 1, -1, 0);
        helper(matrix, rookR, rookC, 1, 0, 1);
        helper(matrix, rookR, rookC, 1, 0, -1);
        
        
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(i == rookR && j == rookC){
                    System.out.printf("R ");
                }else if(i == bishopR && j == bishopC){
                    System.out.printf("B ");
                }else{
                    if(matrix[i][j] == 1){
                        System.out.printf("r ");
                    }else if(matrix[i][j] == 2){
                        System.out.printf("b ");
                    }else if(matrix[i][j] == 3){
                        System.out.printf("x ");
                    }else{
                        System.out.printf("0 ");
                    }
                }
            }
            System.out.println();
        }
	}
}