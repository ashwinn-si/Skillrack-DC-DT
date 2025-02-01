import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		HashMap<String , Integer> hash = new HashMap<>();
		hash.put("111101101101111",0);
        hash.put("001001001001001",1);
        hash.put("111001111100111",2);
        hash.put("111001111001111",3);
        hash.put("101101111001001",4);
        hash.put("111100111001111",5);
        hash.put("111100111101111",6);
        hash.put("111001001001001",7);
        hash.put("111101111101111",8);
        hash.put("111101111001111",9);
        
        String matrix[] = new String[5];
        
        for(int i = 0 ; i < 5 ; i++){
            matrix[i] = sc.nextLine();
        }
        
        int j = 0;
        while (j < 17){
            if(j == 3 || j == 13 || j >=7 && j<=9){
                if(j == 7){
                    System.out.print(":");
                }
                j++;
                continue;
            }
            String currString =  "";
            for(int i = 0 ; i < 5 ; i++){
                for(int k = j ; k < j+3 ; k++){
                    currString += (matrix[i].charAt(k));
                }
            }
            System.out.print(hash.get(currString));
            j+=3;
        }
	}
}