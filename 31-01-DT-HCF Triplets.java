import java.util.*;
public class Hello {
    static int helper2(int X , int Y){
        return (Y == 0) ? X : helper2(Y , X % Y);
    }
    static boolean helper1(int arr[]){
        Arrays.sort(arr);
        if(helper2(arr[1] , arr[2]) == arr[0]){
            return true;
        }
        return false;
    }
    static void helper(int arr[] , int N , Scanner sc){
        for(int i = 0 ; i  < N ; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        int arr3[] = new int[c];
        int count = 0;
        helper(arr1 , a , sc);
        helper(arr2 , b , sc);
        helper(arr3 , c , sc);
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ;j++){
                for(int k = 0 ; k < c ; k++){
                    if(helper1(new int[]{arr1[i],arr2[j],arr3[k]})){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
	}
}