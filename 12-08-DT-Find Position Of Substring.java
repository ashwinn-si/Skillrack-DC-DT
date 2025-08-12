
/*
 *The program must accept a string S and its substrings as the input. All the substrings of S have an equal
  length. For each substring, the program must print the substring position in the string S as the output.
  Note: All the substrings of S are always unique.

  Input:
  skillrack
  ack
  ski
  Output:
  3
  1
  2
  Explanation:
  Here S = "skillrack" and its substrings are given below.
  ack -> 3rd substring of S.
  ski -> ISt substring of S.
  llr -> 2nd substring of S.
 */

import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    while (sc.hasNext()) {
      String target = sc.nextLine();
      int len = target.length();
      int index = str.indexOf(target);
      int inc = len == 1 ? 0 : 1;
      System.out.println((index + 1) / len + inc);
    }

  }
}