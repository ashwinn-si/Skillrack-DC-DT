import java.util.*;

public class Main{
    public static boolean helper(int currR, int currC, char matrix[][], int index, String str){
        while(true){
            if(index == str.length()){
                return true;
            }
            if(matrix[currR][currC] == str.charAt(index)){
                index++;
                continue;
            }else{
                if(matr)
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char matrix[][] = new char[R][C];
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String target = sc.nextLine();

        for(int i = 0 ; i < R; i++){
            for(int j = 0 ; j < C ; j++){
                if(target.charAt(0) == matrix[i][j]){

                }
            }
        }
    }
}