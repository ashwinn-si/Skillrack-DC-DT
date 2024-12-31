/*
The program must accept the binary representation of an integer N as the input. The program
must print Yes if N can be converted to a multiple of S by toggling exactly one bit in its binary
representation Else ttk program must print No as the output

Input:
1101

Explanation:
The given binary representation is 1101.
The decimal equivalent of 1101 is N 13.
An possible binary representations Of 13 by toggling exactly bit are given below.
0101 -5
1001 - 9
1111 - 15
1100 - 12
The integers 5 and 15 are the multiples Of 5-
So Yes is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		char binary[]=sc.nextLine().toCharArray();
		
		for(int i=0;i<binary.length;i++){
		    
		    char origi=binary[i]=='0'?'0':'1';
		    
		    binary[i]=origi=='0'?'1':'0';
		    
		    if(Integer.valueOf(new String(binary),2)%5==0){
		        System.out.print("Yes");
		        return;
		    }
		    
		    binary[i]=origi;
		    
		}
		System.out.printf("No");

	}
}