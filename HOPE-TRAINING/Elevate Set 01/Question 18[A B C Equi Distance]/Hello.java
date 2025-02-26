import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (str.charAt(i) == 'A' && str.charAt(j) == 'B' && str.charAt(k) == 'C') {
                        if (j - i == k - j) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}