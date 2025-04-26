import java.util.*;
public class Hello {
    
    static int helper(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return ch - 'a' +  1;
        }
        return ch - 'A' + 1;
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = helper(sc.next().charAt(0));
		    }
		}
		
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        
        //rows and cols are not same
        if(R1 != R2  && C1 != C2){
            int stR = Math.min(R1, R2) - 1;
            int endR = Math.max(R1, R2) - 1;
            int stC = Math.min(C1,C2) - 1;
            int endC = Math.max(C1, C2) - 1;
            
            //making the rows same and then rows
            int result1 = 0;
            int coor [] = new int[]{stR, stC, endR, endC};
            for(int i = coor[0] ; i <= coor[2] ; i++){
                result1 += matrix[i][coor[1]];
            }
            coor[1]++;
            for(int j = coor[1] ; j <= coor[3] ; j++){
                result1 += matrix[coor[2]][j];
            }
            
            //making the cols same and then rows
            int result2 = 0;
            coor = new int[]{stR, stC, endR, endC};
            for(int j = coor[1]; j <= coor[3] ; j++){
                result2 += matrix[coor[0]][j];
            }
            coor[0]++;
            for(int i = coor[0] ; i <= coor[2] ; i++){
                result2 += matrix[i][coor[3]];
            }
            
            System.out.print(Math.min(result1, result2));
            return;
        }
        
    
        //rows and cols are same    
        if(R1 == R2){
            int result = 0;
            for(int j = Math.min(C1, C2) - 1; j <= Math.max(C1, C2) - 1; j++){
                result += matrix[R1 - 1][j];
            }
            System.out.print(result);
            return;
        }
        
        if(C1 == C2){
            int result = 0;
            for(int i = Math.min(R1, R2) - 1; i <= Math.max(R1, R2) - 1; i++){
                result += matrix[i][C1 - 1];
            }
            System.out.print(result);
            return;
        }
        
	}
}