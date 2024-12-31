import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int prev = -1;
        int res = -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < N ; i++){
            pq.offer(sc.nextInt());
        }
        for(int i = 0 ; i < N ; i++){
            if(prev == -1){
                prev = pq.poll();
                continue;
            }
            int curr = pq.poll();
            res = Math.max(Math.abs(curr-prev) , res);
            prev = curr;
        }
        System.out.printf("%d",res);
	}
}