/*The program must accept a character matrix of size RxC and the position of a cell (X. Y) as the input The program must form four string taues based on the following conditions.
- The Sl must be formed by traversing the cells from the given cell diagonany in the top-left direction.
- The S2 must be formed by traversing the cells from the given cell diagonany in the diredon.
- The S3 must be formed by traversing the cells from the given cell diagonany in the bottom-ri*it direction.
- The S4 must be formed by traversing the cells from the given cell diagonany in the bottom-left dredon-
Finally. the must p&lt the longest among the four string values as the output If two or string vakJes have the sx-ne maximum length the program must put the first
string as the

Input
6 8
D y j w h r y t
s a r A v g t y
I E b v m B y F
F p z w E j n s
m f p D j d r y
D v w r s e m D

Output
Evry
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R,C;
		R=sc.nextInt();
	    C=sc.nextInt();
	    char matrix[][]=new char[R][C];
	    for(int i=0;i<R;i++){
	        for(int j=0;j<C;j++){
	            matrix[i][j]=sc.next().charAt(0);
	        }
	    }
	    int target_R,target_C;
	    target_R=sc.nextInt()-1;
	    target_C=sc.nextInt()-1;
	    String s1="";
	    String s2="";
	    String s3="";
	    String s4="";
	    int dummy_i=target_R;
	    int dummy_j=target_C;
	    while(dummy_i>=0 && dummy_i<R && dummy_j>=0 && dummy_j<C){
	        s1+=matrix[dummy_i][dummy_j];
	        dummy_i--;
	        dummy_j--;
	    }
	    dummy_i=target_R;dummy_j=target_C;
	    while(dummy_i>=0 && dummy_i<R && dummy_j>=0 && dummy_j<C){
	        s2+=matrix[dummy_i][dummy_j];
	        dummy_i--;
	        dummy_j++;
	    }
	    dummy_i=target_R;dummy_j=target_C;
	    while(dummy_i>=0 && dummy_i<R && dummy_j>=0 && dummy_j<C){
	        s3+=matrix[dummy_i][dummy_j];
	        dummy_i++;
	        dummy_j++;
	    }
	    dummy_i=target_R;dummy_j=target_C;
	    while(dummy_i>=0 && dummy_i<R && dummy_j>=0 && dummy_j<C){
	        s4+=matrix[dummy_i][dummy_j];
	        dummy_i++;
	        dummy_j--;
	    }
	    if(s1.length() >= s2.length() && s1.length() >= s3.length() && s1.length()>=s4.length()){
	        System.out.print(s1);
	    }else if(s2.length() >= s3.length() && s2.length() >= s4.length()){
	        System.out.print(s2);
	    }else if(s3.length() >= s4.length()){
	        System.out.print(s3);
	    }else{
	        System.out.print(s4);
	    }
	  
	}
}