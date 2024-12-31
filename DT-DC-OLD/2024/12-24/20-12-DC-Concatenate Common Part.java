import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int length = S.length();
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            String currString = sc.nextLine();
            //finding the last occuring of the currString in Original string
            int lastIndex  = S.lastIndexOf(currString.charAt(0));
            //checking if the currString first part is present in the last part of S
            if(S.substring(lastIndex,length).equals(currString.substring(0,length-lastIndex))){
                System.out.println(S.substring(lastIndex,length)+currString);
            }else{
                System.out.println("-1");
            }
        }

    }
}