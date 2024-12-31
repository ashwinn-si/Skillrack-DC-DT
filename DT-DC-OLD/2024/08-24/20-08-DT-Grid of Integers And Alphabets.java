/*The program must accept an integer N as the input. The program must form a grid of size
NxN. Then the program must fill the grid with the integers and alphabets based on the
following conditions.
- The cells in the grid must be filled from the top row to the bottom row, where each row is
filled from left to right
- For the cell in the grid, if X is even then it must be filled with the integer X. Else the cell
must be filled with the lower case alphabet in the English alphabet set If the xth cell it filled
with a vowel, then it must be replaced with the integer X itself.
Finally, the program must print the values in the grid as the output
Nate: The English alphabet set (a to z) is considered in a cyclic fashion for the alphabet.

Input:
3

Output:
1 2 c
4 5 6
g 8 9
*/
 
import java.util.*;
public class Hello {
    public static boolean vowel_checker(char ch){
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=1;
		char curr_char='a';
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(count%2==1 && vowel_checker(curr_char)){
		            System.out.printf("%c ",curr_char);
		        }else{
		            System.out.printf("%d ",count);
		        }
		        count++;
		        curr_char++;
		        if(curr_char>'z'){
		            curr_char='a';
		        }
		    }
		    System.out.println();
		}
	}
}
