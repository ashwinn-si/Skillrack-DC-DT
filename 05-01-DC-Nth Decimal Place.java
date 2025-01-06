import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		sc.nextLine();
		int N = sc.nextInt();
		String res = Double.toString(X/Y);
		if(res.substring(res.indexOf(".")+1,res.length()).length() < N){
		    System.out.print("0");
		    return;
		}
		System.out.print(res.substring(res.indexOf(".")+1,res.length()).charAt(N-1));
	}
}