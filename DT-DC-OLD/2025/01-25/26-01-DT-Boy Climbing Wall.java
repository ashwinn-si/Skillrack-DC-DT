import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int wallSize[] = new int[C];
		for(int i = 0 ; i< R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        int x = sc.nextInt();
		        if(x == 1){
		            wallSize[j]++;
		        }
		        if(i == 0 && x == 1){
		            System.out.print("NO");
		            return;
		        }
		    }
		}
		
		for(int i = 1 ; i < C ; i++){
		    if(Math.abs(wallSize[i-1] - wallSize[i]) > 1){
		        System.out.print("NO");
		        return;
		    }
		}
		System.out.print("YES");
	}
}