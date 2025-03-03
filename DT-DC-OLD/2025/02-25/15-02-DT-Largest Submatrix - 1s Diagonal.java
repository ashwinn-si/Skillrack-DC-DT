import java.util.*;
public class Hello {
    
    static int helper(int currR, int currC, int R, int C, int matrix[][]){
        int size = 0;
        while(currR >= 0 && currR < R && currC >=0 && currC < C && matrix[currR][currC] == 1){
            size++;
            currR++;
            currC++;
        }
        return size;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int matrix[][] = new int[R][C];
		
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j  < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		
		int maxN = 0;
		int resR = 0, resC = 0;
		
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        if(matrix[i][j] == 1){
		            int currN = helper(i, j, R, C, matrix);
		            if(currN > maxN){
		                maxN = currN;
		                resR = i;
		                resC = j;
		            }
		        }
		    }
		}
		
		if(maxN <= 1){
		    System.out.print("-1");
		    return;
		}
		
		for(int i = resR ; i < resR + maxN ; i++){
		    for(int j = resC ; j < resC + maxN ; j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}
		

	}
}