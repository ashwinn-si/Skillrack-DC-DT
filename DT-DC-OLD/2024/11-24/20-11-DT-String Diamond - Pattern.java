/*
The program must accept an odd integer value N as the input. The program must form a
string S by concatenating the first (N + 1) upper case alphabets and the reverse of the first N
upper case alphabets. Then the program must print the string (N * 2) + I times (in separate
lines) based on the following conditions.
- In the ISt line, the string S is printed as it is.
- In the 2nd line, the middle alphabet in S is replaced with the hash symbol (#).
- In the 3rd line, the middle 3 alphabets in S are replaced with the hash symbols (#).
- In the 4th line, the middle 5 alphabets in S are replaced with the hash symbols (#).
- Similarly, the first (N + 1) lines are printed.
- The remaining N lines represent the water image of the first N lines.
Boundary Condition(s):
3 25
Input Format:
The first line contains N,
Output Format:
The (N * 2) + 1 lines, each contains the string S based on the given conditions.

Input:
5

Ouput:
ABCDEFEDCBA
ABCDE#EDCBA
ABCD###DCBA
ABC#####CBA
AB#######BA
A#########A
AB#######BA
ABC#####CBA
ABCD###DCBA
ABCDE#EDCBA
ABCDEFEDCBA
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		String S = "";
		//preparing the string
		for(int i = 0 ; i < N+1 ; i++){
		    S+=(char)('A'+i);
		}
		for(int i = 0 ; i < N ; i++){
		    S+=(char)('A'-i+N-1);
		}
		
		int stPointer = N;
		int endPointer = N;
		System.out.println(S);
        for(int r = 0 ;r <N*2-1;r++){
            System.out.printf("%s",S.substring(0,stPointer));
            for(int i = stPointer ; i <= endPointer ; i++){
                System.out.printf("#");
            }
            System.out.printf("%s",S.substring(endPointer+1,S.length()));
            System.out.println();
            if(r<N-1){
                stPointer--;
                endPointer++;
            }else{
                stPointer++;
                endPointer--;
            }
        }
        System.out.println(S);
	}
}