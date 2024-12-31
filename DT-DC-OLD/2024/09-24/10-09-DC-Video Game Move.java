/*In a video game, a boy has four options to move in the four directions U, D, L and R
representing Up, Down, Left and Right directions. The initial position of the boy is always (O,
O). The program must accept a string S containing only U, D, L and R (both upper case and
lower case) as the input. The program must print YES if the boy returns to the starting position
after finishing all the moves. Else the program must print NO as the output.

Input:
URdL

Output:
YES

Explanation:
The initial position of the boy is (O, O).
In the first move U, the boy moves up. So the current position of the boy becomes (O, 1).
In the second move R, the boy moves right. So the current position of the boy becomes (1, 1).
In the third move d, the boy moves down. So the current position of the boy becomes (1, O).
In the fourth move L, the boy moves left. So the current position of the boy becomes (O, O).
After finishing all the moves, the final position of the boy is (0, O) which is the starting position.
So YES is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char str[]=sc.nextLine().toCharArray();
		int x=0;
		int y=0;
		for(char ch : str){
		    if(Character.toLowerCase(ch)=='u'){
		        y+=1;
		    }else if(Character.toLowerCase(ch)=='d'){
		        y-=1;
		    }else if(Character.toLowerCase(ch)=='l'){
		        x-=1;
		    }else{
		        x+=1;
		    }
		}
		System.out.print((x==0 && y==0)?"YES":"NO");

	}
}