/*
The program must accept two string values W and S as the input. If the string S is formed by inserting the
word W inside the word W one or more times, then the program must print YES as the output. Else the
program must print NO as the output.

Input:
sesevesevennven

Output:
YES
W = seven
S = sesevesevennven
Here the string S is formed by inserting the word W inside the W two times.
se(seven)ven sesevenven
=> sesevesevennven
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		StringBuffer S = new StringBuffer(sc.nextLine());
		int count = 0;
		while(true){
		    if(S.length()==0 && count > 1){
		        System.out.print("YES");
		        return;
		    }
		    int index = S.indexOf(W);
		    if(index == -1){
		        System.out.print("NO");
		        return;
		    }
		    count++;
		    S.delete(index,index+W.length());
		}

	}
}