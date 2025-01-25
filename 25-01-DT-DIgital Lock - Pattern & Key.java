//dynamiclly we should generate rows and cols 
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String matrix[] = new String[4];
		for(int i =  0 ; i < 4 ; i++){
		    matrix[i] = sc.nextLine();
		}
		int check = sc.nextInt();
		for(int j = 5 ; j >=0 ; j--){
		    String currString = "";
		    for(int i = 0 ; i < 4 ; i++){
		        currString += (matrix[i].charAt(j));
		    }
		    
		    int cmp = Integer.valueOf(currString,2);
		    if(cmp != check%10){
		        System.out.println("NO");
		        return;
		    }
		    check/=10;
		}
		System.out.println("YES");
	}
}