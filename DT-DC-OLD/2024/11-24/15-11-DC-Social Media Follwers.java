/*The program must accept N string values representing the relationship between users on social media. There are two ways to indicate the relationship between two users which are given below.
A->B (User A follows user B)
A<-B (User B follows user A)
The program must print the name of all users along with the number of followers in the social media (in separate lines) as the output. The names must be printed in alphabetical order. Note: Only 26 upper case alphabets are used to indicate the name of the user.

Input:
5
A->C
C<-M
V<-A
C->M
H->M

Output:
Α Ο
C 2
H O
M 2 
V 1

Explanation:
The user A has no followers. So the count is 0.
The user C has 2 followers M and A. So the count is 2.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		TreeMap<Character,Integer> hash = new TreeMap<>();
		for(int i = 0 ; i < N ; i++){
		    String input = sc.nextLine();
		    if(!input.substring(1,3).equals("->")){
		        hash.put(input.charAt(0),hash.getOrDefault(input.charAt(0),0)+1);
		        hash.put(input.charAt(3),hash.getOrDefault(input.charAt(3),0));
		    }else{
		        hash.put(input.charAt(3),hash.getOrDefault(input.charAt(3),0)+1);
		        hash.put(input.charAt(0),hash.getOrDefault(input.charAt(0),0));
		    }
		    
		}
		
		for(char ch : hash.keySet()){
		    System.out.println(ch+" "+hash.get(ch));
		}

	}
}