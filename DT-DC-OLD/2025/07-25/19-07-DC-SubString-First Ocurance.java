/*
The program must accept two string values Sl and S2 as the input. The program must find the positions of
the first occurrence of all characters of S2 in Sl. Then the program must print the characters in Sl from the
minimum position to the maximum position among the positions obtained.
Note: All characters of S2 always occur at least once in Sl.
Input:
corporate
oar
Output:
orpora
Explanation:
Here Sl = corporate, S2 = oar.
The position of the first occurrence of o in the string Sl is 2.
The position of the first occurrence of a in the string Sl is 7.
The position of the first occurrence of r in the string Sl is 3.
The characters from the 2nd position (minimum position) to the 7th position (maximum position) in Sl are o
rpora.
 */

import java.util.*;

public class Hello {

  static int getAlphaDigit(char ch) {
    if (ch >= 'a' && ch <= 'z') {
      return ch - 'a';
    } else {
      return ch - 'A' + 26;
    }
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int alpha[] = new int[52];
    for (char ch : s2.toCharArray()) {
      alpha[getAlphaDigit(ch)]++;
    }
    int minPointer = 1000;
    int maxPointer = -1;
    int N = s1.length();
    for (int index = 0; index < N; index++) {
      char ch = s1.charAt(index);
      if (alpha[getAlphaDigit(ch)] != 0) {
        alpha[getAlphaDigit(ch)] = 0;
        minPointer = Math.min(index, minPointer);
        maxPointer = Math.max(index, maxPointer);
      }
    }
    System.out.println(s1.substring(minPointer, maxPointer + 1));

  }
}