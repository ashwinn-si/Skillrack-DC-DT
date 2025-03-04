import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Boolean> hash = new HashMap<>();
        int N = sc.nextInt();
        int prevInteger = -1;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                prevInteger = sc.nextInt();
            } else {
                int currInteger = sc.nextInt();
                int sum = currInteger + prevInteger;
                if (hash.get(sum) != null) {
                    System.out.print(true);
                    return;
                } else {
                    hash.put(sum, true);
                    prevInteger = currInteger;
                }
            }

        }
        System.out.print(false);

    }
}