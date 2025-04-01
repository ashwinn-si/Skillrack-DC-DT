/*
The program must accept an integer matrix of size
R*C containing only Os and Is as the input. Each
column of the matrix represents the binary
representation of an integer. The program must
find the maximum possible decimal equivalent for
each column in the matrix (i.e., the maximum value
between the decimal equivalent of the column
from top to bottom and the decimal equivalent of
the column from bottom to top). Finally, the
program must print the sum of all the C integers
obtained as the output.

Input:
6 4
1 0 0 1
1 1 0 0
0 0 1 1
1 0 1 0
0 1 0 1
1 1 0 0


Output:
157
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        List<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (i == 0) {
                    list.add(new StringBuffer(""));
                }
                list.get(j).append(sc.next().charAt(0));
            }
        }
        int res = 0;
        for (int i = 0; i < C; i++) {
            res += Math.max(Integer.parseInt(list.get(i).toString(), 2),
                    Integer.parseInt(list.get(i).reverse().toString(), 2));
        }
        System.out.print(res);
    }
}
