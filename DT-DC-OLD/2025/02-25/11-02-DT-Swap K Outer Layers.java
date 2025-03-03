import java.util.*;
public class Hello {
    static void swap(int r, int c, char m1[][], char m2[][]){
        char char1 = m1[r][c];
        m1[r][c] = m2[r][c];
        m2[r][c] = char1;
    }
    
    static void helper(int stCol, int endCol, int stRow, int endRow, char matrix1[][], char matrix2[][]){
        for(int i = stRow; i <= endRow; i++){
            for(int j = stCol; j <= endCol ;j++){
                swap(i,j,matrix1,matrix2);
            }
        }
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		char matrix1[][] = new char[N][N];
		char matrix2[][] = new char[N][N];
		for(int matrix = 0; matrix < 2 ; matrix++){
		    for(int i = 0 ; i < N ; i++){
		        for(int j = 0 ; j <N ; j++){
		            if(matrix == 0){
		                matrix1[i][j] = sc.next().charAt(0);
		            }else{
		                matrix2[i][j] = sc.next().charAt(0);
		            }
		        }
		    }
		}
		int layer = sc.nextInt();
		
		helper(0,layer-1,0,N-1, matrix1, matrix2);
		helper(N-layer, N-1, 0, N-1, matrix1, matrix2);
		helper(layer, N-1-layer, 0, layer-1, matrix1, matrix2);
        helper(layer, N-layer-1, N-layer, N-1, matrix1, matrix2);
        for(int matrix=0; matrix < 2 ; matrix++){
            for(int i = 0 ; i < N ; i++){
                for(int j = 0; j < N ; j++){
                    if(matrix == 0){
                        System.out.printf("%c ",matrix1[i][j]);
                    }else{
                        System.out.printf("%c ",matrix2[i][j]);
                    }
                }
                System.out.println();
            }
        }
	}
}