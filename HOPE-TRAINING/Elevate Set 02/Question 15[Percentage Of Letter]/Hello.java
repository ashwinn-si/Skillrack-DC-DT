import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        double len = str.length(), count = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        double result = Math.floor(((double) (count / len)) * 100);
        System.out.printf("%.0f", result);
    }
}