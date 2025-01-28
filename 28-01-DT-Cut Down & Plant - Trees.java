import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Queue<Integer> trees = new LinkedList<>();
        for(int i = 0 ; i < N ; i++){
            trees.offer(sc.nextInt());
        }
        int cutOrder = sc.nextInt();
        for(int i = 0 ; i < cutOrder ; i++){
            int cutDownTree = trees.poll();
            if(cutDownTree % 2 == 0){
                for(int j = cutDownTree / 2 ; j >= 1 ; j--){
                    trees.offer(j);
                }
            }else{
                for(int j = 1 ; j <= cutDownTree ; j++){
                    trees.offer(j);
                }
            }
        }
        System.out.print(trees.size());
	}
}