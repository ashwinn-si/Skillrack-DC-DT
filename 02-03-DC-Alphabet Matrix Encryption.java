import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Corr> hash = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String str = sc.next();
                if (str.length() > 1) {
                    hash.put(str.charAt(0), new Corr(i + 1, j + 1));
                    hash.put(str.charAt(2), new Corr(i + 1, j + 1));
                } else {
                    hash.put(str.charAt(0), new Corr(i + 1, j + 1));
                }

            }
        }
        sc.nextLine();
        String str[] = sc.nextLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            if (i != 0)
                System.out.print(" ");
            String str1 = str[i];
            for (int j = 0; j < str1.length(); j++) {
                System.out.print(hash.get(str1.charAt(j)).x + "" + hash.get(str1.charAt(j)).y);
            }
        }

    }
}

class Corr {
    int x, y;

    Corr(int x, int y) {
        this.x = x;
        this.y = y;
    }
}