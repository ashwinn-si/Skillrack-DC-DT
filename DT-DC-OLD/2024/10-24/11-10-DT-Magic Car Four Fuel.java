/*A magic car needs four types of fuel to travel in four directions (N, E, S and W). There are
four fuel tanks for the four types of fuels in the car. Initially, the car has N litres of fuel to travel
in the direction North, E litres of fuel to travel in the direction East, S litres of fuel to travel in
the direction South and W litres of fuel to travel in the direction West. To travel a distance of 1
kilometer in a particular direction, the magical car needs 1 litre of fuel from the respective
type of fuel. A set of instructions is passed as the input to the car. The set of instructions
contain the characters N, E, S and W. For each instruction, the car will move in the specified
direction for 1 kilometer if there is fuel in the car. Otherwise, the car will not move.
The program must accept a string I representing the set of instructions given to the car. The
program must print the instructions for which the car moves as the output.

Input:
3 6 2 4
WWWNNNWWEWNWSNSWWEEN

Output:
WWWNNNWESSEE
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N_FUEL=sc.nextInt();
		int E_FUEL=sc.nextInt();
		int S_FUEL=sc.nextInt();
		int W_FUEL=sc.nextInt();
	    sc.nextLine();
	    String movemenet=sc.nextLine();
	    for(int i=0;i<movemenet.length();i++){
	        char ch=movemenet.charAt(i);
	        if(ch=='N' && N_FUEL !=0){
	            System.out.printf("N");
	            N_FUEL--;
	        }else if(ch=='S' && S_FUEL !=0){
	            System.out.printf("S");
	            S_FUEL--;
	        }else if(ch=='E' && E_FUEL!=0){
	            System.out.printf("E");
	            E_FUEL--;
	        }else if(ch=='W' && W_FUEL !=0){
	            System.out.printf("W");
	            W_FUEL--;
	        }
	    }
	}
}