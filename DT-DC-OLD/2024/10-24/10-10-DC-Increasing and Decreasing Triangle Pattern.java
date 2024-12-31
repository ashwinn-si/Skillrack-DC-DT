/*The program must accept an integer N as the input. The program must print hyphens and integers In
lines based on the following conditions.
In the ISt line, the program must print N hyphens and an integer (0).
In the 2nd line, the program must print N-1 hyphens and three integers (N, 0, N).
In the 3rd line, the program must print N-2 hyphens and five integers (N-I, N, O, N, N-I).
In the 4th line, the program must print N-3 hyphens and seven integers (N-2, N-1, N, 0, N, N-1, N-2).
Similarly, the program must print the remaining lines as the output.

Input:
5

Output:
----505
--45054
--3450543
-234505432
12345054321

Explanation:
Here N = 5. So the pattern contains 6 (5+1) lines.
The ISt line contains 5 hyphens followed by the integer O.
The 2 nd line contains 4 hyphens followed by the three integers 5, O and 5.
The 3rd line contains 3 hyphens followed by the five integers 4, 5, 0, 5 and 4.
The 4th line contains 2 hyphens followed by the seven integers 3, 4, 5, 0, 5, 4 and 3.
The 5th line contains a hyphen followed by the 9 integers 2, 3, 4, 5, 0, 5, 4, 3 and 2.
The 6th line contains 11 integers 1, 2, 3, 4, 5, O, 5, 4, 3, 2 and 1.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int R=0;R<=N;R++){
		    //printint the hypens
		    for(int i=0;i<N-R;i++){
		        System.out.printf("-");
		    }
		    
		    //printing the first set of numbers till 0
		    int count=N-R+1;
		    for(int i=0;i<R;i++){
		        System.out.printf("%d",count);
		        count++;
		    }
		    //printing the zero
		    System.out.printf("0");
		    
		    //printing the second set of numbers
		    count=N;
		    for(int i=0;i<R;i++){
		        System.out.printf("%d",count);
		        count--;
		    }
		    System.out.println();
		}
	}
}