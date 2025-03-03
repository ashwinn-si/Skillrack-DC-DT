import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), E = sc.nextInt();
        int total = 0;
        while (N >= E) {
            total += E;
            N -= (E - 1);
        }
        total += N;
        System.out.printf("%d", total);
    }
}