import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		char ch = 'a';
		for(int i = 0 ; i < N ; i++){
		    String str = sc.nextLine();
		    int index1 = str.indexOf(ch);
		    int index2 = str.indexOf(Character.toUpperCase(ch));
		    index1 = index1 == -1 ? Integer.MAX_VALUE : index1;
		    index2 = index2 == -1 ? Integer.MAX_VALUE : index2;
		    System.out.println(str.substring(Math.min(index1,index2),str.length()));
		    ch++;
		    if(ch > 'z'){
		        ch = 'a';
		    }
		}
	}
}