import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0 ; i < str.length() - 1 ; i++){
		    char currChar = str.charAt(i);
		    char targetChar = str.charAt(i+1); 
		    int noIteration = targetChar - currChar;
		    if(noIteration < 0){
		        noIteration = ('z' - currChar) + (targetChar - 'a')+1;
		    }
		    for(int j = 0 ; j < noIteration+1 ; j++){
		        System.out.print(currChar);
		        currChar++;
		        if(currChar > 'z'){
		            currChar = 'a';
		        }
		    }
		    
		}
	}
}