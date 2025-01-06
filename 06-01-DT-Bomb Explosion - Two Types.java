import java.util.*;
public class Hello {
    
    static int starHelper(char matrix[][], int peopleCount , int i , int j, int R , int C){
        //top 
        if(i > 0){
            //top left
            if(j > 0){
                if(matrix[i-1][j-1] == 'P'){
                    peopleCount--;
                    matrix[i-1][j-1] = 'X';
                }
            }
            //top right
            if(0 <= j+1 && C > j+1){
                if(matrix[i-1][j+1] == 'P'){
                    peopleCount--;
                    matrix[i-1][j+1] = 'X';
                }
            }
        }
        //bottom
        if( i < R-1){
            //bottom left
            if(j > 0){
                if(matrix[i+1][j-1] == 'P'){
                    peopleCount--;
                    matrix[i+1][j-1] = 'X';
                }
            }
            //bottom Right
            if(j < C - 1){
                if(matrix[i+1][j+1] == 'P'){
                    peopleCount--;
                    matrix[i+1][j+1] = 'X';
                }
            }
        }
        return peopleCount;
    }
    
    static int plusHelper(char matrix[][] , int peopleCount , int i , int j, int R ,int C){
        //top
        if( i > 0  ){
            if(matrix[i-1][j] == 'P'){
                peopleCount--;
                matrix[i-1][j] = 'X';
            }
        }
        //bottom
        if(i < R-1){
            if(matrix[i+1][j] == 'P'){
                peopleCount--;
                matrix[i+1][j] = 'X';
            }
        }
        //left
        if(j > 0){
            if(matrix[i][j-1] == 'P'){
                peopleCount--;
                matrix[i][j-1] = 'X';
            }
        }
        //right
        if( j < C-1){
            if(matrix[i][j+1] == 'P'){
                peopleCount--;
                matrix[i][j+1] = 'X';
            }
        }
        return peopleCount;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int peopleCount = 0;
		sc.nextLine();
		ArrayList<ArrayList<Integer>> plusBomb = new ArrayList<>();
		ArrayList<ArrayList<Integer>> starBomb = new ArrayList<>();
		char matrix[][] = new char[R][C];
		for(int i = 0 ; i  < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		        if(matrix[i][j] == '+'){
		            ArrayList<Integer> loc = new ArrayList<>();
		            loc.add(i);
		            loc.add(j);
		            plusBomb.add(loc);
		        }
		        else if(matrix[i][j] == 'x'){
		            ArrayList<Integer> loc = new ArrayList<>();
		            loc.add(i);
		            loc.add(j);
		            starBomb.add(loc);
		        }else if(matrix[i][j] == 'P'){
		            peopleCount++;
		        }
		    }
		}
		for(ArrayList<Integer> element : plusBomb){
		    peopleCount = plusHelper(matrix, peopleCount, element.get(0), element.get(1), R, C);
		}
		for(ArrayList<Integer> element : starBomb){
		    peopleCount = starHelper(matrix, peopleCount, element.get(0), element.get(1), R, C);
		}
		System.out.println(peopleCount);
	}
}