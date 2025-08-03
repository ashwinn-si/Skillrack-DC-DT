
/*
The program must accept a string S as the input. The string S contains parentheses and integers, where each
open parenthesis '(' has a matching close parenthesis 'Y. For each integer, the program must find the product
of the integer and its nesting level (i.e., the depth of the parentheses surrounding the integer). Finally, the
program print the sum of those products as the output.

Input:
((((10)20)30)40)

Output:
200

Explanation:
Here the given string is ((((10)20)30)40).
10*4 + 20*3 + 30*2 + 40*1 = 200
So 200 is printed as the output.
 */

import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    String str = sc.nextLine();
    int count = 0;
    int result = 0;
    int pointer = 0;
    int len = str.length();
    while (pointer < len) {
      char ch = str.charAt(pointer);
      if (ch == '(') {
        count++;
      } else if (ch == ')') {
        count--;
      } else {
        int num = 0;
        while (pointer < len) {
          num = (num * 10) + (str.charAt(pointer) - '0');
          if (pointer + 1 < len && (str.charAt(pointer + 1) == ')' || str.charAt(pointer + 1) == '(')) {
            break;
          }
          pointer++;
        }
        result += num * (count);
      }
      pointer++;
    }
    System.out.println(result);

  }
}