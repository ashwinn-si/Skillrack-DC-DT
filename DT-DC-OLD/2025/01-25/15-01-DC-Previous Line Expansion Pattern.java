import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String prevLine = "";
		char ch = 'A';
		for(int i = 0 ; i < N ;i++){
		    System.out.println(prevLine+(char)(ch+i)+prevLine);
		    prevLine = prevLine + (char)(ch+i) + prevLine;
		}
	}
}