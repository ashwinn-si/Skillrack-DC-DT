import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		char matrix [][] = new char[N][N];
		char res [][] = new char[N][N];
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ; j < N ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		        res[i][j] = matrix[i][j];
		    }
		}
		
		int Q = sc.nextInt();
		for(int k = 0 ; k < Q ; k++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    //changing the row
		    for(int i = x-1 ; i < y ; i++){
		        for(int j = 0 ; j < N ; j++){
                res[i][j] = res[i][j] == '' ? matrix[i][j] : '';
		        }
		    }
		    
		    //changing the col
		    for(int j = x-1 ; j < y ; j++){
		        for(int i = 0 ; i < N ; i++){
		            res[i][j] = (res[i][j] == '') ? matrix[i][j] : '';
		        }
		    }
		    
		}
		
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ; j < N ; j++){
		        System.out.printf("%c ",res[i][j]);
		    }
		    System.out.println();
		}
	}
}