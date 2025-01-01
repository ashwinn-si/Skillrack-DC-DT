/*The program must accept an array of N integers and an integer K as the input. The program
must remove a subarray of size K in the give array so that the sum of the remaining integers in
the array is maximum. Then the program must print the integers that are removed from the
array as the output. If two or more such subarrays are present in the given array, then the
program must remove the first occurring subarray.

Input:
7
10 20 5 2 -5 66 -69
3
Output:
-5 66 -69

[if we use two loops timeout will occur]
*/
/*Abdul logic refer whatsapp for logic photo*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String input_line[]=sc.nextLine().split(" ");
        int K=sc.nextInt();
        int numbers[]=new int[N];
        for(int i=0;i<N;i++){
            numbers[i]=Integer.parseInt(input_line[i]);
        }
        int min_value=0;
        int res_index=0;
        for(int i=0;i<K;i++){
            min_value+=numbers[i];
        }
        int previous_sub_array_val=min_value;
        for(int i=1;i<=N-K;i++){
            int curr_sub_array_val=previous_sub_array_val;
            curr_sub_array_val-=numbers[i-1];
            curr_sub_array_val+=numbers[i+K-1];
            if(curr_sub_array_val<min_value){
                min_value=curr_sub_array_val;
                res_index=i;
            }
            previous_sub_array_val=curr_sub_array_val;
        }
        for(int i=res_index;i<res_index+K;i++){
            System.out.printf("%d ",numbers[i]);
        }
        
	}
}