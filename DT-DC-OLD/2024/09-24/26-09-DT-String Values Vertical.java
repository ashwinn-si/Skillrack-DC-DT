/*The program must accept N string values as the input. The program must print the first
character of all N string values. Then the program must print the second character of all N
string values. Then the program must print the third character of all N string values. Similarly,
the program must print the remaining characters of all N string values as the output.

Input:
4
skill
Robot
boy
TALL

Output:
sRbTkooAibyLloLlt

Explanation:
The given 4 strings are skill, Robot, boy and TALL
The first character of the 4 string values are s, R, b and T.
The second character of the 4 string values are k, o, o and A.
Similarly, the remaining characters are printed.
sRbTkooAibyLloLlt
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[N];
		int arr_len[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextLine();
		    arr_len[i]=arr[i].length();
		}
		int curr_index=0;
		while(true){
		    Boolean flag=false;
		    for(int i=0;i<N;i++){
		        if(curr_index<arr_len[i]){
		            flag=true;
		            System.out.printf("%c",arr[i].charAt(curr_index));
		        }
		    }
		    if(!flag){
		        return;
		    }
		    curr_index++;
		}

	}
}