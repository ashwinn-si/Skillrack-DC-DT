import java.util.*;
public class Hello {
    static char charGetter(int num){
        if(num < 26){
            return ((char)('a' + num ));
        }else{
            char specialChar[] = new char[]{'.',',',' ','?','\'','\"'};
            return specialChar[num - 26];
        }
        
    }
    static int bitGetter(char ch){
        if(Character.isLowerCase(ch)){
            return 0;
        }
        return 1;
    }
    static char wordGetter(String S){
        int bits = 0;
        for(int i = 0 ; i < 5 ; i++){
            bits <<= 1;
            bits |= bitGetter(S.charAt(i));
            
        }
        return charGetter(bits);
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = str.length();
		for(int i = 0; i < N ; i+=5){
		    System.out.print(wordGetter(str.substring(i , i+5)));
		}

	}
}