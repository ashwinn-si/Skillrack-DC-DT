import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.nextLine();
    int len = N.length();
    int K = sc.nextInt();
    int result = 0;
    for (int i = 0; i <= len - K; i++) {
      result = Math.max(result, Integer.parseInt(N.substring(i, i + K), 2));
    }

    System.out.print(result);
  }
}