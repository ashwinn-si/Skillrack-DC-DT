/*The program must accept two integers X and Y as the input. The program must print the
integers from Y to X which are having the digits in strictly decreasing order by 1. If there is no
such integer, the program must print -l as the output.

Input:
100 5000

Output:
4321 3210 987 876 765 654 543 432 321 210

Explanation:
The integers from 5000 to 100 which are having the digits in strictly decreasing order by I are
given below.
4321 3210 987 876 765 654 543 432 321 210
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        Long allPossible[]={9L,98L,987L,9876L,98765L,987654L,9876543L,98765432L,987654321L,9876543210L,8L,87L,876L,8765L,87654L,876543L,8765432L,87654321L,876543210L,7L,76L,765L,7654L,76543L,765432L,7654321L,76543210L,6L,65L,654L,6543L,65432L,654321L,6543210L,5L,54L,543L,5432L,54321L,543210L,4L,43L,432L,4321L,43210L,3L,32L,321L,3210L,2L,21L,210L,1L,10L};

        Arrays.sort(allPossible);

        Long X,Y;
        
        X=sc.nextLong();

        Y=sc.nextLong();
        
        boolean flag=false;
        
        for(int i=allPossible.length-1;i>=0;i--){
            Long num=allPossible[i];
            if(num>=X && num<=Y && num>=10){
                flag=true;
                System.out.printf("%d ",num);
            }
            if(num<=X){
                break;
            }
        }

        if(!flag){
            System.out.printf("-1");
        }

	}
}