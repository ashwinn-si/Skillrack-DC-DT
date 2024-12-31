/*The program must accept an integer N as the input. The program must print N triangles
numbered from I to N based on the following conditions.
- The triangle contains (290-1 lines.
- The ISt line contains the integer l.
- The 2nd line contains the integers from 2 to 1.
- The 3rd line contains the integers from 3 to 1. Similarly, the first X lines of the triangle are
printed.
- The (X+l)th line contains the integers from X-I to 1.
- The (X+2)th line contains the integers from X-2 to 1.
- The (X+3)th line contains the integers from X-3 to 1. Similarly, the remaining lines of the
triangle are printed.

Input:
3

Output:
1
1
2 1
1
1
2 1
3 2 1
2 1
1
1
2 1
3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int no_triangle=1;no_triangle<=N;no_triangle++){
		    int col_count=1;
		    for(int row=1;row<=(2*no_triangle)-1;row++){
		        int start=col_count;
		        for(int col=1;col<=col_count;col++){
		            System.out.printf("%d ",start);
		            start--;
		        }
		        if(row<=(int)(((2*no_triangle)-1)/2)){
		            col_count++;
		            start--;
		        }else{
		            col_count--;
		            start++;
		        }System.out.println();
		    }
		}
	}
}