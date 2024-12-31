import java.util.*;
public class Hello {
    static int helper(String N){
        int count = 0 ;
        for(int i = 0 ; i < N.length() ; i++){
            if(N.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int targetCount = helper(Integer.toBinaryString(N));
		while(true){
		    N++;
		    if(helper(Integer.toBinaryString(N)) == targetCount){
		        System.out.println(N);
		        return;
		    }
		}
		

	}
}