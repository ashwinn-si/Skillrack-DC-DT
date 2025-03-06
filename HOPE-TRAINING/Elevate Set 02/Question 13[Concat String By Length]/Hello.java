import java.util.*;

public class Hello {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<Pair> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            arr.add(new Pair(str, str.length()));
        }

        Collections.sort(arr, (a, b) -> a.len - b.len);

        for (int i = 0; i < N; i++) {
            System.out.print(arr.get(i).str + "");
        }
    }
}

class Pair {
    int len;
    String str;

    Pair(String str, int len) {
        this.str = str;
        this.len = len;
    }
}