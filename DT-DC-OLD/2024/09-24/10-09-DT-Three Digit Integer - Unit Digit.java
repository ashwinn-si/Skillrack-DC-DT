/*The program must accept N integers as the input. For every three integers among the given N
integers, the program must print the largest possible three-digit integer using their unit digits.
If it is not possible to form a three-digit integer, then the program must print -1 as the output.
Note: The value of N is always a multiple of 3.

Input:
6
988 54 19 87 64 25

Output:
984 754

Explanation:
The largest three-digit integer formed using the unit digits of 988 54 19 is 984.
The largest three-digit integer formed using the unit digits of 87 64 25 is 754.
Hence the output is
984 754
*/

import java.util.*;
public class Hello {
    public static int number_maker(int a,int b,int c){
        return ((((a*10)+b)*10)+c);
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=0,b=0,c=0;
        for(int i=1;i<=N;i++){
            if(i%3==1){
                a=sc.nextInt()%10;
            }else if(i%3==2){
                b=sc.nextInt()%10;
            }else{
                c=sc.nextInt()%10;
                int res=-1;
                if(a>b && a>c){ //a is largest
                    if(b>c){ // a is largest | b- second
                        res=number_maker(a,b,c);
                    }else{ // a is largest | c - second
                        res=number_maker(a,c,b);
                    }
                }else if(b>c){ //b is the largest
                    if(a>c){ // a is the second largest
                        res=number_maker(b,a,c);
                    }else{ // c is the second largest
                        res=number_maker(b,c,a);
                    }
                }else{ // c is the largest
                    if(a>b){ // a is the second largest
                        res=number_maker(c,a,b);
                    }else{ // b is the second largest
                        res=number_maker(c,b,a);
                    }
                }
                System.out.printf("%d ",(res!=0)?res:-1);
            }
        }
        
	}
}