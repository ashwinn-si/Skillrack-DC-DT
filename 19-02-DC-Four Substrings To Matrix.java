import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String [] strings = new String[N];
        for(int i = 0 ; i < N ; i++){
            strings[i] = sc.nextLine();
        }
        int len = strings[0].length();
        int C = (strings[0].length() / 4) * 3;
        char matrix[][] = new char[N*3][C];
        
        int pointer = 0;
        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j  < C ; j++){
                if(j >= len / 4 && j < (len / 4) * 2){
                    matrix[i][j] = (strings[i].charAt(pointer));
                    pointer++;
                }else{
                    matrix[i][j] = '*';
                }
            }
            pointer = 0;
            // System.out.println();
        }
        
        pointer = len / 4 * 1;
        int pointer2  = len / 4 * 3;
        for(int i =  0 ; i < N  ; i++){
            for(int j = 0 ; j  < C ; j++){
                if( j >= 0 && j < len / 4){
                    matrix[i*2][j] = (strings[i].charAt(pointer2));
                    pointer2++;
                }else if( j >= (len / 4 ) * 2){
                    matrix[i*2][j] = (strings[i].charAt(pointer));
                    pointer++;
                }else{
                    matrix[i*2][j] = '*';
                }
            }
            pointer = len / 4 * 1;
            pointer2 = len /4 * 2;
            // System.out.println();
        }
        
        pointer = len / 4 * 2;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < C  ;j++){
                if( j >= len/4 && j < (len / 4) * 2){
                    matrix[i*3][j] = (strings[i].charAt(pointer));
                    pointer++;
                }else{
                    matrix[i*3][j] = '*';
                }
            }
            pointer = len/4*2;
            // System.out.println();
        }
        
        for(int i = 0 ; i  < N*3 ; i++){
            for(int j = 0 ; j < C ; j++){
                System.out.printf("%c ",matrix[i][j]);
            }
            System.out.println();
        }
    
	}