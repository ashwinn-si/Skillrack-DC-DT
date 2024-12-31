/*A magic candle will always glow, but if someone drops a drop of water on the candle it will not
light up for the next X seconds and then it will start to light up again. The program must accept
N sorted integers representing the time series in which the water drops on the candle and the
value of X as the input. The program must print the total time that the candle is not in the
glowing state as the output. If a drop of water dropped on the candle when it is not in the
glowing state, then the candle will start to light up after X seconds (i.e., the candle will not
consider the previous drop of water).

Input:
4
161011
2

Output:
7

Explanation:
Here X = 2
— O, the candle is glowing.
Att— 1, the candle is NOT glowing because a drop of water drops on the candle.
At t—2, the candle is NOT glowing.
At t — 3, the candle is glowing (2 seconds over).
At t — 4, the candle is glowing.
= 5, the candle is glowing.
At t -  6, the candle is NOT glowing as a drop of water drops on the candle.
At t - 7, the candle is NOT glowing.
At t - 8, the candle is glowing (2 seconds over).
Att- 9, the candle is glowing.
At t - 10, the candle is NOT glowing because a drop of water drops on the candle.
At t - 11, the candle is NOT glowing because a drop of water drops on the candle.
At t - 12, the candle is NOT glowing.
At t - 13, the candle is glowing (2 seconds over).
At t — 14, the candle is glowing and so on.
The total time that the candle is not in glowing state is 7. So 7 is printed as the output
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int total_drops=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[total_drops];
		for(int i=0;i<total_drops;i++){
		    arr[i]=sc.nextInt();
		}
		sc.nextLine();
		int not_glow_time=sc.nextInt();
		int curr_time=0;
		int result_time=0;
		int remove_time=-1;
		int curr_index=0;
		while(true){
		    if(curr_index==total_drops && remove_time==0){
		        break;
		    }
		    if(curr_index!=total_drops && curr_time==arr[curr_index]){
		        remove_time=not_glow_time;
		        curr_index++;
		    }
		    if(remove_time>0){
		        remove_time--;
		        result_time++;
		    }
		    curr_time++;
		}
		System.out.printf("%d",result_time);
	}
}