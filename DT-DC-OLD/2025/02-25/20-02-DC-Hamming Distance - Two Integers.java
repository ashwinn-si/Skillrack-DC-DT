import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < 32 ; i++){
            if( (1 << i) > A && (1 << i) > B){
                break;
            }
            if( ((A >> i) & 1) != ((B >> i) & 1)){
                count++;
            }
        }
        System.out.print(count);
	}
}