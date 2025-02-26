import java.util.*;

public class Hello {
    static long helper(int pos, ArrayList<Integer> arr, int size) {
        int pointer1 = pos - 1;
        int pointer2 = pos + 1;
        long count = 0;
        int incPointer1 = 1;
        int incPointer2 = 1;
        while (pointer1 >= 0 || pointer2 < size) {
            if (pointer1 >= 0) {
                count += Math.abs(arr.get(pos) - arr.get(pointer1) - incPointer1);
                incPointer1++;
                pointer1--;
            }
            if (pointer2 < size) {
                count += Math.abs(arr.get(pointer2) - arr.get(pos) - incPointer2);
                incPointer2++;
                pointer2++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                arr.add(i);
            }
        }
        if (arr.size() == str.length() || arr.size() == 1) {
            System.out.print("0");
        } else {
            int size = arr.size();
            if (size % 2 == 0) {
                System.out.print(Math.min(helper(size / 2, arr, size), helper(size / 2 - 1, arr, size)));
            } else {
                System.out.print(helper(size / 2, arr, size));
            }
        }

    }

}