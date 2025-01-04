import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < N ;i++){
		    arr.add(sc.nextInt());
		}
		int res = 0;
		for(int i = 0 ; i < N ;i++){
		    for(int j = i+1 ; j < N ; j++){
		        for(int k = j+1 ; k < N ; k++){
		            if(arr.get(i) > arr.get(j) && arr.get(j) > arr.get(k)){
		                res++;
		            }
		        }
		    }
		}
		System.out.print(res);
	}
}