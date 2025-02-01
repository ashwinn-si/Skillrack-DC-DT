import java.util.*;
public class Hello {
    static int helper(int stI , int endI , int stJ , int endJ, int matrix[][]){
        int currSum = 0;
        for(int i = stI ; i < endI+1 ; i++){
            for(int j = stJ ; j < endJ+1 ; j++){
                currSum += matrix[i][j];
            }
        }
        return currSum;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int matrix[][] = new int[N][N];
		for(int i = 0 ; i < N; i++){
		    for(int j = 0; j  < N ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		for(int i : new int[]{
		    helper(0, N / 2 - 1 , 0 , N / 2 - 1 , matrix),
		    helper(0 , N / 4 - 1 , N / 2 , N - 1 , matrix),
		    helper(N / 4 , N / 2 -1 , N / 2 , N - 1 , matrix),
		    helper(N / 2 , N - 1 , 0 , N / 4 -1 , matrix),
		    helper(N / 2 , N - 1 , N / 4 , N / 2 - 1 , matrix),
		    helper(N / 2 , (N / 2) + (N / 4) - 1 , N / 2 , (N/2) + (N/4) - 1, matrix),
		    helper(N / 2 , (N / 2) + (N / 4) - 1 , (N / 2) + (N / 4) , N - 1 , matrix),
		    helper((N / 2) + (N / 4) , N - 1 , (N / 2) , (N / 2) + (N / 4 ) - 1, matrix),
		    helper((N / 2) + (N / 4) , N - 1, (N / 2) + (N / 4) , N - 1, matrix)
		}){
		    System.out.printf("%d ",i);
		}
		

	}
}