/*
The program must accept two integers X and Y as the input. The program must find the binary
representations of X and Y. Then the program must toggle the bits in X if there are set bits in Y at the same
position from LSB(Least Significant Bit). Then the program must print the revised value of X as the output.
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    System.out.println(X ^ Y);
  }
}
