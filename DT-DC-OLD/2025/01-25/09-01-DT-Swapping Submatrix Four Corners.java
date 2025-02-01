import java.util.*;
public class Hello {

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
		int K = sc.nextInt();
		for(int i = 0 ; i < K  ;i++){
		    for(int j = 0 ; j < K ; j++){
		        //top left -> bottom right
		        int temp = matrix[i][j];
		        matrix[i][j] = matrix[R-K+i][C-K+j];
		        matrix[R-K+i][C-K+j] = temp;
		        
		        //top right -> bottom left
		        temp = matrix[i][C-K+j];
		        matrix[i][C-K+j] = matrix[R-K+i][j];
		        matrix[R-K+i][j] = temp;
		    }
		}
		
		for(int i = 0 ;i < R ; i++){
		    for(int j =0 ; j < C ;j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}