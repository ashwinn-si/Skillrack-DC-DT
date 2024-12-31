/*The program must accept a string S as the input. The program must print the length of the
longest proper prefix which is also a proper suffix in S. If there is no common proper prefix and
proper suffix, the program must print -1 as the output.
Note; The proper prefix and proper suffix may overlap in the string S.

Input:
abcdxyzabcd

Output:
4

Explanation:
The longest proper prefix which is also a proper suffix in the string abcdxyzabcd is abcd.
So the length of the proper prefix or proper suffix is 4.
So 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<Integer> first_char_index=new ArrayList<>();
		int string_len=s.length();
		for(int i=1;i<string_len;i++){
		    if(s.charAt(i)==s.charAt(0)){
		        first_char_index.add(i);
		    }
		}
		int first_pointer=0;
		int result_len=-1;
		for(int i=0;i<first_char_index.size();i++){
		    int curr_index=first_char_index.get(i);
		    int curr_len=0;
		    while(curr_index<string_len && s.charAt(first_pointer)==s.charAt(curr_index)){
		        curr_len++;
		        curr_index++;
		        first_pointer++;
		    }
		    if(curr_index==string_len){
		        if(result_len<curr_len){
		            result_len=curr_len;
		        }
		    }
		    first_pointer=0;
		}
		System.out.print(result_len);
	}
}