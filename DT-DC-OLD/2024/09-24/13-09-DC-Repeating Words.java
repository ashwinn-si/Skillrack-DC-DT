/*The program must accept a string S containing multiple words as the input The program must
find the words which are repeated more than once in the string S. Then the program must sort
the repeated words in descending order based on the length. If W.•o or more words have the
same length, then the program must Sort those words in the Order Of their occurrence, If all the
words in the string S are unique, then the program must print -1 as the output.

Input
when there is a will there is a way

Output:
there is a

Explanation:
In the string •when there is a will there is a way", the repeated words are there, is and a.
The length of the word there is 5.
The length of the word is is 2.
The length of the word a is 1.
After sorting the repeated words in descending order based on the length. the words become
there is a
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String input_line[]=sc.nextLine().split(" ");
		List<String> result=new ArrayList<>();
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		Comparator <String> comp=new Comparator<String>(){
		    @Override
		    public int compare(String a,String b){
		        if(a.length()!= b.length()){
		            return Integer.compare(b.length(),a.length());
		        }else{
		            return Integer.compare(hash.get(a),hash.get(b));
		        }
		    }
		};
		for(int i=0;i<input_line.length;i++){
		    String word=input_line[i];
		    if(hash.get(word)==null){
		        hash.put(word,i);
		    }else if(!result.contains(word)){ //! the word should not be in result [when the same word repeats more than two times]
		        result.add(word);
		    }
		}
		if(result.size()==0){
		    System.out.printf("-1");
		    return;
		}
		Collections.sort(result,comp);
        for(String word:result){
            System.out.printf("%s ",word);
        }
	}
}