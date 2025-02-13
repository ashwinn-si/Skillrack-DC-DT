import java.util.*;
public class Hello {

    static int binarySearch(int nums[], int st , int end , int target){
        if(st > end) return st;
        int mid = (st+end) / 2;
        
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return binarySearch(nums, mid+1, end , target);
        }else{
            return binarySearch(nums,st,mid-1,target);
        }
        
        
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
        System.out.print(binarySearch(nums,0,nums.length - 1 , target));
	}
}