import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char matrix[][] = new char[26][26];
		
		for(int i = 0 ; i < 26 ; i++){
		    for(int j = 0 ; j < 26 ; j++){
		        matrix[i][j] = (char)((i + j) % 26 + 'a');
		    }
		}
		
		int n = s1.length();
		for(int i = 0 ; i < n ; i++){
		    int rowIndex = s1.charAt(i)-'a';
		    int colIndex = s2.charAt(i)-'a';
		    System.out.printf("%c",matrix[rowIndex][colIndex]);
		}
	}
}