import java.util.*;

public class Main {
  static int getLength(int N){
    if(N == 0) return 1;
    return (int)(Math.log10(N) + 1);
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int res = 0;
      while(X != 0 || Y != 0){
        int sum = (X % 10) + (Y % 10);
        int multi = (int)(Math.pow(10, getLength(res)));
        res = (sum * multi) + res;
        X /= 10;
        Y /= 10;
      }
      System.out.println(res / 10);
  }
}