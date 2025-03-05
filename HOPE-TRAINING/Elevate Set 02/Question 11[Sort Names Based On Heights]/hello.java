import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Pair> pairs = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            String name = sc.next();
            int height = sc.nextInt();
            pairs.add(new Pair(height, name));
        }
        Collections.sort(pairs, (a,b) -> b.height - a.height);
        for(int i = 0 ; i < N ; i++){
            Pair currPair = pairs.get(i);
            System.out.println(currPair.name);
        }
	}
}
class Pair{
    int height;
    String name;
    Pair(int height, String name){
        this.name = name;
        this.height = height;
    }
}