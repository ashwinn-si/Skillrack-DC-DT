import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int size = sc.nextInt();
        for (int i = 0; i < N / size; i++) {
            int st = i * size;
            int max = 0;
            for (int index = st; index < st + size; index++) {
                max = Math.max(max, nums[index]);
            }
            System.out.print(max + " ");
        }

    }
}