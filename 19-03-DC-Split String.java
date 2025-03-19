import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> leftSet = new HashSet<>();
        HashSet<Character> rightSet = new HashSet<>();
        HashMap<Character, Integer> rightHash = new HashMap<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            rightSet.add(str.charAt(i));
            rightHash.put(str.charAt(i), rightHash.getOrDefault(str.charAt(i), 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            leftSet.add(str.charAt(i));
            if (rightHash.get(str.charAt(i)) == 1) {
                rightSet.remove(str.charAt(i));
                rightHash.put(str.charAt(i), 0);
            } else {
                rightHash.put(str.charAt(i), rightHash.get(str.charAt(i)) - 1);
            }
            if (leftSet.size() == rightSet.size()) {
                count++;
            }
        }
        System.out.print(count);

    }
}