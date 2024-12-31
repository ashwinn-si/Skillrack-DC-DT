/*There are N boxes need to be stored in a warehouse. The distance between each box and the
warehouse is passed as the input to the program. A boy can collect a maximum of two boxes
at a time. The program must print the minimum distance the boy travel to store all N boxes in
the warehouse as the output.
Note: The boy always starts from the warehouse to store the boxes.

Input:
5
7 3 8 5 11

Output:
42
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Integer arr[]=new Integer[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int result=0;
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<N;i+=2){
		    result+=(arr[i]*2);
		}
		
		System.out.printf("%d",result);

	}
}