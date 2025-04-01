import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<List<Integer>> rowWise = new ArrayList<>();
        List<List<Integer>> colWise = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                currRow.add(sc.nextInt());
            }
            rowWise.add(currRow);
            for (int j = 0; j < N; j++) {
                if (i == 0) {
                    colWise.add(new ArrayList<>(Arrays.asList(currRow.get(j))));
                } else {
                    colWise.get(j).add(currRow.get(j));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (rowWise.get(i).equals(colWise.get(j))) {
                    System.out.print("YES");
                    return;
                } else {
                    Collections.reverse(colWise.get(j));
                    if (rowWise.get(i).equals(colWise.get(j))) {
                        System.out.print("YES");
                        return;
                    }
                }
            }
        }
        System.out.print("NO");
    }
}