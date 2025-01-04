import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int end  = 1;
		while(N >= end){
		    for(int i = N ; i >= end ; i--){
		        System.out.printf("%d ",i);
		    }
		    N--;
		    end++;
		}
	}
}