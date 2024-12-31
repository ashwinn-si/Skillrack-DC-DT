/*The program must accept a string S containing multiple words as the input. The program must
print the words in S till the word that has the maximum number of consonants. If two or more
words have the same maximum number of consonants, the program must print till the last
occurring word among those words.

Input:
Hi bob@123, your transaction is successful. Thank You.

Output:
Hi bob@123, your transaction is successful.

Explanation:
The number of consonants in the word Hi is l.
The number of consonants in the word bob@123, is 2.
The number of consonants in the word your is 2.
The number of consonants in the word transaction is 7.
The number of consonants in the word is is 1.
The number of consonants in the word successful. is 7.
The number of consonants in the word Thank is 4.
The number of consonants in the word You. is 1.
Here the maximum number of consonants is 7.
The words "transaction" and "successful." have the same maximum number of consonants, so
the words till the last occurring word "successful." are printed as the output.
Hence the output is
Hi bob@123, your transaction is successful.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String stringParts[] = sc.nextLine().split(" ");
		int maxValue=Integer.MIN_VALUE;
		int maxIndex=-1;
		for(int i =0;i<stringParts.length;i++){
		    int currCount=helper(stringParts[i]);
		    if(currCount>=maxValue){
		        maxValue=currCount;
		        maxIndex=i;
		    }
		}
		
		for(int i=0;i<=maxIndex;i++){
		    System.out.printf("%s ",stringParts[i]);
		}

	}
	static int helper(String s){
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        char ch = Character.toLowerCase(s.charAt(i));
	        if(ch>='a' && ch <='z' && ch !='a' && ch !='e' && ch!='i'  && ch != 'o' && ch !='u'){
	            count++;
	        }
	    }
	    return count;
	}
}