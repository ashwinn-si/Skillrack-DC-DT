/*In a spin game, the integers from 0 to 99 are arranged sequentially on the border of a wheel in a clockwise direction. Initially, the top position of the wheel points to the integer 
𝐾 .A boy spins the wheel n times. For each spin, X integers move past the top position of the wheel: A positive value of 𝑋 indicates a clockwise spin.A negative value of X indicates a counterclockwise spin.
The program must:
Accept the initial integer 𝐾
K at the top position of the wheel.
Accept the number of spins 𝑁
Accept N integers representing the movement values X for each spin.
The program should then print the integer at the top position of the wheel after each spin.

Input : 
4
5 -4 -3 6
0
Output
95 99 2 96
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		for(int i : arr){
		    K = (K-i)%100;
		    if(K < 0){
		        K+=100;
		    }
		    System.out.printf("%d ",K);
		}

	}
}