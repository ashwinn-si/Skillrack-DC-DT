
/*
given a hexa string convert to integer
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strings = sc.nextLine().split(" ");
    for (String str : strings) {
      System.out.print((char) Integer.parseInt(str, 16));
    }

  }
}