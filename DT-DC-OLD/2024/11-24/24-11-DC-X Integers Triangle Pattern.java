/* 
The program must accept N integers and an integer X as the input. The program must print the integer
values in X lines based on the tolbmng condition(s).
- The ISt line contains the first integer among the N integers.
The 2nd line contains the next two integers among the N integers.
- The 3rd line contains the next three integers among the N integers.
* Similarty. the remaining lines contajn the integer values.
- The program must cmsider the N integers circulary to the print the output iS X

Input
10
83 79 78 66 63 61 54 46 43 16
13

Output
83
79 78
66 63 61
54 43 16
83 79 78 66 63
61 54 46 43 16 83
79 78 66 63 61 54 46
43 16 83 79 78 66 63 61
54 4643 1683 79 78 66 63
61 5446 43 16 83 79 78 6663
61 544643 16 83 79 78 6663 61
54 46 43 16 83 79 78 66 63 61 54 46
43 16 83 79 78 66 63 61 54 46 43 16 83
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
		int L = sc.nextInt();
		int index = 0;
		for(int i = 0 ; i < L ; i++){
		    for(int j =0 ; j <= i ; j++){
		        System.out.printf("%d ",arr[index]);
		        index = (index+1)%N;
		    }
		    System.out.println();
		}

	}
}