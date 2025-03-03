import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int len1 = str1.length();
        String str2 = sc.nextLine();
        int len2 = str2.length();
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < len1; i++) {
            hash.put(str1.charAt(i), hash.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < len2; i++) {
            char ch = str2.charAt(i);
            if (hash.get(ch) != null) {
                hash.put(ch, hash.get(ch) - 1);
                if (hash.get(ch) == 0) {
                    hash.remove(ch);
                }
            }
            if (hash.size() == 0) {
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");

    }
}