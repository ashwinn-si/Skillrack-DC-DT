/*The program must accept N integers as the input. The program must find all possible pairs of integers whose sum is
present in the given N integers. Then the program must sort the pairs based on the sum. If two or more pairs having the
same sum, then the program must sort those pairs based on the value of the first operand. Finally, the program must print
the sorted pairs based on the following format.
Operand1 + Operand2 = Sum
If there is no such pair, then the program must print -1 as the output.

Input:
4
2 1 3 5

Output:
1 + 2 = 3
2 + 1 = 3
2 + 3 = 5
3 + 2 = 5

Explanation:
All possible pairs of integers whose sum is present in the 4 integers are given below.
2 + 1 = 3
2 + 3 = 5
1 + 2 = 3
3 + 2 = 5
After sorting the pairs based on the given conditions, the pairs become
1 + 2 = 3
2 + 1 = 3
2 + 3 = 5
3 + 2 = 5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean flag=false;
		List<Integer>num=new ArrayList<>();
		for(int i=0;i<N;i++){
		    num.add(sc.nextInt());
		}
		List<List<Integer>> pairs=new ArrayList<>();
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(i != j && num.contains(num.get(i)+num.get(j))){ 
		            List<Integer> curr_pair=new ArrayList<>();
		            curr_pair.add(num.get(i));
		            curr_pair.add(num.get(j));
		            curr_pair.add(num.get(i)+num.get(j));
		            pairs.add(curr_pair);
		            flag=true;
		        }
		    }
		}
		if(!flag){
		    System.out.printf("-1");
		    return ;
		}
	    Comparator<List<Integer>> comp1= new Comparator<List<Integer>>(){
	        @Override
	        public int compare(List<Integer> a1,List<Integer> a2){
				if(a1.get(2) != a2.get(2)){
					return Integer.compare(a1.get(2),a2.get(2));
				}else if(a1.get(1) !=a2.get(1)){
					return Integer.compare(a1.get(0),a2.get(0));
				}
	            
	        }
	    };
	    Collections.sort(pairs,comp1);
	    for(int i=0;i<pairs.size();i++){
	        System.out.printf("%d + %d = %d\n",pairs.get(i).get(0),pairs.get(i).get(1),pairs.get(i).get(2));
	    }
	}
}