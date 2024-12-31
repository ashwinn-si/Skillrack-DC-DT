/*The program must accept an integer Y representing a year as the input. The program must
print the last date of each month in the year Y as the output. The format of each date must be
DD-MMM-YYYY.
Note: The value of MMM will be from Jan, Feb, Mar, Apr,... till Dec.

Input:
2010

Output:
31-Jan-2010
28-Feb-2010
31-Mar-2010
30-Apr-2010
31-May-2010
30-Jun-2010
31 Jul-2010
31-Aug-2010
30-Sep-2010
31-Oct-2010
30-Nov-2010
31-Dec-2010
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		int febDays =(Y % 4 ==0 && Y % 100 != 0 || Y % 400 == 0)?29:28;
		String mon[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		boolean flag = true;
		for(int i = 0 ; i < 12 ; i++){
		    if(i == 1){
		        System.out.printf("%d-%s-%d\n",febDays,mon[i],Y);
		    }else{
		        if(flag){
		            System.out.printf("31-%s-%d\n",mon[i],Y);
		        }else{
		            System.out.printf("30-%s-%d\n",mon[i],Y);
		        }
		    }
		    flag=(flag)?false:true;
		    if(i==6){
		        flag=true;
		    }
		}

	}
}