import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		HashMap<Character , Integer> hash = new HashMap<>();
        String str = sc.nextLine();
        while(str.length() != 0){
            
            //getting the index of a,b,c,d,e and putting to hash
            char ch = 'a';
            for(int i = 0 ; i < 5 ; i++){
                if(str.indexOf(ch) == -1){
                    System.out.println("NO");
                    return;
                    
                }
                hash.put(ch,str.indexOf(ch));
                ch++;
            }
            ch = 'a';
            int removeCount = 0 ;
            for(int i = 0 ; i < 4 ; i++){
                //checking if a has occured before b and soo on...
                if(hash.get(ch) > hash.get((char)(ch+1))){
                    System.out.println("NO");
                    return;
                }
                //removing the char from the string
                str = str.substring(0,hash.get(ch)-removeCount).concat(str.substring(hash.get(ch)+1-removeCount,str.length()));
                ch++;
                removeCount++;
            }
            str = str.substring(0,hash.get('e')-removeCount).concat(str.substring(hash.get(ch)+1-removeCount,str.length()));
        }
        System.out.println("YES");
	}
}