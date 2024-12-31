/*The program must accept N integers as the input. The program must form pairs of integers (X,
Y) using the given N integers based on the following condition.
- The number of Is in the binary representation of X and Y must be equal.
Then the program must print the number of pairs P formed as the output.

Input:
5
1 2 3 4 5

Output
4

Explanation:
All pairs formed using the 5 integers are given below.
(1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5) and (4, 5).
The pairs which are having an equal number of Is in their binary representations are given
below.
(1, 2), (1, 4), (2, 4) and (3, 5).
So the count 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		sc.nextLine();
		int result=0;
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		    String binary_str=Integer.toBinaryString(arr[i]);
		    int count=0;
		    for(int j=0;j<binary_str.length();j++){
		        if(binary_str.charAt(j)=='1'){
		            count++;
		        }
		    }
		    hash.put(arr[i],count);
		}
		for(int i=0;i<N;i++){
		    for(int j=i+1;j<N;j++){
		        if(hash.get(arr[i])==hash.get(arr[j])){
		            result++;
		        }
		    }
		}
		System.out.print(result);
	}
}