import java.util.*;
public class Hello {
    static int helper(int N){
        int sum = 0;
        while(N != 0){
            sum += N%10;
            N = (int) (N / 10);
        }
        return sum;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		HashMap<Integer,Integer> digitSum = new HashMap<>();
		for(int i = 0 ; i < N ;i++){
		    arr.add(sc.nextInt());
		    digitSum.put(arr.get(i),helper(arr.get(i)));
		}
	    Collections.sort(arr , Collections.reverseOrder());
		int res = -1;
		for(int i = 0 ;i < N ; i++){
		    for(int j = i+1 ;j < N ;j++){
		        if(digitSum.get(arr.get(i)) == digitSum.get(arr.get(j))){
		            if(arr.get(i)+arr.get(j) > res){
		                res = (arr.get(i) + arr.get(j));
		            }
		        }
		    }
		}
		System.out.println(res);
	}
}