
/*
The function/method sortRowsAndColumns accepts three arguments R, C and matrix. The first two
arguments R and C represent the size of an integer matrix. The third argument matrix represents a pointer to
the R*C integer matrix.
The function/method sortRowsAndColumns must sort the integers in each row. Then the function must sort
the integers in each column of the given matrix.

INPUT:
4 5
96 66 74 60 18
42 12 96 62 15
68 29 64 92 24
60 44 37 61 53
 */
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    sc.nextLine();
    ArrayList<PriorityQueue<Integer>> arr = new ArrayList<>();

    for (int j = 0; j < C; j++) {
      arr.add(new PriorityQueue<Integer>());
    }

    for (int i = 0; i < R; i++) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for (int j = 0; j < C; j++) {
        int num = sc.nextInt();
        pq.offer(num);
      }
      int index = 0;
      while (!pq.isEmpty()) {
        arr.get(index++).offer(pq.poll());
      }
    }

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        System.out.print(arr.get(j).poll() + " ");
      }
      System.out.println();
    }
  }
}