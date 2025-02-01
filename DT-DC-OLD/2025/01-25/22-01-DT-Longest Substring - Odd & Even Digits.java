import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int left = 0, right = 1 , resL = 0, resR = 0, N = str.length();
		while(right < N){
		    int curr = str.charAt(right) - '0';
		    int prev = str.charAt(right - 1) - '0';
		    if(curr % 2 == prev % 2){
		        if(right - left > resR - resL){
		            resR = right;
		            resL = left;
		        }
		        left = right;
		    }
		    right++;
		}
		if(right - left > resR - resL){
		    resR = right;
		    resL = left;
		}
        System.out.println(str.substring(resL,resR));
	}
}