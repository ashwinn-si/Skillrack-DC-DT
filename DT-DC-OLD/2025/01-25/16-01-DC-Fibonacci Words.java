import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String first = "a";
		String second = "b";
		if(N == 1){
		    System.out.print(first);
		}else if(N==2){
		    System.out.print(first+" "+second);
		}else{
		    System.out.printf("%s %s ",first,second);
		    N-=2;
		    while(N > 0){
		        System.out.printf("%s ",second+first);
		        String temp = second+first;
		        first = second;
		        second = temp;
		        N--;
		    }
		}
	}
}