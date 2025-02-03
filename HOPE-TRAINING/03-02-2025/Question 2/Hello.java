import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		int left = 0 , right = N-1 , maxWater = 0;
		while(left < right){
		    maxWater = Math.max(maxWater , Math.min(arr[left],arr[right]) * (right - left));
		    if(arr[left] < arr[right]) left++;
		    else right--;
		}
		System.out.print(maxWater);
	}
}