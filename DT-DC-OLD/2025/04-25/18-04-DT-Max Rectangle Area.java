/*
The program must accept the length L and breadth B of a land as the input. The L*B land is divided into smaller areas
using the H horizontal cuts and V vertical cuts. The program accepts H integers representing the distances at which
the horizontal cuts present on the land from the top. Similarly, the program accepts V integers representing the
distances at which the vertical cuts present on the land from the left. The program must print the area of the largest
rectanglular land after dividing the L*B land based on the given horizontal cuts and vertical cuts.

Input:
10 15
3
3 7 9
2
5 11

Output:
24
*/

import java.util.*;
public class Hello {
    
    static ArrayList<Integer> helper(int noCuts, int st, int end,Scanner sc){
        int prevCut = st;
        int resultCut = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0 ; i < noCuts; i++){
            pq.offer(sc.nextInt());
        }
        for(int i = 0 ; i < noCuts; i++){
            int currCut = pq.poll();
            arr.add(currCut - prevCut);
            prevCut = currCut;
        }
        arr.add(end - prevCut);
        return arr;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int B = sc.nextInt();
		int noHoriCut = sc.nextInt();
		ArrayList<Integer> horizontal = helper(noHoriCut, 0, L, sc);
		int noVerCut = sc.nextInt();
		ArrayList<Integer> vertical = helper(noVerCut, 0, B, sc);
		int hLen = horizontal.size();
		int vLen = vertical.size();
		int result = 0;
		for(int i = 0 ; i < hLen ; i++){
		    for(int j = 0 ; j < vLen ; j++){
		        result = Math.max(result, horizontal.get(i) * vertical.get(j));
		    }
		}
		System.out.print(result);
	}
}