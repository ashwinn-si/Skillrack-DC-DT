import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		for(int i = 0 ; i < N ; i++){
		    if(i % 2 == 0){
		        for(int j = count ; j < count+N ; j++){
		            System.out.printf("%d ",N*j);
		        }
		    }else{
		        for(int j = count+N-1 ; j >= count ; j--){
		            System.out.printf("%d ",N*j);
		        }
		    }
		    count += N;
		    System.out.println();
		}
	}
}