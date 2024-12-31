/*A person has a cell phone and he travels around connected cities in the form of RxC matrix.
The person always starts from the top-left city. The program must accept a string P
representing the path traveled by the person. There are two types of cell phone towers (Large
and Small).
- A large tower will give the signal to the cities in the two nearest layers around it.
- A small tower will give the signal to the cities around it (only the nearest layer).
There are T towers installed in the cities. A tower does not give its signal to the city where it is
installed, but the city receives the signal from another tower if it is in the valid area of an
another tower. The program must accept the position and the type (L or S) of T towers as the
input. The program must print the number of cities where the person did not receive the signal
as the output.
Note:
The four characters N, E, W and S in the path P indicate the directions North, East, West and
South respectively.

Input:
10 10
SSSEEEEEENNWWSSSSSSS
2
3 3 L
7 5 S

Output:
7
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String movement = sc.nextLine();
		int towerCount=sc.nextInt();
		sc.nextLine();
		int matrix[][]=new int[R][C];
        
        for( int i = 0 ; i < towerCount ; i++ ){
            int towerI = sc.nextInt();
            int towerJ = sc.nextInt();
            boolean towerType=(sc.next().charAt(0)=='L');
            helper(towerI-1 , towerJ-1 , towerType , matrix , R , C);
        }
        
        int currI=0;
        int currJ=0;
        int resultCount=0;
        
        for(int i=0;i<movement.length();i++){
            if(matrix[currI][currJ]==0){
                resultCount++;
            }
            
            switch(movement.charAt(i)){
                case 'N':currI--;break;
                case 'S':currI++;break;
                case 'E':currJ++;break;
                case 'W':currJ--;break;
                default:continue;
            }
        }
        if(matrix[currI][currJ]==0){
            resultCount++;
        }
        System.out.printf("%d",resultCount);
	}
	
	//true -> L | false -> S
	static void helper(int towerR , int towerC , boolean towerType , int matrix[][] , int R , int C){
	    
	    int conditionValue = towerType?2:1;
	    
	    for(int i = conditionValue*-1 ; i <= conditionValue ; i++ ){
	        for(int j = conditionValue*-1 ; j <= conditionValue ; j++){
	            int newI=towerR+i;
	            int newJ=towerC+j;
	            if(newI>=0 && newI<R && newJ>=0 && newJ<C && !(i==0 && j==0)){
	                matrix[newI][newJ]=1;
	            }
	        }
	    }
	}
}