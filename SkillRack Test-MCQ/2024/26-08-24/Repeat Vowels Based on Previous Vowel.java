/*The program must accept a string S and then for each vowel (upper or lower case) the vowel
must be repeated X times, where X is the difference between the position of the current vowel
and the previous vowel. For the first occurring vowel, the program must repeat the vowel by its
position. The string S will have at least one vowel.

Input:
Mangoes

Output:
aaoooe

Explanation:
a occurs in 2nd position(first vowel in S). So a is repeated two times.
o occurs in 5 position. So o is repeated 3 times (5 - 2).
e occurs in 6 position. So e is repeated once (6 - 5).*/

import java.util.*;
public class Hello {
    public static boolean checker(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		int previous_vowel_pos=0;
		for(int index=0;index<string.length();index++){
		    if(checker(string.charAt(index))){
		        for(int r=0;r<=index-previous_vowel_pos;r++){
		            System.out.printf("%c",string.charAt(index));
		        }
		        previous_vowel_pos=index+1;
		    }
		}
	}
}