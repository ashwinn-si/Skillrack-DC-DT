/*The program must accept N string values as the input. The program must print all possible
prefixes of length 3 along with the number of string values having those prefixes among the N
string values as the output. The prefixes must be printed in sorted order.

Input:
11
honey
danger
dangling
ball
honour
donkey
strong
state
honda
honesty
stroke

Output:
bal 1
dan 2
don 1
hon 4
sta 1
str 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		TreeMap<String,Integer> treemap=new TreeMap<>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
		    String str=sc.nextLine();
		    treemap.put(str.substring(0,3),treemap.getOrDefault(str.substring(0,3),0)+1);
		}
		for(String curr_string:treemap.keySet()){
		    System.out.printf("%s %d\n",curr_string,treemap.get(curr_string));
		}
	}
}