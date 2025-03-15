/*
There are N chairs in a line. The program must
accept N integer values denoting the seating
details in these N chairs.
- 1 represents a healthy person sitting in a chair.
- O represents the chair being empty.
-2 represents the chair being occupied by a
Corona virus infected person.
Each Corona virus infected person will affect the
healthy persons sitting adjacent to him/her so that
the next day those affected will inturn start
infecting their healthy adjacent persons. The
program must print the number of days D required
for the virus to stop spreading and the number of
persons H who remain not infected by the virus in
the end.

Input:
7
1 1 2 1 0 1 0

Output:
31

Explanation:
At the end of the ISt day, the status will be 1 2 2 2 0 1 0.
At the end of the 2nd day, the status will be 2 2 2 2 0 1 0.
On the 3rd day, no infection happens.
So it takes 3 days for the virus to stop spreading
and I person remains healthy in the end.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int infectedPerson = 0, uninfectedPerson = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 1 && (arr[Math.max(0, i - 1)] == 2 || arr[Math.min(i + 1, N - 1)] == 2)) {
                    arr[i] = 2;
                    flag = true;
                    infectedPerson++;
                }
            }
            if (!flag) {
                break;
            }
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                uninfectedPerson++;
            }
        }
        System.out.print(infectedPerson + " " + uninfectedPerson);
    }
}