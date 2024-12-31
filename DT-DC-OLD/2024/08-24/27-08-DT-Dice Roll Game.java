/*In a dice roll game, when a player rolls a die and gets 6, he gets another chance to roll the die.
Two players A and B are playing the game and the player A always starts the game. If a player
gets X on the die, then he/she gets X points. The program must accept N integers representing
the results of the dice roll by the two players as the input. The program must print the total
points earned by the players A and B as the output.

Input:
4
6
3
4

Output:
59

Explanation:
The player A rolls the die and gets 1.
The player B rolls the die and gets 6 and gets another chance to roll the die, so the player B
rolls the die and gets 3.
The player A rolls the die and gets 4.
The total points earned by the player A is 5 (1 + 4).
The total points earned by the player B is 9 (6 + 3).
Hence the output is
59
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanenr sc=new Scanner(System.in);
		int N=sc.nextInt();
		int res1=0;
		int res2=0;
		int flag=1;//1 -> player_1 2-> player_2
		for(int i=0;i<N;i++){
		    int curr=sc.nextInt();
		    if(flag==1){
		        res1+=curr;
		    }else{
		        res2+=curr;
		    }
		    if(curr!=6){
            flag=(flag==1)?2:1;
		    }
		}
		System.out.printf("%d %d",res1,res2);

	}
}