import java.util.*;
public class Hello {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    
    static void helper(int stRow, int stCol , int K, char matrix[][]){
        for(int col = stCol ; col < stCol + K ; col++){
            int st = stRow, end = stRow + K -1;
            while(st < end){
                char temp = matrix[st][col];
                matrix[st][col] = matrix[end][col];
                matrix[end][col] = temp;
                st++;
                end--;
            }
        }    
    }
    
    public static void main(String[] args) {
        //Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char matrix[][] = new char[R][C];
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        
        int K = sc.nextInt();
        
        for(int i = 0 ; i < R ; i += K){
            for(int j = 0 ; j < C ; j += K){
                if(isVowel(matrix[ i + K -1][j + K -1])){
                    helper(i, j, K, matrix);
                }
            }
        }
        
        for(int i = 0 ; i  < R ; i++){
            for(int j = 0 ; j < C ; j++){
                System.out.printf("%c ", matrix[i][j]);
            }
            System.out.println();
        }
        
	}
}