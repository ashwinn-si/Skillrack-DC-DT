import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String directions = sc.nextLine();
        int len = directions.length();
        int x = 0, y = 0;
        List<List<Integer>> points = new ArrayList<>();
        points.add(Arrays.asList(0, 0));
        for (int i = 0; i < len; i++) {
            switch (directions.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            List<Integer> currPoint = Arrays.asList(x, y);
            if (points.contains(currPoint)) {
                System.out.print(true);
                return;
            }
            points.add(currPoint);
        }
        System.out.print(false);
    }
}
