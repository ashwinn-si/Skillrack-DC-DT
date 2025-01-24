import java.util.*;
public class Hello {
    static void helper(int st , int end , int arr[]){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
		//Your Code Here'
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
		sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    nums[i] = sc.nextInt();
		}
		int L = sc.nextInt();
		String Q = sc.next();
		int spin = sc.nextInt();
        spin %= N;
        
        //spining the matrix
        helper(0, N-spin-1, nums);
        helper(N-spin, N-1, nums);
        helper(0 , N-1, nums);
        
        int index = 0;
        for(int i = 0 ; i < N ; i++){
            if(nums[i] == L){
                index = i;
                break;
            }
        }
        int size = N / 4;
        String RQ = "";
        if(index >=0 && index < size){
            RQ = "I";
        }else if(index >= size && index < size*2){
            RQ = "IV";
        }else if(index >= size*2 && index < size*3){
            RQ = "III";
        }else{
            RQ = "II";
        }
        if(RQ.equals(Q)){
            System.out.println(L*3);
        }else{
            if(RQ.equals("I") && Q.equals("III") || Q.equals("I") && RQ.equals("III")){
                System.out.println(L*2);
            }else if(RQ.equals("II") && Q.equals("IV") || Q.equals("II") && RQ.equals("IV")){
                System.out.println(L*2);
            }else{
                System.out.println("0");
            }
        }
	}
}