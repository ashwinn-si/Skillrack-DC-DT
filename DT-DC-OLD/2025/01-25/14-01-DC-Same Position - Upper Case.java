import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
	
	    for(int i = 0 ; i < s2.length() ; i++){
	        if(s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z'){
	            System.out.print(s1.charAt(i));
	        }
	    }
	    
	    for(int i = 0 ; i < s1.length() ; i++){
	        if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
	            System.out.print(s2.charAt(i));
	        }
	    }
	}
}