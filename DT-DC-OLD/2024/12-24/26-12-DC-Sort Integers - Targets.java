import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < N ; i++){
		    arr.add(sc.nextInt());
		}
		int T = sc.nextInt();
		int firstIndex = (arr.indexOf(T));
        int lastIndex = (arr.lastIndexOf(T));
        if(firstIndex == lastIndex || firstIndex == lastIndex-1){
            System.out.println("-1");
            return;
        }else{
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = firstIndex+1 ; i< lastIndex ; i++){
                pq.offer(arr.get(i));
            }
            while(!pq.isEmpty()){
                System.out.printf("%d ",pq.poll());
            }
        }
	}
}