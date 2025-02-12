//1 tc fail
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prevNum = -1;
		boolean flag = true;
		for(int i = 0 ; i < N ; i++){
		    if(i == 0){
		        prevNum = sc.nextInt();
		        if(prevNum != 1){
		            System.out.printf("%d-%d ",1,prevNum-1);
		        }
		    }
		    else if(i >= 1){
		        int currNum = sc.nextInt();
		        if(currNum - prevNum != 1){
		            flag = false;
		            System.out.printf("%d-%d ",prevNum+1, currNum-1);
		        }
		        prevNum = currNum;
		    }
		}
        if(flag){
            System.out.printf("-1");
        }
	}
}