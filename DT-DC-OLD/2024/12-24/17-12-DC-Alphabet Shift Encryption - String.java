import java.util.*;
public class Hello {
    static char helper(char ch,int n){
        if(Character.isUpperCase(ch)){
            ch = (char)('A' + (ch - 'A' + n) % 26);
        }else{
            ch = (char)('a' + (ch - 'a' + n) % 26);
        }
        return ch;
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        StringBuffer string = new StringBuffer(sc.nextLine());
        int count = 1;
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 0; i < count ;i++){
                char newChar = helper(string.charAt(i),n);
                string.delete(i,i+1);
                string.insert(i,newChar);
                
            }
            count++;
            
        }
        System.out.print(string);
	}
}