import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int len = num.length(), oddIndex = -1;
        for (int i = len - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                oddIndex = i;
                break;
            }
        }
        if (oddIndex == -1) {
            System.out.print("0");
        } else {
            System.out.print(num.substring(0, oddIndex + 1));
        }
    }
}