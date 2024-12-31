/*The program must accept N string values as the input. If a string is a substring of another
string among the N string values, then it is a super substring. The program must print the
super substring values among the given N string values as the output. If there is no super
substring, the program must print -1 as the output.

Input:
5
art
moon
artist
on
moonwalk

Output:
art
moon
on
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextLine();
		}
		boolean flag=true;
		for(int i = 0 ; i < N ; i++){
		    for(int j = 0 ;j < N ; j++){
		        if(i!=j && arr[j].indexOf(arr[i]) != -1){
		            System.out.println(arr[i]);
		            flag=false;
		            break;
		        }
		    }
		}
		if(flag)System.out.printf("-1");
	}
}