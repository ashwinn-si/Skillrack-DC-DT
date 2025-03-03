import java.util.*;
public class Hello {

    static void helper(int R,int C, int minRow[], int minCol[], int flag, int matrix1[][], int matrix2[][], Scanner sc){
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                if(flag == 1){ // read input for matrix1
                    matrix1[i][j] = sc.nextInt();
                    minRow[i] = Math.min(minRow[i], matrix1[i][j]);
                }else if(flag == 2){ // read input for matrix2
                    matrix2[i][j] = sc.nextInt();
                    minCol[j] = Math.min(matrix2[i][j], minCol[j]);
                }else{
                    System.out.printf("%d ",Math.min(minRow[i], minCol[j]));
                }
            }
            if(flag == 3) System.out.println();
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
    
		int C = sc.nextInt();
		int minRow[] = new int[R];
		int minCol[] = new int[C];
		Arrays.fill(minRow,Integer.MAX_VALUE);
		Arrays.fill(minCol,Integer.MAX_VALUE);
		
		int matrix1[][] = new int[R][C];
		int matrix2[][] = new int[R][C];
		
		helper(R, C, minRow, minCol, 1, matrix1, matrix2, sc);
		helper(R, C, minRow, minCol, 2, matrix1, matrix2, sc);
		
		helper(R, C, minRow, minCol, 3, matrix1, matrix2, sc);

	}
}