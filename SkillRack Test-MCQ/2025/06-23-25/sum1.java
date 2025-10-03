/*
The program must accept a formula involving multiple of two number(both positive and negative less than 10000) and print the value of X
 
Input:
25*X=100

Output:
4
*/

import java.util.*;

public class Hello {

  static int findNumber(String nums[]) {
    if (nums[0].equals("X")) {
      return Integer.parseInt(nums[1]);
    } else {
      return Integer.parseInt(nums[0]);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str[] = sc.nextLine().split("=");
    String nums[] = str[0].split("\\*");
    int num1 = findNumber(nums);
    int result = Integer.parseInt(str[1]);
    int num2 = result / num1;
    if (num1 * num2 != result) {
      System.out.print(num2 * -1);
    } else {
      System.out.print(num2);
    }
  }
}