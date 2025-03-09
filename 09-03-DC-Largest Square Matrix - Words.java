import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().strip().split(" ");
        int len = str.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int currLen = str[i].length();
            if (hash.get(currLen) == null) {
                hash.put(currLen, 1);
            } else {
                hash.put(currLen, hash.get(currLen) + 1);
            }
        }
        int maxLen = -1;
        for (int key : hash.keySet()) {
            if (key <= hash.get(key)) {
                maxLen = Math.max(key, maxLen);
            }
        }
        if (maxLen == -1) {
            System.out.print("-1");
            return;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            int currLen = str[i].length();
            if (count == maxLen) {
                return;
            }
            if (currLen == maxLen) {
                for (int j = 0; j < currLen; j++) {
                    System.out.print(str[i].charAt(j) + " ");
                }
                count++;
                System.out.println();
            }
        }
    }
}