/*The program must accept N string values containing only alphabets as the input. The program
must sort the given string values in descending order based on the number of upper case
alphabets, If two or more string values have the same number of upper case alphabets, then
the program must sort those string values in the order of their occurrence. Finally, the program
must print the N sorted string values as the output.

Input:
3
Apple
BaSkeT
sKaTeBoArD

Output:
sKaTeBoArD
BaSkeT
Apple
*/

import java.util.*;
public class Hello {
    public static int count_upper(String ch){
        int count=0;
        for(int i=0;i<ch.length();i++){
            if(Character.isUpperCase(ch.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		List <String> result = new ArrayList<>();
		for(int i=0;i<N;i++){
		    String curr=sc.nextLine();
		    result.add(curr);
		}
		Collections.sort(result,(a,b)->count_upper(b)-count_upper(a));
		
		for(String str:result){
		    System.out.println(str);
		}
	}
}
