
/*
The excel cols are named as A, B, C, ... ,Z, AA, AB, ...... and so on
The corresponding numeric representation are:
A - 1, B-2, ..., Z - 26,
AA - 27, .... and so on

given a col return the corresponding numeric

boundaryCondition:
1 <= length of s <= 4

Input1
AC

Ouput1
29

Input2
Y

Output2
25
 */
import java.util.Scanner;

public class sum3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    long result = 0;
    int N = str.length();
    for (int i = 0; i < N; i++) {
      result += ((str.charAt(i) - 'A' + 1) * (long) (Math.pow(26, N - i - 1)));
    }
    System.out.println(result);
  }
}
