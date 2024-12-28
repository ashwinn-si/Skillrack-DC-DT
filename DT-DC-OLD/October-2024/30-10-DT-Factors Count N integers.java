'''The program must accept N integers as the input. The program must find all the factors of the
N integers, The program must print the distinct factors along with the number of occurrences.
The number of occurrences of each factor must be enclosed within the parentheses. The
factors must be printed in descending order based on the number of occurrences. If two or
more factors have occurred the same number of times, then the program must sort those
factors in ascending order.

Input:
5
6 9 12 8 17

Output:
1(5) 2(3) 3(3) 4(2) 6(2) 8(1) 9(1) 12(1) 17(1)

Explanation:
The factors of 6 is I, 2, 3 and 6.
The factors of 9 is I, 3 and 9.
The factors of 12 is 1, 2, 3, 4, 6, 12.
The factors of 8 is 1, 2, 4 and 8.
The factors of 17 is l, 17.
The factor 1 occurs 5 times.
The factor 2 occurs 3 times.
The factor 3 occurs 3 times.
The factor 4 occurs 2 times.
The factor 6 occurs 2 times.
The factor 8 occurs once.
The factor 9 occurs once.
The factor 12 occurs once.
The factor 17 occurs once.
After sorting the factors based on the given conditions, the factors are
1(5) 2(3) 3(3) 4(2) 6(2) 8(1) 9(1) 12(1) 17(1)
'''

import java.util.*;
public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap <Integer,Integer> hash = new TreeMap<>();
        for(int i = 0 ; i < N ; i++){
            int currNum = sc.nextInt();
            for(int num = 1 ; num < (int)(Math.pow(currNum,0.5)+1) ; num++){
                if(currNum % num == 0){
                    hash.put(num , hash.getOrDefault(num, 0)+1);
                    //if 3 is a divisor of 12 then now we are checking if 4 is too a divisor
                    if(num != (int)(currNum/num)){
                        hash.put((int)(currNum/num) , hash.getOrDefault((int)(currNum/num), 0)+1);
                    }
                }
            }
        }
        for(int i : hash.keySet()){
          System.out.printf("%d(%d) ",i,hash.get(i));
        }
    }
}