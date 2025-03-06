import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int bitsLen = Integer.toBinaryString(N).length();
        if ((N & (N + 1)) == 0) { // check if the number already has all the bits as 1
            System.out.print(N);
            return;
        }
        int result = (1 << bitsLen) - 1;
        System.out.print(result);
    }
}