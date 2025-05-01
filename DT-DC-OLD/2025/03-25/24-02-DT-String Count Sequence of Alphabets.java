
/*
The program must accept a string S containing only lower case alphabets as the input. The program must
print the minimum number of string values (of length more than 1) that can be formed using the alphabets
where the alphabets are in sequence. If it is not possible to form such string values, the program must print
-1 as the output.

Input:
yamobxcnpzr

Output:
3

Explanation:
There are three string values that can be formed using the alphabets where the alphabets are in sequence.
abc, mnop and xyz.
So the count 3 is printed as the output.

*/

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        int N = str.length();
        for (int i = 0; i < N; i++) {
            pq.offer(str.charAt(i));
        }
        char pre = pq.poll();
        int resCount = 0;
        int countAlpha = 1;
        while (!pq.isEmpty()) {
            char curr = pq.poll();
            if (pre + 1 == curr || pre == curr) {
                countAlpha++;
                if (pq.isEmpty()) {
                    resCount++;
                }
            } else {
                if (countAlpha > 1) {
                    resCount++;
                }
                countAlpha = 1;
            }
            pre = curr;
        }
        System.out.print(resCount != 0 ? resCount : -1);
    }
}