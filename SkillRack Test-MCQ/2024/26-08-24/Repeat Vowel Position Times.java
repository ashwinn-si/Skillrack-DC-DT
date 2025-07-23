/*The program must accept a string S and then for each vowel (upper or lower case) the vowel
must be repeated the number of times its position. The string S will have at least one vowel.

Input:
apple

Output:
aeeeee

Explanation:
a occurs in ISt position. So a is repeated once.
e occurs in 5 position. So e is repeated five times.
*/ 

import java.util.*;
public class Hello {
    public static boolean v_checker(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		for(int index=0;index<string.length();index++){
		    if(v_checker(string.charAt(index))){
		        for(int r=0;r<=index;r++){
		            System.out.printf("%c",string.charAt(index));
		        }
		    }
		}

	}
}
