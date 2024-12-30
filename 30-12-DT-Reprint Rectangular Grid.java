import java.util.*;
public class Hello {
    static HashMap<Character,Integer> hash = new HashMap<>();
    static boolean helper(char target , char ch){
        return target == ch;
    }
    static void helper2(char target , char ch){
        if(target == ch){
            return;
        }
        if((target == 'R' && ch == 'B') || (target == 'B' && ch == 'R')){
            hash.put(target,hash.get(target)+1);
            hash.put('G',hash.get('G')+1);
        }else{
            hash.put(target,hash.get(target)+1);
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char [][] matrix = new char[R][C];
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        char ch = sc.next().charAt(0);
        hash.put('R',0);
        hash.put('B',0);
        hash.put('G',0);
        for(int i = 0 ; i < R; i++){
            for(int j = 0 ; j < C ;j++){
                //checking if the cell is ch
                    boolean res = false;
                    if(i == 0 ){
                        if(j == 0){
                            res = helper(ch , matrix[i][j+1]) || helper(ch , matrix[i+1][j]);
                        }else if(j == C-1){
                            res = helper(ch , matrix[i][j-1]) || helper(ch , matrix[i+1][j]);
                        }else{
                            res = helper(ch , matrix[i][j+1]) || helper(ch , matrix[i][j-1]) || helper(ch , matrix[i+1][j]);
                        }
                    }else if(i == R-1){
                        if( j == 0 ){
                            res = helper(ch , matrix[i][j+1]) || helper(ch , matrix[i-1][j]);
                        }else if(j == C-1){
                            res = helper(ch , matrix[i][j-1]) || helper(ch , matrix[i-1][j]);
                        }else{
                            res = helper(ch , matrix[i][j+1]) || helper(ch , matrix[i][j-1]) || helper(ch , matrix[i-1][j]);
                        }
                    }else{
                        if(j == 0){
                            res = helper(ch , matrix[i][j+1]) || helper(ch , matrix[i+1][j]) || helper(ch , matrix[i-1][j]);
                        }else if( j == C-1){
                            res = helper(ch , matrix[i][j-1]) || helper(ch , matrix[i+1][j]) || helper(ch , matrix[i-1][j]);
                        }else{
                            res = helper(ch , matrix[i][j+1])|| helper(ch , matrix[i][j-1]) || helper(ch , matrix[i+1][j]) || helper(ch ,matrix[i-1][j]); 
                        }
                    }
                    if(res){
                        helper2(ch , matrix[i][j]);
                    }
            }
        }
        System.out.println("R "+hash.get('R'));
        System.out.println("G "+hash.get('G'));
        System.out.println("B "+hash.get('B'));
	}
}