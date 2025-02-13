import java.util.*;
public class Hello {
    
    static boolean helper(String minString , String maxString , int minLen , int maxLen){
        int j = 0;
        for(int i = 0 ; i < maxLen ; i++){
            if(maxString.charAt(i) == minString.charAt(j)){
                j++;
            }
            if(j == minLen){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String minString = s1.length() >= s2.length() ? s2 : s1;
		String maxString = s2.length() > s1.length() ? s2 : s1;
		if(helper(minString, maxString , minString.length() , maxString.length())){
		    System.out.print("yes");
		    return;
		}
		System.out.print("no");
	}
}