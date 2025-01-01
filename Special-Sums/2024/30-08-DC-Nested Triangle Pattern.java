/*The program must accept an integer N as the input. The program must print a triangle based
on the following conditions.
- The triangle contains (N+1)/2 layers.
- The outermost layer contains the character H, the second outermost layer contains the
character O, Similarly, the remaining layers contain the characters H and O alternatively.
- Hash symbols (#) are printed in front of the first N-1 rows of the triangle to make the triangle
more clear.

Input
6

Output

#####H
####HOH
###HOHOH
##HOHHHOH
#HOOOOOOOH
HHHHHHHHHHH
*/
//LAYER ACCESSING MARII

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	    char matrix[][]=new char[N][(N*2)-1];
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N-i-1;j++){
	            matrix[i][j]='#';
	        }
	    }
	    int pointer_1=N-1;
	    int pointer_2=N-1;
	    int no_layers=(int)(N+1)/2;
	    int row=0;
	    int count=N;
	    for(int curr_layer=0;curr_layer<no_layers;curr_layer++){
	       row=curr_layer;
	       int track=0;
	       char ch;
	       if(curr_layer%2==0){
	           ch='H';
	       }else{
	           ch='O';
	       }
	       while(track<count){
	           matrix[row][pointer_1]=ch;
	           matrix[row][pointer_2]=ch;
	           pointer_1-=1;
	           pointer_2+=1;
	           track++;
	           row++;
	       }
	       for(int i=pointer_1+1;i<pointer_2-1;i++){
	           matrix[N-curr_layer-1][i]=ch;
	       }
	       count-=2;
	       pointer_1=N-1;
	       pointer_2=N-1;
	    }
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N*2-1;j++){
	            if(matrix[i][j]!=0){
	                System.out.printf("%c",matrix[i][j]);
	            }
	        }
	        System.out.println();
	    }
		
	}
}
