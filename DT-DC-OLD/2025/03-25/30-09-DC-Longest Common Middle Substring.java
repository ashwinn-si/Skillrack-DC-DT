
/*
The program must accept two string values SI and S2 as the input. The program must print the longest
common middle substring in the given two string values as the output. If there is no such substring, then the
program must print -1 as the output.
Note: The lengths of SI and S2 are always odd.

Input:
doglionlizard
absolutionlizagging

Output:
ionli

Explanation:
The longest common middle substring is highlighted below
SI = doglionlizard
S2 = absolutionlizagging
So ionli is printed as the output.
*/

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int midIndex1 = s1.length() / 2;
        int midIndex2 = s2.length() / 2;
        int incIndex = 0;
        int len1 = s1.length(), len2 = s2.length();
        String res = "";
        while (true) {
            if (midIndex1 - incIndex >= 0 && midIndex1 + incIndex <= Math.min(len1, len2)
                    && s1.substring(midIndex1 - incIndex, midIndex1 + incIndex + 1)
                            .equals(s2.substring(midIndex2 - incIndex, midIndex2 + incIndex + 1))) {
                res = s1.substring(midIndex1 - incIndex, midIndex1 + incIndex + 1);
            } else {
                break;
            }
            incIndex++;
        }
        if (res.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(res);
        }
    }
}