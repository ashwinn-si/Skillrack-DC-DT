/*The program must accept N integers representing the cost price of N items as the input. The
selling price of each item must be rounded up or down to the nearest multiple of 5. The
program must print the output based on the following conditions.
- If the shopkeeper makes a profit by selling all N items, the program must print the string
value "Profit" followed by the profit amount.
- If the shopkeeper suffers a loss by selling all N items, the program must print the string value
"Loss" followed by the loss amount.
- If there is no profit and no loss by selling all N items, the program must print the string value
"No Profit No Loss".
Note: If the cost price of an item is a multiple of 5, then no need to round up or round down.

Input:
6
84 77 72 58 23 25

Output:
Profit 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int CP = 0;
		int SP = 0;
		for(int i = 0 ; i < N ; i++){
		    int curr = sc.nextInt();
		    CP += curr;
		    if(curr%5==0){
		        SP += curr;
		    }else if( curr % 5 >= 3){
		        SP += (curr + (5-(curr%5)));
		    }else{
		        SP += (curr - (curr%5));
		    }
		}
	    if(SP>CP){
	        System.out.printf("Profit %d",SP-CP);
	    }else if(SP<CP){
	        System.out.printf("Loss %d",CP-SP);
	    }else{
	        System.out.printf("No Profit No Loss");
	    }

	}
}