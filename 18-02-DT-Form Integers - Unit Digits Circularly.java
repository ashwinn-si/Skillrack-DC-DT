import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue <Integer> queue = new LinkedList<>();
		for (int i = 0 ; i < N ; i++){
		    queue.offer(sc.nextInt());
		}
		int pointer1 = 0;
		int result = 0;
		while(N >= 3){
		    int currSum = 0;
		    for(int i = 0 ; i < 3 ; i++){
		        int currNum = queue.poll();
		        currSum = (currSum*10) + currNum % 10;
		        currNum /= 10;
		        if(currNum > 0){
		            queue.offer(currNum);
		        }else{
		            N--;
		        }
		    }
		    result += currSum;
		}
		System.out.print(result);

	}
}