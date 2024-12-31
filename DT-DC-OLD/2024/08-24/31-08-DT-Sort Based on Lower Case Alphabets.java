/*The program must accept N string values containing only alphabets as the input. The program
must sort the string values based on the count of lower case alphabets. If two ore more string
values have the same count of lower case alphabets, then the program must print those string
values based on their order of occurrence as the output. Finally, the program must print the
sorted string values as the output.

Input
3
candY
faNcY
mObile

Output:
faNcY
candY
mObile
*/

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Hello {
    public static int lowercase(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                res+=1;
            }
        }   
        return res;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
	    List<List<String>> result=new ArrayList<>();
	    Comparator <List<String>> comp=new Comparator<List<String>>(){
	        @Override
	        public int compare(List<String> a1,List<String> a2){
	            return Integer.compare(Integer.parseInt(a1.get(1)),Integer.parseInt(a2.get(1)));
	        }
	    };
	    for(int i=0;i<N;i++){
	        String str=sc.nextLine();
	        List<String> curr_string=new ArrayList<>();
	        curr_string.add(str);
	        curr_string.add(String.valueOf(lowercase(str)));
	        result.add(curr_string);
	    }
	   Collections.sort(result,comp);
	   for(int i=0;i<N;i++){
	       System.out.println(result.get(i).get(0));
	   }
	}
}