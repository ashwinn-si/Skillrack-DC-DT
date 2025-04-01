import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String rowMatrix[] = new String[N];
        String colMatrix[] = new String[N];
        for (int i = 0; i < N; i++) {
            String str = "";
            for (int j = 0; j < N; j++) {
                str += sc.next().charAt(0);
            }
            rowMatrix[i] = str;
            for (int j = 0; j < N; j++) {
                if (colMatrix[j] == null)
                    colMatrix[j] = "";
                colMatrix[j] += rowMatrix[i].charAt(j);
            }
        }
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        List<Integer> rowOccuranceStr1 = new ArrayList<>();
        List<Integer> rowOccuranceStr2 = new ArrayList<>();
        List<Integer> colOccuranceStr1 = new ArrayList<>();
        List<Integer> colOccuranceStr2 = new ArrayList<>();
        int size[] = new int[4]; // rowS1, colS1, rowS2, colS2
        for (int i = 0; i < N; i++) {
            String rowString = rowMatrix[i];
            String colString = colMatrix[i];
            if (rowString.contains(str1) || new StringBuffer(rowString).reverse().toString().contains(str1)) {
                rowOccuranceStr1.add(i);
                size[0]++;
            }
            if (rowString.contains(str2) || new StringBuffer(rowString).reverse().toString().contains(str2)) {
                rowOccuranceStr2.add(i);
                size[2]++;
            }
            if (colString.contains(str1) || new StringBuffer(colString).reverse().toString().contains(str1)) {
                colOccuranceStr1.add(i);
                size[1]++;
            }
            if (colString.contains(str2) || new StringBuffer(colString).reverse().toString().contains(str2)) {
                colOccuranceStr2.add(i);
                size[3]++;
            }
        }

        for (int i = 0; i < size[0]; i++) {
            int currRow = rowOccuranceStr1.get(i);
            for (int j = 0; j < size[2]; j++) {
                if (currRow != rowOccuranceStr2.get(j)) {
                    System.out.print("YES");
                    return;
                }
            }
        }
        for (int i = 0; i < size[1]; i++) {
            int currCol = colOccuranceStr1.get(i);
            for (int j = 0; j < size[3]; j++) {
                if (currCol != colOccuranceStr2.get(j)) {
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
    }
}