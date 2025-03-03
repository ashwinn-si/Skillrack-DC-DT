import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = (sc.nextLine());
		String s2 = (sc.nextLine());
		int N1 =  s1.length() , N2 = s2.length();
		String res = "";
	    for(int i = N1-1 ; i  >= 0; i--){
	        for(int j = i ;  j >= 0 ; j--){
	            String str = new StringBuffer(s1.substring(j , i+1)).reverse().toString();
	            if(s2.indexOf(str) != -1 && res.length() <= i - j +1){
	                res = str;
	            }
	        }
	    }
	    if(res.equals("")) res = "1-";
	    System.out.println(new StringBuffer(res).reverse());
	}
}