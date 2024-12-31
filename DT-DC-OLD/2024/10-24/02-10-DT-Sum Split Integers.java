/*The program must accept N integers (where each integer contains even number of digits) as
the input. The program must split each integer into two equal halves among the N integers.
Then the program must print the sum of the resulting integers as the output.

Input:
4
45 4578 4005 90

Output:
186

Explanation:
Here N = 4.
After dividing each integer into two equal halves, the integers become 4 5 45 78 40 5 9 0.
The sum of the 8 resulting integers is 186.
So 186 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		long res=0;
		for(int i=0;i<N;i++){
		    String curr_num=Long.toString(sc.nextLong());
		    res=res+Long.parseLong(curr_num.substring(0,curr_num.length()/2))+Long.parseLong(curr_num.substring(curr_num.length()/2,curr_num.length()));
		}
		System.out.print(res);
	}
}