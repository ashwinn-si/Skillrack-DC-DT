/*The booking status of N seats in a row in a theatre is passed as the input. 'B' indicates the
seats are booked and 'F' indicates the seats are not booked yet. The N seats are divided into
three blocks. The number of seats in each block (X, Y and Z) are passed as the input. A family
with K members want to book continuous seats in a given block. The program must print Yes
if it is possible to book K seats continuously in a single block. Else the program must print No
as the output.
Note: The sum of X, Y and Z is equal to N.

Input:
20 4 12 4
B B F F F F F F B F B B  B F F F F F F B
4

Output:
Yes

Explanation:
The number of seats in a row is 20.
The first 4 seats B, B, F and F are in the first block.
The next 12 seats F, F, F, F, B, F, B, B, B, F, F and F are in the second block.
The next 4 seats F, F, F and B are in the third block.
The second block has the 4 continuous seats which are not booked yet. So Yes is printed as the
output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int X=sc.nextInt();
		
		int Y=sc.nextInt();
		
		int Z=sc.nextInt();
		
		sc.nextLine();
		
		String seats[]=sc.nextLine().split(" ");
		
		int targetValue=sc.nextInt();
	
		if(helper(0,X,targetValue,seats)||helper(X,Y,targetValue,seats)||helper(X+Y,Z,targetValue,seats)){
		    System.out.print("Yes");
		}else{
		    System.out.print("No");
		}

	}
	
	static boolean helper(int currIndex,int endIndex,int targetValue,String seats[]){
	    int curr_count=0;
	    for(int i=0;i<endIndex;i++){
	        if(seats[currIndex].equals("B")){
	            if(curr_count>=targetValue){
	                return true;
	            }
	            curr_count=0;
	        }else{
	            curr_count++;
	        }
	        currIndex++;
	    }
	    if(curr_count>=targetValue){
	        return true;
	    }
	    return false;
	}
}