import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int stringFlag = 1, index = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (stringFlag == 1) {
          System.out.print(s1.charAt(index) + " ");
          stringFlag = 2;
        } else {
          System.out.print(s2.charAt(index) + " ");
          index++;
          stringFlag = 1;
        }
      }
      System.out.println();
    }
  }
}