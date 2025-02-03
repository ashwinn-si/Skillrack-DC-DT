import java.util.*;
public class Hello {
    static void helper(int stIndex , int endIndex, String str){
        for(int i = stIndex ; i <= endIndex ; i++){
            if(str.charAt(i) != ' ') System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Integer> spacesIndex = new Stack<>();
		int N = str.length();
		for(int i = 0 ; i < N ; i++){
		    if(str.charAt(i) == ' ' && str.charAt(Math.min(N-1,i+1)) != ' '){
		        spacesIndex.push(i);
		    }
		}
		int lastIndex = N-1;
		while(!spacesIndex.isEmpty()){
		    int stIndex = spacesIndex.pop();
		    helper(stIndex , lastIndex , str);
		    lastIndex = stIndex;
		    System.out.print(" ");
		}
		
		helper(0,lastIndex,str);
		

	}
}