
/*
The program must accept a string S containing multiple words and an integer K as the input. For each word in
the given string, the program must shift the characters to the right by K positions. The program must print the
number of words that remain the same before and after the shift. Then the program also must print the
revised string as the output.

Input:
tiger Spider
5

Output:
1
tiger piderS

Explanation:
After shifting the characters to the right by 5 positions in each word, the string becomes
tiger piderS

*/

import java.util.*;

public class Hello {
  static void reverse(int st, int end, char[] word) {
    while (st < end) {
      char temp = word[st];
      word[st] = word[end];
      word[end] = temp;
      st++;
      end--;
    }
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    String[] words = sc.nextLine().strip().split(" ");
    int shift = sc.nextInt();
    int N = words.length;
    int count = 0;

    for (int i = 0; i < N; i++) {
      String cpy = words[i];
      char[] string = words[i].toCharArray();
      int len = string.length;
      int M = shift % len;

      reverse(len - M, len - 1, string);
      reverse(0, len - M - 1, string);
      reverse(0, len - 1, string);

      words[i] = new String(string);
      if (words[i].equals(cpy))
        count++;
    }

    System.out.println(count);
    for (String str : words) {
      System.out.print(str + " ");
    }

  }
}