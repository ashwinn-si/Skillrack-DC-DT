/*
The program must accept N integers as the input.
The program must swap every two positive
integers and every two negative integers among
the N integers. If the number of positive or
negative integers is odd. then the last occurring
positive or negative integer remains the same in its
position. Finally. the program must print the N
revised integers as the output.
Each integer value is always non-zero.

Input:
6
93 91 -80 68 -39 24

Output:
91 93 -39 24 -80 68
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      sc.nextLine();
      int arr[] = new int[N];
      ArrayList<Integer> posPos = new ArrayList<>();
      ArrayList<Integer> negPos = new ArrayList<>();
      for(int i = 0 ;i < N ; i++){
        arr[i] = sc.nextInt();
        if(arr[i] > 0){
          posPos.add(i);
        }else{
          negPos.add(i);
        }
      }
      for(int i = 0 ; i < posPos.size() ; i+=2){
        if(i+1 < posPos.size()){
          int temp = arr[posPos.get(i)];
          arr[posPos.get(i)] = arr[posPos.get(i+1)];
          arr[posPos.get(i+1)] = temp;
        }
      }
      for(int i = 0 ; i < negPos.size() ; i+=2){
        if(i+1 < negPos.size()){
          int temp = arr[negPos.get(i)];
          arr[negPos.get(i)] = arr[negPos.get(i+1)];
          arr[negPos.get(i+1)] = temp;
        }
      }
      for(int i = 0 ; i < N ; i++){
        System.out.printf("%d ",arr[i]);
      }
  }
  
}