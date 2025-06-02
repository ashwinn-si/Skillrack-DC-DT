/*
The program must accept a list of words as the input. The program must print the output based on the following
conditions.
- If the given list of words present horizontally, then the program must print the list of words vertically in reverse order.
- If the given list of words present vertically, then the program must print the list of words horizontally in reverse order.
Finally, the program must print the total number of words as the output.

Input:
one two three four

Output:
four
three
two
one
4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		while(sc.hasNext()){
		    String str = sc.nextLine();
		    arr.add(str);
		}
		if(arr.size() == 1){
		    int count = 0;
		    String arr1[] = arr.get(0).strip().split(" ");
		    for(int i = arr1.length - 1; i >= 0 ; i--){
		        System.out.println(arr1[i]);
		        count++;
		    }
		    System.out.print(count);
		}else{
		    Collections.reverse(arr);
		    for(String str: arr){
		        System.out.print(str+" ");
		    }
		    System.out.print("\n"+arr.size());
		}

	}
}