import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0, resultCount = 0; // L -> ++ | R -> --
		for(int i = 0 ; i < str.length(); i++){
		    count += (str.charAt(i) == 'L')? 1 : -1;
		    if(count == 0){
		        resultCount++;
		    }
		}
		System.out.print(resultCount);
	}
}