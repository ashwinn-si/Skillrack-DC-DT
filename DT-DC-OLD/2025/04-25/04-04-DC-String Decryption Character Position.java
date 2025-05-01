
/*
The program must accept a string S (encrypted string) as the input. The encryption algorithm used to form
the string S is given below.
- Each character in the original string is combined with its position on the left or right side.
- After combining all the characters with their positions in the original string, they are shuffled and separated
by a hyphen.
The program must find the original string by decrypting the given string S. Then the program must print the
original string as the output.

Input:
41-9k-R6-7a-k2-3i-S1-15-8c

Output:
SkillRack

Explanation:
The encrypted string is 41-9k-R6-7a-k2-3i-S1-15-8c.
The position of I is 4.
The position of k is 9.
The position of R is 6.
The position of a is 7.
The position of k is 2.
The position of i is 3.
The position of S is 1.
The position of I is 5.
The position of c is 8.
After decrypting the given string, the original string is formed as SkillRack.
So SkillRack is printed as the output.
 */

import java.util.*;

public class Hello {
    static int helper(String str) {
        int len = str.length();
        if (Character.isLetter(str.charAt(0))) {
            for (int index = 0; index < len; index++) {
                char ch = str.charAt(index);
                if (!Character.isLetter(ch)) {
                    return index;
                }
            }
        } else {
            for (int index = len - 1; index >= 0; index--) {
                if (!Character.isLetter(str.charAt(index))) {
                    return index;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String givenString[] = sc.nextLine().split("-");
        List<Pair> result = new ArrayList<>();
        for (String str : givenString) {
            int splitIndex = helper(str);
            int len = str.length();
            String integerPart = str.substring(0, splitIndex + 1);
            String alphaPart = str.substring(splitIndex + 1, len);
            try {
                result.add(new Pair(str.substring(splitIndex + 1, len),
                        Integer.parseInt(str.substring(0, splitIndex + 1))));
            } catch (Exception e) {
                result.add(new Pair(str.substring(0, splitIndex), Integer.parseInt(str.substring(splitIndex, len))));
            }
        }

        Collections.sort(result, (a, b) -> a.position - b.position);

        for (Pair currPair : result) {
            System.out.print(currPair.ch);
        }
    }
}

class Pair {
    int position;
    String ch;

    Pair(String ch, int position) {
        this.ch = ch;
        this.position = position;
    }
}