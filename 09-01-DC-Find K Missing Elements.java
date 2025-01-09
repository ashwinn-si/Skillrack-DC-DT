import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ;i++){
		    arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		int count = 0 ;
		int res[] = new int[K];
		for(int i = 0 ; i < N-1 ; i++){
		    while(count < K && arr[i]+1 < arr[i+1]){
		        arr[i]++;
		        res[count] = arr[i];
		        count++;
		    }
		}
		if(count < K){
		    System.out.print("-1");
		}else{
		    for(int i : res){
		        System.out.printf("%d ",i);
		    }
		}
	}
}