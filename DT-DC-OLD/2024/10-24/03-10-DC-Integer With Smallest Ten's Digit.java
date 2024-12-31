/*The program must accept N integers as the input The program must print the integers having
the smallest tenth digit among the given N integers as the output The integers must be
printed in the order of their occurrence.

Input:
5
89 12 63 52 14

Output:
12 14

Explanation:
Here N = 5, the given 5 integers are 89, 12, 63, 52 and 14.
The smallest tenth digit among the tenth digits of the given 5 integers is 1.
The integers having the tenth digit as 1 are 12 and 14. So they are printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[N];
		int low_ten=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		    if((arr[i]/10)%10<low_ten){
		        low_ten=(arr[i]/10)%10;
		    }
		}
		for(int i=0;i<N;i++){
		    if((arr[i]/10)%10==low_ten){
		        System.out.printf("%d ",arr[i]);
		    }
		}

	}
}