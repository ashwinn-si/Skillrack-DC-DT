
/*
Strings - Print Vertically
The program must accept three string values Sl , S2
and S3. Sl will be printed as the first row of a matrix.
S2 and S3 will be printed vertically in the column
where their first alphabets match with that of the
alphabet in Sl . If both S2 and S3 have same first
alphabet then, S2 will be considered over S3. The
output pattern must be as shown in the Example
Input/Output section. Assume always Sl will have the
starting alphabets of S2 and S3.

Input:
butter
toy
task

Output:
butter
**oa**
**ys**
***k**
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str3 = sc.nextLine();

    int l1 = str1.length();
    int l2 = str2.length();
    int l3 = str3.length();

    int R = Math.max(l2, l3);
    int C = l1;

    int colIndex2 = -1;
    int colIndex3 = -1;

    for (int i = 0; i < l1; i++) {
      if (str1.charAt(i) == str2.charAt(0) && colIndex2 == -1) {
        colIndex2 = i;
      } else if (str1.charAt(i) == str3.charAt(0) && colIndex3 == -1) {
        colIndex3 = i;
      }
    }

    int pointer1 = 0;
    int pointer2 = 1;
    int pointer3 = 1;

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (i == 0) {
          System.out.print(str1.charAt(pointer1++));
        } else if (j == colIndex2 && pointer2 < l2) {
          System.out.print(str2.charAt(pointer2++));
        } else if (j == colIndex3 && pointer3 < l3) {
          System.out.print(str3.charAt(pointer3++));
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}