/*The program must accept an integer N as the input. The program must find the number of
factors M for the integer N. Then the program form a grid of size MxM and fill the grid based
on the following conditions.
- The cells in the first inverted L-shaped layer are filled with the first factor of N.
- The cells in the second inverted L-shaped layer are filled with the second factor of N.
- Similarly, the remaining inverted L-shaped layers of the grid are filled with the remaining
factors of N.

Input:
6

Output
1 2 2 2
1 2 3 3
1 2 3 6
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Integer> factors=new ArrayList<>();
		int count_factors=1;
		for(int i=1;i<=N/2;i++){
		    if(N%i==0){
		        factors.add(i);
		        count_factors++;
		    }
		}
		int repeating=count_factors;
		factors.add(N);
		for(int r=0;r<count_factors;r++){
		    for(int c=0;c<count_factors-repeating;c++){
		       System.out.printf("%d ",factors.get(c));
		    }
		    for(int c=0;c<repeating;c++){
		        System.out.printf("%d ",factors.get(r));
		    }
		    repeating--;
		    System.out.println();
		}
	}
}