import java.util.*;

public class Hello {
    public static void main(String[] args) {
        // Your Code Here
        // 1000 -> 4
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int rightValue = 0, leftValue = 0, len = str.length(), max = 0;
        // finding the no of ones in right
        for (int i = 1; i < len; i++) {
            if (str.charAt(i) == '1') {
                rightValue++;
            }
        }
        // finding the initial left value
        if (str.charAt(0) == '0') {
            leftValue++;
        }

        max = Math.max(leftValue + rightValue, max);
        for (int i = 1; i < len - 1; i++) {
            if (str.charAt(i) == '0') {
                leftValue++;
            } else {
                rightValue--;
            }
            max = Math.max(max, leftValue + rightValue);
        }
        System.out.print(max);
    }
}