/*
 * Input:
 * Automated teller machine
 * 
 * Output:
 * ATM
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str[] = sc.nextLine().split(" ");
    for (String string : str) {
      System.out.print(Character.toUpperCase(string.charAt(0)));
    }
  }
}