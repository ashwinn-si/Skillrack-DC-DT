/*The program must accept a string S containing multiple words as the input. The program must
sort the words in S based on the number of vowels in descending order- Then the program
must print the modified string S as the output If two or more words having the same number
of vowels, then the program must sort those words in the order of their occurrence.

Input
He separated the fighting children

Output:
separated fighting children He the

Explanation:
The word -He- contains 1 vowel.
The word -separated- contains 4 vowels.
The word -the" contains 1 vowel.
The word -fighting" contains 2 vowels.
The word -children" contains 2 vowels.
After sorting the words based on the number of vowels in descending order, the string
becomes "separated fighting children He the".
Hence the output is
separated fighting children He the
*/

import java.util.*;
public class Hello {
    public static int vowel_count(String str){
        int vowel=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
        }
        return vowel;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String words[]=sc.nextLine().split(" ");
		List<List<String>> result=new ArrayList<>();
		int length=words.length;
		for(int i=0;i<length;i++){
		    List<String> curr=new ArrayList<>();
		    curr.add(words[i]);
		    curr.add(String.valueOf(vowel_count(words[i])));
		    result.add(curr);
		}
		Comparator<List<String>> comp =new Comparator<List<String>>(){
		    @Override
		    public int compare(List<String> a1,List<String> a2){
                /*
                 ascending na : a1 , a2
                 descending na : a2 , a1
                */
		        return Integer.compare(Integer.parseInt(a2.get(1)),Integer.parseInt(a1.get(1))); // we are sorting in reverse order so we should do a2 then a1
		    } 
		};
		Collections.sort(result,comp);
		for(int i=0;i<length;i++){
		    System.out.printf("%s ",result.get(i).get(0));
		}
	}
}