
/*
The program must accept a string S representing a polynomial expression. The program must simplify the
given polynomial expression by combining the like terms (i.e., combining the terms having the same exponent
values). Then the program must print the simplified polynomial expression. The terms in the simplified
polynomial must be sorted by their exponent values in descending order. If there are no terms in the simplified
polynomial expression, then the program must print O as the output.

Input:
-4x^1+3x^2-7x^0+9x^1-12x^2-5x^4

Output:
-5x^4-9x^2+5x^1-7x^0
 */

import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, Integer> hash = new TreeMap<>(Collections.reverseOrder());
    String str = sc.nextLine();
    int N = str.length();
    int index = 0;
    Integer num = null;
    boolean negativeFlag = false;
    Integer exponent = null;
    while (index < N) {
      char ch = str.charAt(index);

      if (ch == '+' || ch == '-') {
        // means a new number is starting
        if (num != null && exponent != null) {
          if (negativeFlag)
            num *= -1;
          hash.put(exponent, hash.getOrDefault(exponent, 0) + num);
          negativeFlag = false;
        }
        if (ch == '-')
          negativeFlag = true;
        num = 0;
        exponent = 0;

      }

      index++;
      while (index < N && str.charAt(index) != 'x') {
        num = (num * 10) + (str.charAt(index) - '0');
        index++;
      }
      index += 2;
      while (index < N && str.charAt(index) != '+' && str.charAt(index) != '-') {
        exponent = (exponent * 10) + (str.charAt(index) - '0');
        index++;
      }
    }

    if (negativeFlag)
      num *= -1;

    hash.put(exponent, hash.getOrDefault(exponent, 0) + num);

    boolean flag = true;
    for (int expo : hash.keySet()) {
      num = hash.get(expo);
      if (num == 0)
        continue;
      flag = false;
      char sign = num > 0 ? '+' : '-';
      num = Math.abs(num);
      System.out.print(sign + "" + num + "x^" + expo);
    }
    if (flag)
      System.out.print(0);
  }
}