/*The program must accept N integers and a digit D as the input. The program must print the
largest integer having the unit digit D among the N integers. If there is no such integer, the
program must print -1 as the output.

Input:
6
592 4215 85 702 217 92
2

Output:
702

Explanation:
The integers having the unit digit 2 among the 6 integers are 592, 702 and 92.
The largest integer is 702 which is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		int targetDigit = sc.nextInt();
		int result = -1;
		for(int i = 0 ; i < N ; i++){
		    if(arr[i]%10 == targetDigit && arr[i]>result){
		        result = arr[i];
		    }
		}
		System.out.printf("%d",result);

	}
}