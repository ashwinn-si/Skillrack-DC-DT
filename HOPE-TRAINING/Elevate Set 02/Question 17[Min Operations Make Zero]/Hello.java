/*
Alternative approach 
@jeevia solution
-> initilize a set
-> append every non zero element to the set
-> the no of elements in the set is the no of operations required to make all the elements zero
-> print(set.size())
*/

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int countNonZeroElement = 0, minElement = Integer.MAX_VALUE;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] != 0) {
                countNonZeroElement++;
                minElement = Math.min(nums[i], minElement);
            }
        }
        int count = 0;
        while (countNonZeroElement != 0) {
            count++;
            int newMinValue = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (nums[i] == 0)
                    continue;
                nums[i] -= minElement;
                if (nums[i] != 0) {
                    newMinValue = Math.min(newMinValue, nums[i]);
                } else {
                    countNonZeroElement--;
                }
            }
            minElement = newMinValue;
        }
        System.out.print(count);
    }
}