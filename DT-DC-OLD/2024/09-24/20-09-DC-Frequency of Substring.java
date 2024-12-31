/*The program must accept a string S and an integer K as the input. The program must print all
possible unique substrings of length K along with the count of their occurrence in the string S
as the output. The substrings must be printed in the order of their occurrence in the string S.

Input:
engineering
2

Output:
en 1
ng 2
gi 1
in 2
ne 1
ee 1
er 1
ri 1

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hash=new HashMap<>();
		String str=sc.nextLine();
		int n=sc.nextInt();
		int len=str.length();
		for(int i=0;i<=len-n;i++){
		    hash.put(str.substring(i,i+n),hash.getOrDefault(str.substring(i,i+n),0)+1);
		}
		for(int i=0;i<=len-n;i++){
            if(hash.get(str.substring(i,i+n)) !=0){
		        System.out.printf("%s %d\n",str.substring(i,i+n),hash.get(str.substring(i,i+n)));
		        hash.put(str.substring(i,i+n),0);
            }
		}
	}
}