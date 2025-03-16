import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = str.length(), i = 0;
		
		while( i < N){
		    if((str.charAt(i) == '1' || str.charAt(i) == '2') && i + 2 < N && str.charAt(i + 2) == '#'){
		        System.out.print((char)('a' + Integer.parseInt(str.substring(i,i+2)) - 1));
		        i+=3;
		    }else{
		        int val = str.charAt(i) - '0';
		        System.out.print((char)('a'+ val - 1));
		       i++;
		    }
		}

	}
}