import java.util.*;
public class Hello {
    static int helper(int N){
        int sum = 0;
        while(N > 0){
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K  = sc.nextInt();
		int count = 0;
		for(int i = 1 ; i <= N ; i++){
		    if(helper(i) % K == 0){
		        count++;
		    }
		}
		System.out.println(count);

	}
}