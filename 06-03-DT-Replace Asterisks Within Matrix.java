import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char flattedMatrix[] = new char[R * C];
        char replaceFlattedMatrix[] = new char[R * C];
        int pointer1 = 0, pointer2 = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                flattedMatrix[pointer1] = sc.next().charAt(0);
                pointer1++;
            }
        }
        pointer1 = 0;

        for (int i = R - 1; i >= 0; i--) {
            for (int j = 0; j < C; j++) {
                replaceFlattedMatrix[pointer1] = flattedMatrix[((i * C) + j) % (R * C)];
                pointer1++;
            }
        }

        pointer1 = 0;
        while (pointer1 < R * C) {
            if (flattedMatrix[pointer1] == '*') {
                while (replaceFlattedMatrix[pointer2] == '*') {
                    pointer2 = (pointer2 + 1) % (R * C);
                }
                flattedMatrix[pointer1] = replaceFlattedMatrix[pointer2];
                pointer2++;
            }
            pointer1++;
        }
        pointer1 = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(flattedMatrix[pointer1] + " ");
                pointer1++;
            }
            System.out.println();
        }
    }
}