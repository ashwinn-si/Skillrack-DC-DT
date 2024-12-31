/*The program must accept N integers and a string S as the input. For each integer X among
the N integers, the program must replace the first X alphabets in the string S with their next
alphabet in the English alphabet set. Finally, the program must print the modified string S as
the output.
Note: The English alphabet set is considered in a cyclic fashion for the next alphabet of a given
alphabet.

Input:
4
2135
abcde

Output:
eeeef
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String arr[]=sc.nextLine().split(" ");
		char letters[]=sc.nextLine().toCharArray();
		for(int i=0;i<N;i++){
		    for(int j=0;j<Integer.parseInt(arr[i]);j++){
		        if(letters[j]=='z'){
		            letters[j]='a';
		        }else if(letters[j]=='Z'){
		            letters[j]='A';
		        }
		        else{
		            letters[j]++;
		        }
		    }
		}
		for(char ch:letters){
		    System.out.printf("%c",ch);
		}

	}
}