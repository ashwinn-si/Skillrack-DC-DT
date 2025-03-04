import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();
        String currString = "";
        for (int i = 0; i < N; i++) {
            currString += sc.nextLine();

            int len = currString.length();
            if (str.length() < len) {
                len = str.length();
                if (!str.substring(0, len).equals(currString.substring(0, len))) {
                    System.out.println("false");
                    return;
                }
                break;
            }
            if (!str.substring(0, len).equals(currString)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
