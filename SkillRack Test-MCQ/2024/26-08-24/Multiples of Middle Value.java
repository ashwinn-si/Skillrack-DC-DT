/*The program must accept three distinct positive integers A, B and C. The program must print
the multiples of the middle value which are between the smallest and the largest value
(inclusive).

Input:
5 55 10

Output:
10 20 30 50
*/

import java.util.*;
public class Hello {
    public static void printer(int st,int end,int middle){
        for(int i=st;i<=end;i++){
            if(i%middle==0){
                System.out.printf("%d ",i);
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){ //a is the biggest
		    if(b<c){ // b is the samllest
		        printer(b,a,c);
		    }else{ // c is the smallest
		        printer(c,a,b);
		    }
		}else if(b>c){// b is the biggest
		    if(a<c){ //a is the smallest
		        printer(a,b,c);
		    }else{//c is the smallest
		        printer(c,b,a);
		    }
		}else{ // c is the biggest
		    if(a<b){//a is the smallest
		        printer(a,c,b);
		    }else{ //b is the smallest
		        printer(b,c,a);
		    }
		}

	}
} 
