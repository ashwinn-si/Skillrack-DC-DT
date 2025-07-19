
/*
 * The program must accept the coordinates (x, y) of N
 * points on a graph as the input. The program must print
 * the length of the longest line parallel to the x-axis that
 * can be formed by joining two or more points. If it is
 * not possible to form a line parallel to the x-axis, then
 * the program must print -1 as the output.
 * 
 * Input:
 * 8
 * 1 3
 * 2 3
 * 4 3
 * -2 -2
 * 4 -2
 * 0 0
 * 3 -2
 * Output:
 * 6
 * 
 */
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    HashMap<Integer, Coor> hash = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (hash.get(y) != null) {
        Coor obj = hash.get(y);
        obj.addValue(x);
      } else {
        Coor obj = new Coor();
        obj.addValue(x);
        hash.put(y, obj);
      }
    }
    int result = -1;
    for (int num : hash.keySet()) {
      Coor obj = hash.get(num);
      result = Math.max(result, obj.getLength());
    }
    System.out.println(result);
  }
}

class Coor {
  int min, max;

  Coor() {
    min = Integer.MAX_VALUE;
    max = Integer.MIN_VALUE;
  }

  void addValue(int value) {
    this.min = Math.min(this.min, value);
    this.max = Math.max(this.max, value);
  }

  int getLength() {
    if (this.min == this.max) {
      return -1;
    } else {
      return this.max - this.min;
    }
  }
}