/*
The program must accept N integer values as the input. The program must print the input
sequence till an integer value atil (where i is from O to N-1) is repeated it's value times as the

Input:
10
2 3 4 5 3 3 5 4 2 4

Output:
2 3 4 5 3 3

Explnation:
The Ineteger,2 3 4 5 3 3 5 4 2 4
When we traverse till 2 3 4 5 3 3. the value 3 has occurred three times So the stops
further.
Hence the output is
2 3 4 5 3 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer,Integer> hash = new HashMap<>();
		for(int i = 0 ; i < N ; i++){
		    int n = sc.nextInt();
		    hash.put(n,hash.getOrDefault(n,0)+1);
		    System.out.printf("%d ",n);
		    if(hash.get(n)==n){
		        return;
		    }
		}

	}
}