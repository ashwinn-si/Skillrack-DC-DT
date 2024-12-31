/*A new medicine for covid-19 is under testing on humans, The medicine must be tested on
humans for N days continuously. After taking the medicine on each day, it may increase or
decrease X health points of the person. The program must accept N integers representing the
changes in the health points of the person in N days. The program must print the minimum
health points that a person must have initially so that there is no negative health points
(including O) when testing the medicine for N days.

Input:
5
-2 3 4 1 -5

Output:
8

Explanation:
If the person has 8 health points initially,
ISt day -> The person's health is decreased by 2 points. Now the person has 6 health points.
2 day -Y The person's health is increased by 3 points. Now the person has 9 health points.
3rd day -Y The person's health is decreased by 4 points. Now the person has 5 health points.
4th day -> The person's health is increased by 1 point. Now the person has 6 health points.
5th day -> The person's health is decreased by 5 points. Now the person has 1 health point.
There is no negative health points (including O) when testing the medicine for 5 days.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
        int values[]=value_getter(N,sc);
        
        int result_value=1;
        
        while(true){
            int curr_value=result_value;
            boolean flag=true;
            for(int i=0;i<values.length;i++){
                curr_value+=values[i];
                if(curr_value<=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.printf("%d",result_value);
                return;
            }
            result_value++;
        }
    }
        
	static int[] value_getter(int N,Scanner sc){
	    
	    int arr[]=new int[N];
	    
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    return arr;
	}
}