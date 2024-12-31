/*
There are N students in a class. The class teacher wants to conduct a technical event in which the winner of the event will receive an additional X marks. The program must accept the marks of the N students as the input. For each student among the N students, the program must print 1 if that student wins the event and gets the highest score in the class. Else the program must print 0 for that student.

Input:
5
32615
4

Output:
1 1 1 0 1

Explanation:
Here N = 5 and X = 4.
If the 1st student wins, the total score of the 1st student becomes 7 (3+4) which is the highest score in the class. So 1 is printed.
If the 2nd student wins, the total score of the 2nd student becomes 6 (2+4) which is the highest score in the class. So 1 is printed.
If the 3rd student wins, the total score of the 3rd student becomes 10 (6+4) which is the highest score in the class. So 1 is printed.
If the 4th student wins, the total score of the 4th student becomes 5 (1+4) which is NOT the highest score in the class. So 0 is printed.
If the 5th student wins, the total score of the 5th student becomes 9 (5+4) which is the highest score in the
class. So 1 is printed.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int arr[] = new int[N];
		sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		    if(max < arr[i]) {
		        max = arr[i];
		    }
		}
		int add = sc.nextInt();
		for(int i : arr){
		    if(i+add >= max){
		        System.out.printf("1 ");
		    }else{
		        System.out.printf("0 ");
		    }
		}

	}
}