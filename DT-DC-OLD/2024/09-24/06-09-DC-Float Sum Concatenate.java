/*The program must accept N integers (where N is always even) as the input. The program must
form N/2 float values by concatenating every two integers with a . (Dot) between them. Then
the program must print the sum of those N/2 float values with the precision up to 3 decimal
places as the output.

Input:
4
31 481 686 83

Output:
718.311

Explanation:
Here N = 4 and the 4 integers are 31, 481, 686 and 83.
The float values 31.481 and 686.83 are formed by concatenating every two integers with a .
(Dot) between them.
The sum of the two float values with the precision up to 3 decimal places is 718.311 (31.481 +
686.83).
So 718.311 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	    double result=0.0;
		sc.nextLine();
		String input_line[]=sc.nextLine().split(" ");
		for(int i=0;i<N;i+=2){
		    input_line[i]=input_line[i].concat(".");
		    input_line[i]=input_line[i].concat(input_line[i+1]);
		    result+=Float.parseFloat(input_line[i]);
		}
		System.out.printf("%.3f",result);

	}
}
