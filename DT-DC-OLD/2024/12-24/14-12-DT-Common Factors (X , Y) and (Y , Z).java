import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here   
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->  b - a);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int minVal = Math.min(X,Y);
        for(int i = 1 ; i <= minVal ; i++){
            if(X % i == 0 && Y % i == 0){
                pq.offer(i);
            }
        }
        minVal = Math.min(Y,Z);
        for(int i = 1 ; i <= minVal ; i++){
            if(Y % i == 0 && Z % i == 0){
                pq.offer(i);
            }
        }
        while(!pq.isEmpty()){
            System.out.printf("%d ",pq.poll());
        }
	}
}