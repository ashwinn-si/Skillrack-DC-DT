import java.util.*;
public class Hello {
    static void helper(int nums[] , int N){
        for(int i = 2 ; i < N+2 ; i++){
            if(nums[i] == 0){
                nums[i] = i % 2 == 0 ? 1 : 0;
                for(int j = i+i ; j < N+2 ; j+=i){
                    nums[j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		
		int nums[] = new int[N+2];
        //initilizing 0 and 1 as not prime
        // 0 -> prime | 1 -> not prime
        nums[0] = 1;
        nums[1] = 1;
        helper(nums , N);
        for(int i = 1 ; i < N+1 ; i++){
            if(nums[i-1] == 0 && nums[i+1] == 0){
                System.out.printf("%d ",i);
            }
        }
	}
}