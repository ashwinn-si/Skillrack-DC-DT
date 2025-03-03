import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
            sorted.add(arr.get(i));
        }
        Collections.sort(sorted);
        for (int i = 0; i < N; i++) {
            if (hash.get(sorted.get(i)) == null) {
                hash.put(sorted.get(i), i);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", hash.get(arr.get(i)));
        }

    }
}