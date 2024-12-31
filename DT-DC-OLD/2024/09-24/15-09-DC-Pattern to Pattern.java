/*The program must accept a list of patterns separated by a colon (:) as the input. Each pattern
contains a list of integers separated by a hyphen (-). The program must print the output based
on the following conditions.
- If a-b is a pattern, then the program must print the integers from a to b in a line.
- If a-b-c is a pattern, then the program must print the integers from a to b in a line and then
the program must print the integers from b to c in the next line. Similarly, the integers are
printed based on the number of integers in the pattern.
Note: The integers in each pattern are always sorted in ascending order.

Input:
2-5-9-11:3-9

Output:
2 3 4 5
5 6 7 8 9
9 10 11
3 4 5 6 7 8 9
*/

import java.util.*;
public class Hello {
    public static void printer(String x,String y){
        for(int i=Integer.parseInt(x);i<=Integer.parseInt(y);i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String input_line[]=sc.nextLine().split(":");
		for(int i=0;i<input_line.length;i++){
		    String curr_line_input[]=input_line[i].split("-");
		    for(int j=0;j<curr_line_input.length-1;j++){
		        printer(curr_line_input[j],curr_line_input[j+1]);   
		    }
		}
	}
} {
    
}
