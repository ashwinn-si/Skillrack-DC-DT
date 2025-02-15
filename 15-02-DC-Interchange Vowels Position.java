import java.util.*;
public class Hello {
    static boolean helper(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer(sc.nextLine());
		StringBuffer s2 = new StringBuffer(sc.nextLine());
		int pointer1 = 0, pointer2 = 0, N1 = s1.length(), N2 = s2.length();
		while(pointer1 < N1 && pointer2 < N2){
		    //finding the index where is vowel in pointer1
		    while(pointer1 < N1 && ! helper(s1.charAt(pointer1))) pointer1++;
		    while(pointer2 < N2 && ! helper(s2.charAt(pointer2))) pointer2++;
		    if(pointer1 < N1 && pointer2 < N2){
		        char ch = s1.charAt(pointer1);
		        s1.setCharAt(pointer1, s2.charAt(pointer2));
		        s2.setCharAt(pointer2, ch);
		    }
		    pointer1++;
		    pointer2++;
		}
		System.out.println(s1+"\n"+s2);
	}
}