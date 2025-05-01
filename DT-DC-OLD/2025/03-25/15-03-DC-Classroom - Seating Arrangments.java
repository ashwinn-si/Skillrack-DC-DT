
/*
In a classroom, there are R*C chairs arranged as a matrix. There are R*C students and they are grouped
based on the marks they score. The groups are numbered from 1 to N. The values of R, C and the number
of students in each group are passed as the input. The program must form an integer matrix representing
the R*C chairs in the classroom. The class teacher wants to seat the students based on the following
conditions.
- The ISt row of the matrix represents the Rth row of the classroom and the Rth row of the matrix represents
the ISt row of the classroom.
- The students must sit from the ISt row of the classroom (left to right).
- The order of the students is from the ISt group to the Nth group (i.e., the students who belong to the group
1 must be seated in the first row of the classroom, the students who belong to the group 2 must start from
where the previous group ended, then the remaining students must be seated in the remaining rows based
on the group).
Finally, the program must print the integer matrix representing the seating arrangement of the classroom,
where each integer represents the number of the students in the group as the output.



Input:
5 4 3
5 8 7

Output:
3 3 3 3
2 3 3 3
2 2 2 2
1 2 2 2
 */

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        int count[] = new int[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            count[i] = sc.nextInt();
        }

        int pointer = 0;
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j < C; j++) {
                if (count[pointer] == 0) {
                    pointer++;
                }
                currRow.add(pointer + 1);
                count[pointer]--;
            }
            matrix.add(currRow);
        }

        for (int i = R - 1; i >= 0; i--) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}