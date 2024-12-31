/*The program must accept two integers N and K as the input. The program must print the
number of times K occurs in the multiplication chart of NXN as the output.

Input:
6 12

Output:
4

Explanation:
Here N = 6 and K = 12.
The multiplication chart of 6x6 is given below.
1 2 3 4 5 6
2 4 6 8 10 12
3 6 9 12 15 18
4 8 12 16 20 24
5 10 15 20 25 30
6 12 18 24 30 36
Here 12 occurs 4 times. So 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
        for(int i = 1 ; i <= N ; i++){
            if(i*N >= K && K%i == 0){
                count++;
            }
        }
        System.out.print(count);
	}
}