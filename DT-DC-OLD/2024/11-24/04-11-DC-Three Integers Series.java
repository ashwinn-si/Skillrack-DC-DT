/*
The program must accept four integers N, X, Y and Z as the input. The program must print the
first N terms in the following series as the output.
- The first three terms are X, Y and Z
- The 4th term will be sum of ISt and 2nd terms.
- The 5 term will be sum of 2nd and 3rd terms.
- The 6€1 term will be sum of 3rd and ISt terms.
- The 7th term will be sum of 4th and 5th terms.
- The 8th term will be sum of 5th and 6th terms.
- The 9 term will be sum of 6th and 4 terms and so on.

Input
10 10 40 20

Output:
10 40 20 50 60 30 110 90 80 200
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long X = sc.nextInt();
		long Y = sc.nextInt();
		long Z = sc.nextInt();
		long newX = 0;
		long newY = 0;
		long newZ = 0;
		int totalCount = 3;
		int currCount = 0;
		System.out.printf("%d %d %d ",X,Y,Z);
		while(totalCount < N){
		    if( currCount == 0 ){
		        System.out.printf("%d ",X+Y);
		        newX = X+Y;
		    }else if(currCount == 1 ){
		        System.out.printf("%d ",Y+Z);
		        newY = Y+Z;
		        
		    }else{
		        System.out.printf("%d ",X+Z);
		        newZ = X+Z;
		        X = newX;
		        Y = newY;
		        Z = newZ;
		        currCount=-1;
		    }
		    currCount++;
		    totalCount++;
		}
	}
}