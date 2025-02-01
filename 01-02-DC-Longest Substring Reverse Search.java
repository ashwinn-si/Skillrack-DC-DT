import java.util.*;
public class Hello {
    static boolean isLeapYear(int x){
        return((x % 4 == 0 && x % 100 != 0 ) || x % 400 == 0);
    }
    
    static int leapYearCountHelper(int currYear , int totalYear){
        int count = 0;
        int endYear = currYear + totalYear;
        while(currYear <= endYear){
            if(isLeapYear(currYear)){
                count++;
            }
            currYear++;
        }
        return count;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R  = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		
		int moveStep = sc.nextInt();
		int stYear = sc.nextInt();
		int T = sc.nextInt();
		int noShift = leapYearCountHelper(stYear , T);
		if(isLeapYear(stYear)) noShift--;
		int currI = 0 , currJ = 0, count = 0;
		while(count < noShift){
		    //taking him to the left or right end
		    int noStepsNeededToEnd = (currI % 2 == 0) ? C - currJ -1 : currJ;
		    int remainingSteps = moveStep - noStepsNeededToEnd - 1;
		    if(remainingSteps  < 0){
		        currJ = (currI % 2 == 0) ? currJ + moveStep : currJ - moveStep;
		    }else{
		        //calculating the row in which he will be
		        int rowsToBeMoved = remainingSteps / C;
		        int colToBeMoved = remainingSteps % C;
		        currI = (currI + rowsToBeMoved + 1) % R;
		        currJ = (currI % 2 == 0) ? colToBeMoved  : C - colToBeMoved -1 ;
		    }
		    count++;
		}
		System.out.println(matrix[currI][currJ]);
	}
}