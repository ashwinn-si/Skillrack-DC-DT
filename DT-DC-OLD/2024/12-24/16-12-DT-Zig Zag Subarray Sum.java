import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		int currStart = 0;
		for(int i = 0 ; i < R ;i++){
		    for(int j =0 ;j < C ;j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int K = sc.nextInt();
		boolean helperFlag = true; // true -> forward | false -> backward
		for(int i = 0 ; i < R ;i++){
		    if(helperFlag && currStart + K > C){
		        helperFlag = false;
		        currStart-=2;
		    }else{
		        if(currStart < 0){
		            helperFlag = true;
		            currStart+=2;
		        }
		    }
		    int sum = 0 ;
		    for(int j = currStart ; j < currStart+K ; j++){
		        sum += matrix[i][j];
		    }
		    System.out.printf("%d ",sum);
		    currStart += (helperFlag) ? 1 : -1;
		}

	}
}
