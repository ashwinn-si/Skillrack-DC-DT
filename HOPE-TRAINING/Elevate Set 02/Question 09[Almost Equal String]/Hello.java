import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        List<Integer> index = new ArrayList<>();
        int len1 = str1.length(), len2 = str2.length();
        if (len1 != len2) {
            System.out.print(false);
            return;
        }
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                index.add(i);
            }
        }
        if (index.size() == 2 || index.size() == 0) {

            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}