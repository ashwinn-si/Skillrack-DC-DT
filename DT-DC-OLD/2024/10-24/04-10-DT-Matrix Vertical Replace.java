/*The program must accept a character matrix of size RxC and a string S as the input. The
program must find the position P of the first occurrence of the first character of S in the given
matrix. Then the program must replace L characters (where L is equal to the length of S) from
the position P with the characters in S vertically (top to bottom) in the matrix. If it reaches the
last column when traversing vertically, then the program must start replacing the characters
from the first column for the remaining characters. Finally, the program must print the
modified matrix as the output.
Note: The first character of S is always present in the given matrix.

Input:
6 5
S K q J l
P L M b F
F s F J D
i b P b r
s q A n Z
D a A O j
shopping

Output:
S K p J l
P L i b F
F s n J D
s o A n Z
D p A O j
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		char matrix[][]=new char[R][C];
		sc.nextLine();
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix[i][j]=sc.next().charAt(0);
		    }
		}
		sc.nextLine();
		String target=sc.nextLine();
		int target_R=0,target_C=0;
		int index=0;
		for(int i=0;i<R;i++){
		    Boolean flag=false;
		    for(int j=0;j<C;j++){
		        if(matrix[i][j]==target.charAt(0)){
		            target_R=i;
		            target_C=j;
		            flag=true;
		            break;
		        }
		    }
		    if(flag){
		        break;
		    }
		}
		//changing the first col alone
		int curr_r=target_R;
		int curr_c=target_C;
		for(int i=curr_r;i<R && index<target.length();i++){ //!those condition checker
		    matrix[i][curr_c]=target.charAt(index);
		    index++;
		}
		curr_c++;
		//changing the others cols 
		while(index<=target.length()-1){
		    Boolean flag=false;
		    if(curr_c==C){
		        curr_c=0;
		    }
		    for(int i=0;i<R && index<target.length();i++){ //!those condition checker
		        matrix[i][curr_c]=target.charAt(index);
		        index++;
		    }
		    curr_c++;
		}
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        System.out.printf("%c ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
	
}