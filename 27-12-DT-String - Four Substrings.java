import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int X = (int)(Math.pow(S.length(),0.5));
	    int currIndex = 0;
	    int inc = 1;
	    while(currIndex < S.length()-1){
	        String subString = (S.substring(currIndex,currIndex+((X-inc)*4)));
	        for(int i = 0 ; i < (int)(subString.length()/4) ; i++){
	            for(int j = 0 ; j < subString.length() ; j+=(int)(subString.length()/4)){
	                System.out.printf("%c",subString.charAt(i+j));
	            }
	        }
	        currIndex += ((X-inc)*4);
	        inc += 2;
	    }
	    if(X % 2 == 1){
	        System.out.printf("%c",S.charAt(S.length()-1));
	    }

	}
}