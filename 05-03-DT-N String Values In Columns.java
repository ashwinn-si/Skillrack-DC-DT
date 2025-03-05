import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int firstStringLen = -1;
        List<List<Character>> matrix = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int len = str.length();
            for (int index = 0; index < len; index++) {
                if (i == 0) {
                    firstStringLen = len;
                    List<Character> row = new ArrayList<>();
                    row.add(str.charAt(index));
                    matrix.add(row);
                } else {
                    matrix.get(index % firstStringLen).add(str.charAt(index));
                }
            }
            if (i != 0) {
                int endIndex = len % firstStringLen;
                if (endIndex == 0)
                    continue;
                for (int index = endIndex; index < firstStringLen; index++) {
                    matrix.get(index).add('*');
                }
            }
        }

        int colLen = matrix.get(0).size();
        for (int i = 0; i < firstStringLen; i++) {
            for (int j = 0; j < colLen; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}