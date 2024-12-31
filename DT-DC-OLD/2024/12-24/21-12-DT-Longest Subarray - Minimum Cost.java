import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		sc.nextLine();
		int arr1[] = new int[N];
		int arr2[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr1[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++){
		    arr2[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		int currSum = 0;
		int arrSize = 0;
		int pointer2 = 0;
		int pointer1 = 0;
		int resSize = 0;
		while(pointer1 < N){
		    currSum += Math.abs(arr1[pointer1]-arr2[pointer1]);
		    if(currSum > K){
		        while(currSum > K && pointer1 >= pointer2){
		            currSum -= Math.abs(arr1[pointer2]-arr2[pointer2]);
		            pointer2++;
		        }
		    }else{
		        if(resSize < pointer1-pointer2){
		            resSize = pointer1-pointer2;
		        }
		    }
		    pointer1++;
		}
		System.out.printf("%d",resSize+1);

	}
}