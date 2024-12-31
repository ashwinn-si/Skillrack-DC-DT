/*The program must accept N integers and an integer X as the input The program must remove
X integers among the N integers based on the following conditions.
- The program must remove the integers from left to right.
- After removing each integer K, the program must increment the values of K integers by 1 in
the remaining integers circularly from left to right.
Finally, the program must print the revised values N-X integers as the output.

Input:
5 3
1 2 5 8 1 6

Output:
14 18

Explanation:
The given 5 integers are 12, 5, 8, 1 and 6.
Here X = 3, so we need to remove 3 integers.
After removing the integer 12, the remaining 4 integers become 8 11 4 9.
After removing the integer 8, the remaining 3 integers become 14 7 11.
After removing the integer 14, the remaining 2 integers become 1418.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int num[] = new int[N];
		sc.nextLine();
		for(int i=0 ; i < N ; i++){
		    num[i] = sc.nextInt();
		}
		
		int removeCount=0;
		while(removeCount < X){
		    int currRemoveNumber = num[removeCount];
		    int currIndex=removeCount+1;
		    while(currRemoveNumber != 0){
		        num[currIndex]++;
		        currIndex++;
		        if(currIndex == N){
		            currIndex = removeCount+1;
		        }
		        currRemoveNumber--;
		    }
		    removeCount++;
		}
		
		for(int i=X ; i < N ; i++){
		    System.out.printf("%d ",num[i]);
		}
		

	}
}