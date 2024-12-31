/*The program must accept N integers as the input. For each integer X among the N integers,
the program must print the output based on the following conditions.
- If X is odd, the program must print the sum of X and the odd digits in the remaining integers.
- If X is even, the program must print the sum of X and the even digits in the remaining
integers.

Input:
4
32 25 16 71

Output:
40 37 20 80

Explanation:
The 4 integers are 32 25 16 71.
The first integer 32 is an even integer, so the sum is 40 (32 + 2 + 6).
The second integer 25 is an odd integer, so the sum is 37 (25 + 3 + 1 + 7 + 1).
The third integer 16 is an even integer, so the sum is 20 (16 + 2 + 2).
The fourth integer 71 is an odd integer, so the sum is 80 (71 + 3 + 5 + 1).
*/

import java.util.*;
public class Hello {
    static int N;
    static List<Integer> numbers=new ArrayList<>();
    public static int sum_digit(boolean key,int num,int sum,int index){
        //key-> true = even | key -> false = odd
        
            for(int i=0;i<N;i++){
                if(i==index){
                    continue;
                }
                int curr_num=numbers.get(i);
                do{
                    if(curr_num %10%2==0 && key){
                        sum+=curr_num%10;
                    }else if(curr_num%10%2==1 && !key){
                        sum+=curr_num%10;
                    }
                    curr_num=(int)curr_num/10;
                }while(curr_num>0);
            }
        return sum;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		sc.nextLine();
	    for(int i=0;i<N;i++){
	        numbers.add(sc.nextInt());
	    }
        for(int i=0;i<N;i++){
            if(numbers.get(i)%2==0){
                System.out.printf("%d ",sum_digit(true,numbers.get(i),numbers.get(i),i));
            }else{
                System.out.printf("%d ",sum_digit(false,numbers.get(i),numbers.get(i),i));
            }
        }
	}
}
