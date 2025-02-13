import java.util.*;
public class Hello {
    static void inputGetter(int N, char matrix[][], Scanner sc){
        for(int i = 0;  i< N ; i++){
            String str = sc.nextLine();
            for(int j = 0 ; j < N ; j++){
                matrix[i][j] = str.charAt(j);
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
	    char matrix1[][] = new char[N][N];
	    char matrix2[][] = new char[M][M];
	    
	    inputGetter(N, matrix1, sc);
	    inputGetter(M, matrix2, sc);
	    
	    
	    for(int i = 0 ; i <= N-M ; i++){
	        for(int j = 0 ; j <= N-M ; j++){
	            boolean flag = true;
	            for(int k = i; k < i+M ; k++){
	                for(int l = j ; l < j+M ; l++){
	                    if(matrix1[k][l] != matrix2[k-i][l-j]){
	                        flag =false;
	                        break;
	                    }
	                }
	            }
	            if(flag){
	                System.out.printf("%d %d",i+1, j+1);
	                return;
	            }
	        }
	    }

	}
}