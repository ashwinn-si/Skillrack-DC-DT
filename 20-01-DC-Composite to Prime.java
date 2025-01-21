import java.util.*;
public class Hello {
    static boolean helper(int N){
        for(int i = 2 ; i <= Math.sqrt(N) ; i++){
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int totalDigits = (int) (Math.log10(N)+1);
		for(int digit = 0 ; digit < totalDigits ; digit++){
		    int multiple =(int) Math.pow(10 ,digit);
		    int currNum = N;
		    int removeDigit = (N / multiple) % 10 ;
		    currNum = currNum - (removeDigit * multiple);
		    for(int i = 0 ; i < 10 ; i++){
		        int n = currNum + (i*multiple);
		        
		        if( n == N || n == 0){
		            continue;
		        }
		        if(helper(n)){
		            System.out.print("NO");
		            return;
		        }
		    }
		}
		System.out.print("YES");

	}
}