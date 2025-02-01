import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
	    boolean flag = false;
	    for(int i = 0 ; i < R ; i++){
	        for(int j = 0 ; j  < C ; j++){
	            char ch = sc.next().charAt(0);
	            if(ch == 'V'){
	                flag = true;
	            }
	            if(ch == '.'){
	                if(flag){
	                    count++;
	                }
	                flag = false;
	            }
	        }
	        if(flag){
	            count++;
	        }
	        flag = false;
	    }
	    System.out.print(count);
	}
}