/*
The must accept N integers and an integer X as the input The prograrn must print
largest two integers (ascending order) in each window of size K among the N integers as
output

Input:
6
54 8 100 6 200 80
3

Output:
54 100
8 100
100 200
80 200
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
      int N = sc.nextInt();
      int arr[] = new int[N];
      for(int i  = 0 ; i < N ; i++){
        arr[i] = sc.nextInt();
      }
      int K = sc.nextInt();
      //initially adding elements to the set 
      for(int i = 0 ; i < K ;i++){
        pq.offer(arr[i]);
      }
      int removingElement1 = -1;
      int removingElement2 = -1;
      for(int i = 0 ; i < N-K+1 ; i++){
        //removing the first two elements and adding them again to the set
        removingElement1 = pq.poll();
        removingElement2 = pq.poll();
        System.out.println(removingElement2+" "+removingElement1);
        pq.offer(removingElement1);
        pq.offer(removingElement2);
        //sliding window
        if(i < N-K){
          pq.remove(arr[i]);
          pq.offer(arr[i+K]);
        }
      }
  }
}
