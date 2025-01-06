import java.util.*;
public class Hello {
    static int helper(int N){
        int count = 0;
        for(int i = 1 ; i <= Math.pow(N,0.5) ; i++){
            if(N%i == 0){
                count++;
                if(N/i != i && N%(N/i) == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int resCount = -1;
		int resNum = -1;
	    sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    int currNum = sc.nextInt();
		    int count = helper(currNum);
		    if(count > resCount){
		        resCount = count;
		        resNum = currNum;
		    }
		}
		System.out.print(resNum+" "+resCount);
	}
}