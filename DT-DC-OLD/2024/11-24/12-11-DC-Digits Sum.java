/*The program must accept two lines of N positive integers each as the input. The program must
print the integers from the first line whose sum of digits present in the second line. If there is
no such integer in the first line, then the program must print -I as the output.

Input:
5
53 23 57 123 457
12 16 8 21 17

Output:
53 57 457

Explanation:
The sum of digits in 53, 23, 57, 123 and 457 are 8, 5, 12, 6 and 16 respectively.
The integers 8, 12 and 16 are present in the second line. So their corresponding integer values
53, 57 and 457 are printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String possNums = "";
	    int arr[] = new int[N];
	    boolean flag = false;
        sc.nextLine();
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            String currNum = sc.next();
            possNums+="-".concat(String.valueOf(currNum)).concat("-");
        }
        for(int i = 0 ; i < N ; i++){
            int currSum = 0 ;
            int currNum = arr[i];
            while(currNum > 0){
                currSum += currNum%10;
                currNum /= 10;
            }
            if(possNums.indexOf("-".concat(String.valueOf(currSum)).concat("-")) != -1){
                flag = true;
                System.out.printf("%d ",arr[i]);
            }
        }
        if(!flag){
            System.out.print("-1");
        }
	}
}