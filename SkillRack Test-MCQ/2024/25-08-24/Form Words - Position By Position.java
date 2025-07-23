/*program must accept a space separated S ar•d must form the weed
onsiderirg the first letter of words in S The must fum second word
the secorvs letter Of all the words S nd the must prett all
words thus formed.

input-out see in ss
*/ 

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String input_string[]=sc.nextLine().split(" ");
		int total_no_strings=input_string.length;
		int string_lens[]=new int[total_no_strings];
		for(int i=0;i<total_no_strings;i++){
		    string_lens[i]=input_string[i].length();
		}
		int letter_position=0;
        while(true){
            boolean flag=false;
            for(int i=0;i<total_no_strings;i++){
                if(string_lens[i]-1>=letter_position){
                    System.out.printf("%c",input_string[i].charAt(letter_position));
                    flag=true;
                }
            }
            System.out.printf(" ");
            letter_position++;
            if(!flag){
                break;
            }
        }
	}
}

