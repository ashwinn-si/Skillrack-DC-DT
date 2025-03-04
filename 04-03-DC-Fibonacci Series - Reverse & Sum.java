import java.util.*;

public class Hello {
    static void helper(long a, long b, int currCount, int target) {
        if (currCount == target) {
            return;
        }
        long reverseB = 0;
        while (b != 0) {
            reverseB = (reverseB * 10) + (b % 10);
            b /= 10;
        }
        long sum = a + reverseB;
        System.out.print(sum + " ");
        helper(reverseB, sum, currCount + 1, target);
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
            System.out.print("0");
        } else if (N == 2) {
            System.out.print("0 1");
        } else {
            System.out.print("0 1 ");
            helper(0, 1, 2, N);
        }

    }
}