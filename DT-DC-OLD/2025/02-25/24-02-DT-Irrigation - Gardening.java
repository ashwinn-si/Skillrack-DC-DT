import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int plants[] = new int[N];
        int reqLiters = 0;
        int currentLiters = 0;
        for (int i = 0; i < N; i++) {
            plants[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (plants[0] > plants[N - 1]) {
                    currentLiters = 2;
                } else {
                    currentLiters = 1;
                }
                reqLiters += currentLiters;
            } else {
                if (plants[i] > plants[i - 1]) {
                    currentLiters++;
                    reqLiters += currentLiters;
                } else {
                    currentLiters = 1;
                    reqLiters += currentLiters;
                }
            }
        }
        System.out.println(reqLiters);
    }
}