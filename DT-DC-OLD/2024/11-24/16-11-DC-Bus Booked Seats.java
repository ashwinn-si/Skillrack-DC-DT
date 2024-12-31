/*
The program must accept three integer values N, X and Y as the input where N represents the total number of seats in a bus, X represents the number of seats in each row and Y represents the total number of seats booked. The booked seat numbers are also passed as the input to the program. The program must print the number of seats booked in each row as the output. If all the seats are booked then the program must print the string value FULL as the output.
The seating arrangement of the bus is given below.
1st row contains 1, 2, 3, ... X.
2nd row contains X+1, X+2, X+3, ... 2X.
3rd row contains 2X+1, 2X+2, 2X+3, ... 3X.
Similarly, the remaining seats are numbered in the remaining rows.
Note: The value of N is always a multiple of X.
Input:
20 5 8
13 7 5 6 10 9 17 12
Output:
1
4
2
1
Explanation:
The total number of seats in a bus is 20 and the number of seats in each row is 5.
So the total number of rows in the bus is 4 (20/5).
The booked seat numbers are 13, 7, 5, 6, 10, 9, 17 and 12.
In the 1st row, the seat number 5 is booked. So 1 is printed.
In the 2nd row, the seat numbers 6, 7, 9 and 10 are booked. So 4 is printed.
In the 3rd row, the seat numbers 12 and 13 are booked. So 2 is printed.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.nextLine();
		if(N==Y){
		    System.out.print("FULL");
		    return;
		}
		int arr[] = new int[(int)(N/X)];
		for(int i = 0 ; i < Y ; i++){
		    int curr = sc.nextInt()-1;
		    arr[(curr/X)]++;
		}
		for(int i : arr){
		    System.out.println(i);
		}
		
	}
}