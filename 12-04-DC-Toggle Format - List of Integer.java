/*
The program must accept a list of integers as the input. The program must print the output based on the following
conditions.
- If the given list of integers present horizontally, then the program must print the list of integers vertically in reverse
order.
- If the given list of integers present vertically, then the program must print the list of integers horizontally in reverse
order.

Input:
10 20 30 40 50
Output:
50
40
30
20
10
Explanation:
Here the given list of integers present horizontally as 10 20 30 40 50.
So the list of integers are printed vertically in reverse order.

 */

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int flag = 2; // 1-> horizontal, 2 -> vertical
		List<String> result = new ArrayList<>();
		while(sc.hasNext()){
		    String str[] = sc.nextLine().strip().split(" ");
		    int len = str.length;
		    if(len > 1){
		        flag = 1;
		    }
		    for(int i = 0 ; i < len ; i++){
		        result.add(str[i]);
		    }
		}
		int len = result.size();
		for(int i = len - 1 ; i >= 0 ; i--){
		    if(flag == 1){
		        System.out.println(result.get(i));
		    }else{
		        System.out.print(result.get(i)+" ");
		    }
		}

	}
}