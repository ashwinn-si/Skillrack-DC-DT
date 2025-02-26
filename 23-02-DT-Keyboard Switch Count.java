import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                hash.put(str.charAt(j), i + 1);
            }
        }
        String str = sc.nextLine();
        int currRow = 2;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res += Math.abs(currRow - hash.get(str.charAt(i)));
            currRow = hash.get(str.charAt(i));
        }
        System.out.print(res);
    }
}