import java.util.*;
public class Hello {
    static void helper(int i1 , int j1 , int i2 , int j2 , int matrix[][]){
        int temp =  matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
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
		for(int j = 0 ; j < C / 2 ; j++){
		    for(int i = 0 ; i < R/2 ; i++){
		        if( j % 2 == 0){ // upper col -> lower col
		            helper( i , j , (R/2 + i) , C - 1 - j , matrix);
		        }else{ // lower col -> upper col
		            helper((R/2+i) , j , i , C - 1 - j , matrix);
		        }
		    }
		}
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}