/*
There are N laps in a car race. For each lap, the program must accept the lap time(in seconds) in 8-bit binary
format as the input. The program must find the total race time and print it in the format of HH:MM:SS as the
output.

Input:
3
00111000
01000100

Output:
00:03:23

Explanation:
ISt lap: 00111000 -> 56 seconds.
3rd lap: 01000100 68 seconds.
So the total time is 203 seconds.
Hence the output is 00:03:23.
 */

import java.util.*;

public class Hello {
  static int getValue(String num) {
    int result = 0;
    int bitShift = 0;
    while (bitShift < 8) {
      result += (num.charAt(8 - bitShift - 1) - '0') * 1 << bitShift++;
    }
    return result;
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    int resultSec = 0;
    for (int i = 0; i < N; i++) {
      resultSec += getValue(sc.nextLine());
    }
    System.out.printf("%02d:%02d:%02d", resultSec / 3600, (resultSec % 3600) / 60, (resultSec % 3600) % 60);
  }
}