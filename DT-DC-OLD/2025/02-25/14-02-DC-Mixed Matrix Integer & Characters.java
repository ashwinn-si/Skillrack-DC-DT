import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int sum = 0;
		String matrix[][] = new String[R][C];
		String str = "";
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0; j < C ; j++){
		        matrix[i][j] = sc.next();
		        if(Character.isDigit(matrix[i][j].charAt(0))){
		            sum += Integer.parseInt(matrix[i][j]);
		        }		    
		        
		    }
		}
		
		for(int j = 0 ; j < C ; j++){
		    for(int i = 0 ; i < R ; i++){
		        if(!Character.isDigit(matrix[i][j].charAt(0))) str += matrix[i][j];
		    }
		}
		System.out.println(sum);
		System.out.println(str);

	}
}