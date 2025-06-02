import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i = 0 ; i < N ; i++){
		    int st = sc.nextInt();
		    int end = sc.nextInt();
		    for(int year = st ; year < end ; year++){
		        hash.put(year, hash.getOrDefault(year, 0) + 1);
		    }
		}
		System.out.print(hash.getOrDefault(sc.nextInt(), 0));
	}
}