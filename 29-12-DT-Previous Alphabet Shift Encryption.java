import java.util.*;
public class Hello {
    static char prevChar = (char)('a'-1);
    static int helper2(char ch){
        if(Character.isUpperCase(ch)){
            return ch - 'A' + 1; 
        }else{
            return ch - 'a'  + 1;
        }
    }
    static void helper(char ch , char prev){
        if(ch >='a' && ch <='z' || (ch >='A' && ch <='Z')){
            int inc = helper2(prev);
            if(Character.isUpperCase(ch)){
                System.out.printf("%c",'A'+(ch-'A'+inc)%26);
            }else{
                System.out.printf("%c",'a'+(ch-'a'+inc)%26);
            }
            prevChar = ch;
        }else{
            System.out.printf("%c",ch);
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.printf("%c",S.charAt(0));
		if(S.charAt(0) >= 'a' && S.charAt(0) <='z' || S.charAt(0) >= 'A' && S.charAt(0) <='Z'){
		    prevChar = S.charAt(0);
		}
		for(int i = 1 ; i < S.length() ; i++){
		    helper(S.charAt(i) , prevChar);
		}
	}
}