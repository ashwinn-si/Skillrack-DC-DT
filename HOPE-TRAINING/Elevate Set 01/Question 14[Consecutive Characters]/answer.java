import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = 0, N = str.length(),count = 1;
		for(int i = 1; i < N ; i++){
		    if(str.charAt(i) != str.charAt(i-1)){
		        result = Math.max(result, count);
		        count = 1;
		    }else{
		        count++;
		    }
		}
		result = Math.max(result, count);
		System.out.print(result);

	}
}