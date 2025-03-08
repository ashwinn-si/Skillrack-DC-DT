
/*
You are given an integer N. You can swap two digits at most once to get the maximum valued number.
The program must print M - the maximum valued number you can get.


Example Input/Output 1:

Input:
2756

Output:
7256

Example Input/Output 2:

Input:
9854

Output:
9854

 */

//boundary testcase 919999 , 8857
import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] digits = N.toCharArray();
        int size = digits.length;
        // finding the max number
        for (int p1 = 0; p1 < size; p1++) {
            char max = digits[p1];
            int swapIndex = -1;
            for (int p2 = p1 + 1; p2 < size; p2++) {
                if (max <= digits[p2]) {
                    max = digits[p2];
                    swapIndex = p2;
                }
            }
            if (swapIndex != -1) {
                char temp = digits[p1];
                digits[p1] = digits[swapIndex];
                digits[swapIndex] = temp;
                if (!(new String(digits)).equals(N)) {
                    break;
                }
            }
        }

        System.out.print(new String(digits));
    }
}