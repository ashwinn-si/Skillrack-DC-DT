/*The program must accept N integers as the input. For each integer X among the N integers,
the program must shift the smallest digit in X to the right. If the smallest digit occurs more
than once in an integer, the program must shift the last occurring smallest digit to the right.
Then the program must print the sum of the N modified integers as the output.

Input:
4
5729 123 7979 1099

Output:
16010

Explanation:
Here N = 4.
After shifting the smallest digit in each integer to the right, the integers become 5792 231
7997 1990.
The sum of the modified integers is 16010.
So 16010 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int sum = 0 ;
		sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    StringBuffer str = new StringBuffer(sc.next());
		    int smallestIndex = 0;
		    //new logic
		    for(int j = 0; j < 10 ; j++){
		        if(str.lastIndexOf(Integer.toString(j))!=-1){
		            smallestIndex=str.lastIndexOf(Integer.toString(j));
		            break;
		        }
		    }
		    str.append(str.charAt(smallestIndex));
		    str.deleteCharAt(smallestIndex);
		    sum+=Integer.parseInt(str.toString());
		}
		System.out.print(sum);

	}
}