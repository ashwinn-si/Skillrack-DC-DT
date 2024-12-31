import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		char ch = (char)('A' + sc.nextInt() - 1);
		int R = sc.nextInt();
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j <= i ; j++){
		        if(ch+j > 'Z'){
		            System.out.printf("%c ",ch+j-'Z'+'A'-1);
		        }else{
		            System.out.printf("%c ",ch+j);
		        }
		    }
		    System.out.println();
		}

	}
}