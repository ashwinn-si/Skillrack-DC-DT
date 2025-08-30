import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char prev = '-';
    boolean flag = true;
    for (char ch : str.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        if (prev != '-') {
          System.out.print(prev);
          flag = false;
        }
      } else {
        System.out.print(ch);
        prev = ch;
      }
    }
    if (flag)
      System.out.print("-1");
  }
}