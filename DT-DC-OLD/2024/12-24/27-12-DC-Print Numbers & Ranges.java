import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0 ;i < N ; i++){
		    pq.offer(sc.nextInt());
		}
		int prevValue = -1;
		int currValue = pq.poll();
		int stValue = currValue;
		for(int i = 1 ; i < N ;i++){
		    prevValue = currValue;
		    currValue = pq.poll();
		    if(stValue == -1){
		        stValue = prevValue;
		    }
		    if(currValue != prevValue+1 || i == N-1){
		        if(i == N-1){
		            if(currValue != prevValue+1){
		                if(stValue != prevValue){
		                    System.out.printf("%d-%d,%d",stValue,prevValue,currValue);
		                }else{
		                    System.out.printf("%d,%d",prevValue,currValue);
		                }
		            }else{
		                System.out.printf("%d-%d",stValue,currValue);
		            }
		        }else{
		            if(stValue == prevValue){
		                System.out.printf("%d,",prevValue);
		            }else{
		                System.out.printf("%d-%d,",stValue,prevValue);
		            }
		        }
		        stValue = -1;
		    }
		  
		}
	}
}