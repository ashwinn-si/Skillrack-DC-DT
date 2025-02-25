import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int edgeZero = -1, midZero = len - 2;
        for (int i = 0; i <= len; i++) {
            String currString;
            if (i == 0) {
                currString = str.substring(0, 1);
            } else if (i == len) {
                currString = str.substring(len - 1, len);
            } else {
                currString = str.substring(i - 1, i + 1);
            }
            String revString = (new StringBuffer(currString)).reverse().toString();
            if (i < len / 2) {
                System.out.println("*".repeat(Math.max(0, edgeZero)) + currString + "*".repeat(midZero) + revString
                        + "*".repeat(Math.max(0, edgeZero)));
                edgeZero++;
                midZero -= 2;
            } else if (i == len / 2 || i == (len / 2) + 1) {
                if (i == len / 2) {
                    System.out.println("*".repeat(Math.max(0, edgeZero)) + currString.substring(0, 1) + revString
                            + "*".repeat(Math.max(0, edgeZero)));
                } else {
                    System.out.println("*".repeat(Math.max(0, edgeZero)) + currString.substring(1, 2) + currString
                            + "*".repeat(Math.max(0, edgeZero)));
                }
            } else {
                edgeZero--;
                midZero += 2;
                System.out.println("*".repeat(Math.max(0, edgeZero)) + revString + "*".repeat(Math.max(0, midZero))
                        + currString + "*".repeat(Math.max(0, edgeZero)));
            }
        }
    }
}