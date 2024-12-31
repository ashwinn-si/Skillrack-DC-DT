/*The program must accept N space-separated string values as the input. The program must
print the count of common words in the N string values as the output. If a word has occurred
more than once in all the N string values then the program must consider the count as 1 for
that common word.
Note: The N string values are case sensitive.

Input : 
3
hi hello world
hi how are you world
say hi to the world

Output:
2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		HashMap<String,Integer> hash=new HashMap<>();
        for(int i=0;i<N;i++){
            for(String word:sc.nextLine().split(" ")){
                if(i==0 && hash.get(word)==null){
                    hash.put(word,1);
                }
                if(i != 0 && hash.get(word)!=null){
                    if(hash.get(word)==i){ //!to check is the count is == the previous line count so that the word is present in all the previous lines
                        hash.put(word,hash.get(word)+1);
                    }
                }
            }
        }
        int count=0;
        for(Map.Entry<String,Integer> curr_pair:hash.entrySet()){
            if(curr_pair.getValue()==N){
                count++;
            }
        }
        System.out.printf("%d",count);
	}
}