import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = str.length();
// 		Stack<Character> stack = new Stack<>();
		char[] stack = new char[N];
		int top = -1;
		for(int i  = 0 ; i < N ; i++){
		    if(str.charAt(i) == '*'){
		        if(top != -1){
		            top--;
		        }
		    }else{
		        stack[++top] = (str.charAt(i));
		    }
		}
		
		for(int i = 0 ; i <= top ;i++){
		    System.out.print(stack[i]);
		}
	}
}