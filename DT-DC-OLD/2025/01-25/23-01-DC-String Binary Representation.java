import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int len = s2.length();
		for(int j = 0 ; j < len ; j++){
		    String binary = Integer.toBinaryString(s2.charAt(j));
		    binary = "0".repeat(8-binary.length()) + binary;
		    for(int i = 0 ; i < 8 ; i++){
		        char ch = binary.charAt(i) == '0' ? Character.toLowerCase(s1.charAt(i)) : Character.toUpperCase(s1.charAt(i));
		        System.out.printf("%c",ch);
		    }
		    System.out.printf(" ");
		}
	}
}