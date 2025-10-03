
/*
 * Mike IS a chef and he has coloured breads and stuffing with which he makes
 * sandwiches. A
 * sandwich can be made by keeping multiple stuffing or no stuffing between two
 * coloured
 * breads. One or more sandwiches can be stacked (placed one over another and
 * can be
 * represented as a string S with each character denoting a coloured bread or a
 * stuffing. The
 * program must print the characters denoting the coloured breads.
 * 
 * Input:
 * mczcmyy
 * 
 * Output:
 * my
 * 
 * Input:
 * aabbcqrqc
 * 
 * ouput:
 * abc
 */
import java.util.*;

public class Hello {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int N = str.length();
    int pointer1 = 0;
    while (pointer1 < N) {
      System.out.print(str.charAt(pointer1));
      int pointer2 = pointer1 + 1;
      while (pointer2 < N && (str.charAt(pointer2) != str.charAt(pointer1) || ((pointer2 - pointer1 + 1) % 2 != 1))) {
        pointer2++;
      }
      pointer1 = pointer2 + 1;
    }

  }
}