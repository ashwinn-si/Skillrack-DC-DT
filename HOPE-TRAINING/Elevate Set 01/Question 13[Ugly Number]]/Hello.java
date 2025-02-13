import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if( num <= 0){
		    System.out.print("no");
		    return;
		}
	    while(num % 2 == 0){
	        num /= 2;
	    }
	    while(num % 3 == 0){
	        num /= 3;
	    }
	    while(num % 5  == 0){
	        num /= 5;
	    }
	   
		if(num == 1){
		    System.out.print("yes");
		}else{
		    System.out.print("no");
		}

	}
}