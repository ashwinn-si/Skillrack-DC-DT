import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int K = sc.nextInt();
		int c = 0;
        for(int i = 0 ; i < S.length()-3 ; i++){
            int num = Integer.parseInt(S.substring(i,i+4));
            if(Integer.toString(num).length()!=4){
                continue;
            }
            if(num%K==0){
                c++;
            }
        }
        System.out.printf("%d",c);
	}
}