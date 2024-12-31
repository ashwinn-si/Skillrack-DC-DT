/*The program must accept N integers as the input. The program must modify the given
integers based on the following conditions.
- If the unit digit of an integer is O, the program must borrow I from its tenth digit and add it
to the unit digit. If it is not possible to borrow 1 from its tenth digit, the program must replace
the integer with O.
Finally, the program must print the sum S of the revised values of the N integers as the output.

Input:
4
158 270 100 310

Output:
720
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	    sc.nextLine();
		int sum = 0;
		for(int i=0 ; i < N ; i++){
		    int currN = sc.nextInt();
		    if(currN % 10 != 0){
		        sum+=currN;
		        continue;
		    }
		    if(currN%100<10){
		        sum+=0;
		        continue;
		    }
		    currN = currN-10;
		    currN+=1;
		    sum+=currN;
		}
		System.out.printf("%d",sum);

	}
}