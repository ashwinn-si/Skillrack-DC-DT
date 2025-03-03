import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
            set.add(arr.get(i));
        }
        for (int i = 0; i < N; i++) {
            System.out.print((set.headSet(arr.get(i)).size() + 1) + " ");
        }

    }
}