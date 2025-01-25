import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char matrix[][] = new char[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j =0 ; j <C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		    }
		}
		
        int N = sc.nextInt();
        int hole[] = new int[N];
        for(int i = 0 ; i < N ; i++){
            hole[i] = sc.nextInt();
        }
        
        int exisitingHoles [] = new int[C];
        for(int j = 0 ; j < C ; j++){
            int count = 0;
            for(int i = 0 ; i < R ; i++){
                if(matrix[i][j] == '*'){
                    count++;
                }
            }
            exisitingHoles[j] = count;
        }
        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < C ; j++){
                if(hole[i] == exisitingHoles[j]){
                    exisitingHoles[j] = 0;
                    hole[i] = 0;
                    break;
                }
            }
            
        }
            
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                if(exisitingHoles[j] != 0){
                    System.out.printf("%c ",matrix[i][j]);
                }else{
                    System.out.printf("# ");
                }
            }
            System.out.println();
        }
        
        boolean flag = true;
        for(int i = 0 ; i < N ; i++){
            if(hole[i] != 0){
                System.out.printf("%d ",hole[i]);
                flag = false;
            }
        }
        if(flag){
            System.out.print("-1");
        }
	}
}