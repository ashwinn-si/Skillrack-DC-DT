/*You are given N students going on a trip and M vehicles, each with a specified seating capacity. The goal is to find the number of ways to allocate students to the vehicles such that all chosen vehicles are completely filled.

Input Format:
An integer M representing the number of vehicles.
An array of M integers where each element represents the capacity of a vehicle.
An integer N representing the total number of students.

Input:
5	
5 10 2 3 5
10

Ouput: 
4
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int buses[] = new int[N];
      for(int i= 0 ;i < N ; i++){
        buses[i] = sc.nextInt();
      }
      int target = sc.nextInt(), count = 0;
      for(int i = 0 ; i < (1<< N) ; i++){
        int currTotal = 0;
        for(int shift = 0 ; shift < N ;shift++){
          if((i & (1 << shift)) != 0){
            currTotal += buses[shift];
          }
        }
        if(currTotal == target){
          count++;
        }
      }
      System.out.print(count);
  }
}