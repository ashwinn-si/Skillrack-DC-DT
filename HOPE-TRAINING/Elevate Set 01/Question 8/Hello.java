import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N == 2) {
		    System.out.print("1");
		    return;
		}
		
		if(N == 3){
		    System.out.print("2");
		    return;
		}
		
	    int res = 1;
	    while(N > 4){
	        res *= 3;
	        N -= 3;
	        
	    }
	    res *= N;
        System.out.print(res);
	}
}