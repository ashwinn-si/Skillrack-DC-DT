/*The program must accept two integers M and N as the input, where M represents the number
of buses in a row and N represents the number of days for booking seats on the buses. For
each day, K seats are booked for the buses numbered from X to Y. The values of X, Y and K for
each day are also passed as the input to the program. The program must print the total
number of seats booked on each bus after N days as the output.

Input
5
3
1 2 5
2 3 10
2 5 15

Output:
5 30 25 15 15
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int no_buses=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[no_buses];
		int no_days=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<no_days;i++){
		    int st_no;
		    int end_no;
		    int no_seats;
		    st_no=sc.nextInt();
		    end_no=sc.nextInt();
		    no_seats=sc.nextInt();
		    for(int j=st_no;j<=end_no;j++){
		        arr[j-1]+=no_seats;
		    }
		}
		for (int i=0;i<no_buses;i++){
		    System.out.printf("%d ",arr[i]);
		}

	}
}
