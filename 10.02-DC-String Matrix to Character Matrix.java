import java.util.*;
public class Hello {
    static void helper(int stI, int stJ, String str, char matrix[][]){
        int count = 0;
        for(int i = stI; i < stI + 3 ; i++){
            for(int j = stJ ; j < stJ + 3  ; j++){
                matrix[i][j] = str.charAt(count);
                count++;
            }
        }
        
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char matrix[][] = new char[R*3][C*3];
		int stI = 0, stJ = 0;
		for(int i =  0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        String str = sc.next().strip();
		        helper(stI, stJ, str, matrix);
		        stJ += 3;
		        if(stJ == C*3){
		            stJ = 0;
		            stI += 3;
		        }
		    }
		}
		for(int i = 0 ; i < R*3 ; i++){
		    for(int j = 0 ; j < C * 3 ; j++){
		        System.out.printf("%c ",matrix[i][j]);
		    }
		    System.out.println();
		}
       
        
	}
}