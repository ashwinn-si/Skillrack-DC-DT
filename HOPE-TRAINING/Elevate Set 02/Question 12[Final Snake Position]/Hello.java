import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int currI = 0, currJ = 0;
        for (int i = 0; i < C; i++) {
            String str = sc.next();
            if (str.equals("RIGHT")) {
                currJ++;
            } else if (str.equals("LEFT")) {
                currJ--;
            } else if (str.equals("UP")) {
                currI--;
            } else {
                currI++;
            }
        }
        System.out.print(currI * N + currJ);
    }
}