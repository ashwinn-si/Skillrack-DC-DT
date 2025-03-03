import java.util.*;
public class Hello {
    static HashMap<Character,String> hash = new HashMap<>();
    static void dfs(String inputString, int currIndex, int N, String currCombination){
        if(currIndex == N){
            System.out.print(currCombination+" ");
            return;
        }
        
        String currIndexString = hash.get(inputString.charAt(currIndex));
        int lenCurrIndexString = currIndexString.length();
        
        for(int i = 0 ; i < lenCurrIndexString ; i++){
            dfs(inputString, currIndex+1, N, currCombination + currIndexString.charAt(i));
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		hash.put('1',"@_");
		hash.put('2',"abc");
		hash.put('3',"def");
		hash.put('4',"ghi");
		hash.put('5',"jkl");
		hash.put('6',"mno");
		hash.put('7',"pqrs");
		hash.put('8',"tuv");
		hash.put('9',"wxyz");
		
		String inputString = sc.nextLine();
		
		dfs(inputString, 0, inputString.length(), "");

	}
}