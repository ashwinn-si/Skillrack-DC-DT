
/*
The program must accept two matrices MI and M2 of the same size R*C as the input. MI represents an
integer matrix and M2 represents a character matrix. For each occurrence of a vowel in M2, the program
must swap the values between the two matrices in the same position. Finally, the program must print the
modified two matrices as the output.

Input:
3 4
10 20 30 40
50 60 70 80
90 91 92 93
a b c d
e f P Q
R S T U

Output:
a 20 30 40
e 60 70 80
90 91 92 U
10 b cd
50 f PQ
R S T 93
 */

import java.util.*;
public class Hello {
    static void inputGetter(int R, int C, String matrix[][], Scanner sc){
        for(int i =0 ; i < R ;i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.next().strip();
            }
        }
    }
    
    static void printer(int flag, String numMatrix[][], String charMatrix[][], int R, int C){
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                char ch = Character.toLowerCase(charMatrix[i][j].charAt(0));
                boolean swapFlag = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
                if(flag == 1){//print numMatrix;
                    if(swapFlag){
                        System.out.print(charMatrix[i][j] + " ");
                    }else{
                        System.out.print(numMatrix[i][j]+ " ");
                    }
                }else{
                    if(swapFlag){
                        System.out.print(numMatrix[i][j]+" ");
                    }else{
                        System.out.print(alphaMatrix[i][j]+ " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String numMatrix[][] = new String[R][C];
		String alphaMatrix[][] = new String[R][C];
		inputGetter(R, C, numMatrix, sc);
		inputGetter(R, C, alphaMatrix, sc);
        
        printer(1, numMatrix, alphaMatrix, R, C);
        printer(2, numMatrix, alphaMatrix, R, C);
	}
}