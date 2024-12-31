/*The program must accept N digits as the input. The program must print the digit with the
maximum frequency among the N digits as the output. If two or more digits have the same
maximum frequency, the program must print the first repeating digit(the digit occuring for the
second time first in the input order) among those digits as the output.
Note: At least one digit is always repeated among the N digits.

Input:
9

Output:
4

Explanation:
The frequency of digit 1 is 2.
The frequency of digit 2 is 1.
The frequency of digit 3 is 1.
The frequency of digit 4 is 4.
The frequency of digit 5 is 1.
The digit 4 has the maximum frequency, so 4 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
	    HashMap<Integer,Integer> hashmap=new HashMap<>();
        HashMap<Integer,Integer> occurance_freq=new HashMap<>();
	    int N=sc.nextInt();
	    sc.nextLine();
	    int arr[]=new int[N];
	    int max_freq=0;
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	        hashmap.put(arr[i],hashmap.getOrDefault(arr[i],0)+1);
	        max_freq=hashmap.get(arr[i])>max_freq?hashmap.get(arr[i]):max_freq;
	    }
	    for(int i=0;i<N;i++){
	        if(max_freq==hashmap.get(arr[i]) && occurance_freq.get(arr[i])==1){
	            System.out.printf("%d",arr[i]);
	            return ;
	        }else{
                occurance_freq.put(arr[i],occurance_freq.getOrDefault(arr[i], 0)+1);
            }
	    }
	    
	}
}