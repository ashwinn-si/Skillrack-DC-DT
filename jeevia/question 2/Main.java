import java.util.*;

public class Main {
    static boolean helper(char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int consonentCount[] = new int[C];
        ArrayList<List<Character>> colWiseMatrix = new ArrayList<>();

        for (int j = 0; j < C; j++) {
            colWiseMatrix.add(new ArrayList<>());
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                colWiseMatrix.get(j).add(sc.next().charAt(0));
                if (helper(Character.toLowerCase(colWiseMatrix.get(j).get(i)))) {
                    consonentCount[j]++;
                }
            }
        }

        for (int i = 0; i < C; i++) {
            if (consonentCount[i] == R) {
                Collections.sort(colWiseMatrix.get(i));
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(colWiseMatrix.get(j).get(i) + " ");
            }
            System.out.println();
        }

    }
}