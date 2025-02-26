import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = sc.nextInt();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a != b)
                set.add(new ArrayList<>(Arrays.asList(Math.min(a, b), Math.max(a, b))));
        }
        // max no of possible edges = (node * (node - 1)) / 2
        System.out.print(q - set.size());

    }
}