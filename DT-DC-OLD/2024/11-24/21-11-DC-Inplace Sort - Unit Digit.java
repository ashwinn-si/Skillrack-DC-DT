/* 
The program must accept N integers as the input The program must sort the integers having the same unit
digit among N integers In their positions. Then the program must print N sorted integers as the output.

Input:
12
32 78 4265 35 95 15 76 46 66

Output:
32 78 15 42 62 35 65 95 95 46 66 76

The integers 32.62 and 42 have the same unit digit 2. So they are sorted in ascending order in their
positions.
The integer 78 remains in the same positi(Y1 as there is only one integer w•ith the unit digit 8.
The integers 95, 65, 35, 95 and 15 have the same unit digit 5- So they are sorted in ascending order their
positions,
The integers 76, 46 and 66 have the sarne unit digit 6. So they are sorted in ascending order in their
positions.
Hence the output is
32 78 15 42 62 35 65 95 95 46 66 76
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		HashMap <Integer,PriorityQueue<Integer>> hash = new HashMap<>();
		int N = sc.nextInt();
		int arr[] = new int[N];
		sc.nextLine();
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i : arr){
		    PriorityQueue<Integer> pq = hash.getOrDefault(i%10, new PriorityQueue<Integer>());
		    pq.offer(i);
		    hash.put(i%10,pq);
		}
		for(int i : arr){
		    PriorityQueue<Integer> pq = hash.get(i%10);
		    System.out.printf("%d ",pq.poll());
		    hash.put(i%10,pq);
		}
	}
}