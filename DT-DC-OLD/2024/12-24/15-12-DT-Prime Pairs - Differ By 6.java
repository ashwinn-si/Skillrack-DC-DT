import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//sieve of eathis
		// creating a array of size N 
		// number | meaning
		// 1 -> prime 
		// 2 -> not prime
		int arr[] = new int[N+1];
		//initializing 0 and 1 as default not prime and starting from two
		arr[0] = 2;
		arr[1] = 2;
		int currNum = 2;
		while(currNum <= N){
		    // initializing as prime acording to the algorithm
		    arr[currNum] = 1;
		    
		    for(int i = currNum+currNum ; i < N+1 ; i+=currNum){
		        //making the number as not prime
		        arr[i] = 2;
		    }
		    
		    //finiding the next num where it is 0
		    boolean breakFlag = false;
		    while(arr[currNum] != 0){
		        if(currNum >= N){
		            breakFlag = true;
		            break;
		        }
		        currNum++;
		    }
		    if(breakFlag){
		        break;
		    }
		    
		}
		
		for(int i = 0 ; i < N+1-6; i++){
		    if(arr[i] == 1 && arr[i+6] == 1){
		        System.out.println(i+" "+(i+6));
		    }
		}

	}
}