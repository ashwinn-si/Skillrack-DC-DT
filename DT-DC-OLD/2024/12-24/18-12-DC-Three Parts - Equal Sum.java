import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
	    int sum = 0 ;
		for(int i =0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		    sum += arr[i];
		}
		int targetSum = sum/3;
		int currSum = 0;
		int split = 0;
		for(int i = 0 ; i < N ; i++){
		    currSum += arr[i];
		    if(currSum == targetSum){
		        currSum = 0;
		        split += 1;
		    }
		}
		if(split == 3){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
        
	}
}