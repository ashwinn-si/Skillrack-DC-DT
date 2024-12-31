/*The program must accept a list of integers as the input The program must modify the list
based on the following conditions.
- If an integer X and the integer to its right Y are equal in the given list, then the program must
replace the integer X with the next multiple of X and the integer Y with O. Similarly, the
program must replace the integers in the list from the left to right
- Then the program must shift all the zeroes to the end of the list.
Finally, the program must print the integers in the modified list as the output.

Input:
2 2 0 3 3 8

Output:
4 6 8 0 0 0
*/
import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_line[] = sc.nextLine().split(" ");
        
        for (int i = 0; i < input_line.length - 1; i++) {
            if (Integer.parseInt(input_line[i]) == Integer.parseInt(input_line[i + 1])) {
                input_line[i] = String.valueOf(Integer.parseInt(input_line[i]) * 2);
                input_line[i + 1] = "0";
            }
        }
        int count=0;
        for (int i = 0; i < input_line.length; i++) {
            if (Integer.parseInt(input_line[i]) != 0) {
                System.out.printf("%s ", input_line[i]);
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.printf("0 ");
        }
    }
}
