import java.util.*;
public class Hello {
    static boolean checker(int N){
        int unit = N%10;
        int size = (int) (Math.log10(N)+1);
        int firstDigit =(int) (N/Math.pow(10,size-1))%10;
        int d =  firstDigit*10 + unit;
        if(N %  d == 0){
            return true;
        }else{
            return false;
        }
    }
    static int helper(int N , int increment){
        if(checker(N)){
            return N;
        }
        return helper(N + increment , increment);
        
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int left = helper(N , -1);
		int right = helper(N , 1);
		if(Math.abs(N - left) == Math.abs(N - right)){
		    System.out.print(left);
		    return;
		}
		System.out.print(Math.abs(N - left) > Math.abs(N - right) ? right : left);
	}
}