/* 
There are N ice-cubes placed in a conveyor belt. Every second, the following Changes occur in the
conveyor belt.
- The ice-cube at the last position of the conveyor belt is taken out.
- The conveyor belt moves one position to the right side.
* The weight of each ice-cube on the conveyor belt is reduced by 1.
The program must accept N integers representing the weights ot the N ice-cubes on the conveyor belt as
the input. The program must print the weights of the ice-cubes in conveyor belt every second until there
is no ice-cube in the conveyor belt If an ice-cube is completely melted (i.e., the væight of the ice-cube
becomes O). then it must not be printed in the output.

Input:
5
6 2 4 7 2

Output
6 2 4 7 2
5 1 3 6
4 2
3
2

Exglanation:
Here N = S.
The of the S ice-cubes are 6, 2, 4.7 and 2.
The of the ice-cubes in the conveyor belt every second are printed.
At T -0 062472
At T-1->5136
At T = 5 No ice-cubes in the conveyor belt.

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        sc.nextLine();
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int endIndex = N;
        while(endIndex >= 0){
            boolean flag = false;
            for(int i = 0 ; i < endIndex ; i++){
                if(arr[i] > 0){
                    flag = true;
                    System.out.printf("%d ",arr[i]);
                }
                arr[i]--;
            }
            if(endIndex != 0 && flag){
                System.out.printf("\n");
            }
            endIndex--;
        }
	}
}