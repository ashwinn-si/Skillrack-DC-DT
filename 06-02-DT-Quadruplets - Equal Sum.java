import java.util.*;
public class Hello {
    static boolean helper(int a, int b, int c, int d){
        return(a + b == c + d || a + c == b + d || a + d == c + b);
    }
    
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int lens[] = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            lens[i] = sc.nextInt();
        }
        int nums1[] = new int[lens[0]];
        int nums2[] = new int[lens[1]];
        int nums3[] = new int[lens[2]];
        int nums4[] = new int[lens[3]];
        for(int i = 0 ; i < 4 ; i++){
            for(int index = 0 ; index < lens[i] ; index++){
                if(i == 0 ) nums1[index] = sc.nextInt();
                else if(i == 1) nums2[index] = sc.nextInt();
                else if(i == 2) nums3[index] = sc.nextInt();
                else nums4[index] = sc.nextInt();
            }
        }
        int count = 0;
        for(int index1 = 0 ; index1 < lens[0] ; index1++){
            for(int index2 = 0 ; index2 < lens[1] ; index2++){
                for(int index3 = 0 ; index3 < lens[2] ; index3++){
                    for(int index4 = 0 ; index4 < lens[3] ; index4++){
                        if(helper(nums1[index1], nums2[index2], nums3[index3], nums4[index4])){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
	}
}