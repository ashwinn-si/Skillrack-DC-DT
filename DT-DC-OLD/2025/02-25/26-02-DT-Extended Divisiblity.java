import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(N);
        int pointer = 0;
        while (arr.get(pointer) % K == 0) {
            for (int i = 0; i < K; i++)
                arr.add(arr.get(pointer) / K);
            pointer++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}