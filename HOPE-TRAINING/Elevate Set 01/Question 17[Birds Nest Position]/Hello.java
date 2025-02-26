import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int nestCount = sc.nextInt();
        int queries = sc.nextInt();

        HashMap<Integer, Integer> birdsPosition = new HashMap<>();
        int nest[] = new int[nestCount];
        int count = 0;

        for (int i = 0; i < nestCount; i++) {
            nest[i] = 1;
            birdsPosition.put(i, i);
        }

        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();
            if (type == 2) {
                System.out.print(count + " ");
            } else {
                int bird = sc.nextInt() - 1;
                int nestIndex = sc.nextInt() - 1;

                if (nest[birdsPosition.get(bird)] == 2) {
                    count--;
                }
                nest[birdsPosition.get(bird)]--;

                if (nest[nestIndex] == 1) {
                    count++;
                }
                nest[nestIndex]++;

                birdsPosition.put(bird, nestIndex);

            }
        }

    }
}