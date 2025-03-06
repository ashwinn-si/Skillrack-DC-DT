import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != 'i') {
                result.append(str.charAt(i));
            } else {
                result = result.reverse();
            }
        }
        System.out.print(result);
    }
}