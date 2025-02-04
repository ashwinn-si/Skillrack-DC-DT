import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < N ; i++){
		    pq.offer(sc.nextInt());
		}
		for(int i = 0 ; i < K-1 ; i++){
		    pq.poll();
		}
        System.out.print(pq.poll());
	}
}