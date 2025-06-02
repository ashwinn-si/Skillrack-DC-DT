import java.util.*;

public class Hello {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        sc.nextLine();
        
        char[] characters_array = new char[1001];
        
        int index = 0;
        
        for(int i = 1 ; (i <= N) ; i++){
            
            String string = sc.nextLine();
            
            System.arraycopy(string.toCharArray() , 0 , characters_array , index , Math.min(string.length() , (characters_array.length - index)));
            
            System.out.println((new String(characters_array)).substring(0 , (index + string.length())));
            
            index += 1;
        }
    }
}