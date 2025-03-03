import java.util.*;

public class Hello {
    static int helper(int x1, int y1, int x2, int y2) {
        return ((x2 - x1) + (y2 - y1));
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int matrix[][] = new int[R][C];
        TreeMap<Integer, Corr> hash = new TreeMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] != 0) {
                    hash.put(matrix[i][j], new Corr(i, j));
                    array.add(matrix[i][j]);
                }
            }
        }
        int hashSize = hash.size();
        int totalDistance = 0;
        Collections.sort(array);
        for (int i = 0; i < hashSize - 1; i++) {
            Corr point1 = hash.get(array.get(i));
            Corr point2 = hash.get(array.get(i + 1));

            int curr = helper(Math.min(point1.x, point2.x), Math.min(point1.y, point2.y), Math.max(point1.x, point2.x),
                    Math.max(point1.y, point2.y));

            totalDistance += curr;

        }
        System.out.print((totalDistance));

    }
}

class Corr {
    int x, y;

    Corr(int x, int y) {
        this.x = x;
        this.y = y;
    }
}