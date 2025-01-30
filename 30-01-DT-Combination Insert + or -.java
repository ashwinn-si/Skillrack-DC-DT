import java.util.*;
public class Hello {
    
    static boolean helper2(int operator[], int numbers[], int N, int target){
        int currSum = numbers[0];
        for(int i = 1; i  < N ; i++){
            if(operator[i-1] == 1){
                currSum += numbers[i];
            }else{
                currSum -= numbers[i];
            }
        }
        if(target == currSum) return true;
        return false;
    }
    
    static void helper(int operator[] , int insertPostion, int N , int target , int numbers[], int operation ,int resultCount[]){
        operator[insertPostion] = operation;
        if(insertPostion == N-2){
            if(helper2(operator, numbers, N, target)){
                resultCount[0]+=1;
            }
            return;
        }
        helper(operator, insertPostion+1 , N , target, numbers,1,resultCount);
        helper(operator, insertPostion+1, N , target, numbers,2,resultCount);
        return;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
        for(int i = 0 ; i < N ; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res[] = new int[]{0};
        int operator[] = new int[N-1]; // 1 -> add | 2 -> sub
        helper(operator, 0 , N , target, nums, 1, res);
        helper(operator,0,N,target,nums,2,res);
        System.out.println(res[0]);
	}
}