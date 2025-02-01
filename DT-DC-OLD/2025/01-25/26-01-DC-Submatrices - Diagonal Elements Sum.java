import java.util.*;
public class Hello {
    static int helper(int R , int C , int N , int matrix[][]){
        int diagonalSum = 0;
        int counter = 0;
        for(int i = R ; i < R+N ; i++){
            diagonalSum += matrix[i][C+counter];
            counter++;
        }
        counter = 0;
        for(int j = C+N-1 ; j >= C ; j--){
            diagonalSum += matrix[R+counter][j];
            counter++;
        }
        if(N % 2 == 1){
            diagonalSum -= matrix[R + (N/2)][C + (N/2)];
        }
        return (diagonalSum);
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i  < R ;i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int N = sc.nextInt();
		
		for(int i = 0 ; i < R ; i+=N){
		    for(int j = 0 ; j < C ; j+=N){
		        if( i + N <= R && j + N <= C){
		            System.out.printf("%d ",helper(i, j, N, matrix));
		        }
		    }
		}
	}
}