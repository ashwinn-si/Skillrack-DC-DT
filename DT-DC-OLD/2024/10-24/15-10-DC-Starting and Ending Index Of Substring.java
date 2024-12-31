/*The program must accept a string S and N string values as the input. For each string X
among the given N string values, the program must print the starting and the ending indices
of the first occurence of X in S if it is present. Else the program must print -I as the output.

Input:
theskillrackonlinecodingplatform
4
skill
code
in
eskill

Output:
3 7
-1
15 16
2 7
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String S=sc.nextLine();
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0;i<N;i++){
		    
		    String curr=sc.nextLine();
		    
		    int index=S.indexOf(curr);
		    
		    if(index==-1){
		        System.out.println("-1");
		    }else{
		        System.out.printf("%d %d\n",index,index+curr.length()-1);
		    }
		}

	}
}
