import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		HashMap <Integer, Integer> rowValue = new HashMap<>();
		HashMap <Integer, Integer> colValue = new HashMap<>();
		HashMap <Character, Coor> alphaValue = new HashMap<>();
		for(int i =0 ; i < 7 ; i++){
		    for(int j = 0 ; j  < 7; j++){
		        if(i == 0 ||  i == 6){
		            rowValue.put(j , rowValue.getOrDefault(j , 0) + (sc.nextInt()));
		        }else if(j == 0 || j == 6){
		            colValue.put(i , colValue.getOrDefault(i , 0)+ (sc.nextInt()));
		        }else{
		            alphaValue.put(sc.next().charAt(0) , new Coor(i , j));
		        }
		    }
		}
		sc.nextLine();
		String str = sc.nextLine();
		int res = 0;
		for(int i = 0 , N = str.length() ; i < N ; i++){
		    if(alphaValue.get(str.charAt(i)) == null){
		        res += -1;
		    }else{
		        res += rowValue.get(alphaValue.get(str.charAt(i)).y) + colValue.get(alphaValue.get(str.charAt(i)).x);
		    }
		    
		}
		System.out.print(res);
	}
}
class Coor{
    int x , y;
    Coor(int x , int y){
        this.x = x;
        this.y = y;
    }
}