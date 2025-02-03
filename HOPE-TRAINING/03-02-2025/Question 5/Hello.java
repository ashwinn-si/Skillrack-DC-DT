import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		for(int i = 0 ; i < N ; i++){
		    if(arr[i] == 0 && arr[Math.max(i-1,0)] != 1 && arr[Math.min(i+1,N-1)] != 1){
		        target--;
		        arr[i] = 1;
		    }
		}
		if(target <= 0) {
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}

	}
}