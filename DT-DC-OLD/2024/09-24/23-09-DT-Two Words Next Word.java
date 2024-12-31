/*The program must accept two words (WI and W2) and a string S containing multiple words as
the input. The program must print the words that occur immediately after WI and W2 in the
string S. If there is no such word in S, then the program must print -I as the output.

Input:
Good
Alice is a Good girl she is a Good student

Output:
girl student

Explanation:
Here WI = a and W2 = Good.
The words that occur immediately after WI and W2 in the string S are girl and student.
Hence the output is
girl student
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String words[]=sc.nextLine().strip().split(" ");
		boolean flag=false;
		int len=words.length;
        for(int i=2;i<len;i++){
            if((words[i-2].equals(s1) && words[i-1].equals(s2))){
                System.out.printf("%s ",words[i]);
                flag=true;
            }
        }
        if(!flag){
            System.out.print("-1");
        }
	}
}