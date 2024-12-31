/*The program must accept an integer N as the input. The program must form a string S based
on the following conditions.
- Initially, the string S will be empty.
- The program find the remainder R when N is divided by 26 and then the program must
append the l)th upper case alphabet in the English alphabet set to the string S. Then the
program mUSt replace the value Of N with the quotient when N is divided by 26.
- The program must repeat the above above process untill N becomes O.
Finally. the program must print the reverse of S as the output.

Input
58

Output:
CG

Explanation:
Here N = 58.
Iteration 1: R 58 % 26 6. so the upper Case alphabet is G.
Now N becomes 2 (58 / 26).
Iteration 2: R = 2 % 26 = 2. So the 3rd upper case alphabet is C
Now N becomes O (2 / 26).
GC is the output
Now reverse GC it becomes CG
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		StringBuilder res=new StringBuilder();
		int N=sc.nextInt();
		while(true){
		    if(N==0){
		        break;
		    }
		    res.append((char)((N%26)+'A'));
		    N/=26;
		}
		System.out.print(res.reverse());
	}
}