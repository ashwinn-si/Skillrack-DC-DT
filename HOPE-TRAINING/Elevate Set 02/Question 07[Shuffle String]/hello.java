import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char result[] = new char[len];
        for(int currIndex = 0 ; currIndex < len ; currIndex++){
            int moveIndex = sc.nextInt();
            result[moveIndex] = str.charAt(currIndex);
        }
        System.out.print(new String(result));
    }
}