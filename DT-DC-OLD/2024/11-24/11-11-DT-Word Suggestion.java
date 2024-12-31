/*The program must accept N string values and a string S as the input. The N string values
represent the words present in a text document. The string S is a word to be typed in the text
document. The text document is opened in a text editor which suggests the words among the
N words after each character of S is typed. The suggested words should have a common prefix
with the word S. The program must print the suggested words after each character of S is
typed. The suggested words must be printed in sorted order. If there are no words to suggest,
the program must print -I.

Input:
8
monsoon
moonlight
mute
monday
make
monks
monochrome
monster
mono

Output:
make monday monks monochrome monsoon monster moonlight mute
monday monks monochrome monsoon monster moonlight
monday monks monochrome monsoon monster
monochrome
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<String> names = new ArrayList<>();
		for(int i = 0 ; i < N ; i++){
		    names.add(sc.nextLine());
		}
		String target = sc.nextLine();
		Collections.sort(names);
	    for(int i = 0 ; i < target.length() ; i++){
	        boolean flag = false;
	        for(String str : names){
	            if(str.length()>i && str.substring(0,i+1).equals(target.substring(0,i+1))){
	                flag = true;
	                System.out.printf("%s ",str);
	            }
	        }
	        if(!flag){
	            System.out.printf("-1");
	        }
	        System.out.println();
	    }
	}
}