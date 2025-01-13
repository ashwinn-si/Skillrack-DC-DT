import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
	    long prev = 1;
		for(int i = 1 ; i < N+1 ; i++){
		    long curr = prev * i* 2;
		    if(curr > X){
		        curr -= X;
		    }
		    prev = curr;
		}
		System.out.print((int)prev);

	}
}