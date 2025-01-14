import java.util.*;
public class Hello {
    static void adjMatrixGenerator(int st , int end, int matrix[][], int R){
        List<Pair> list = new ArrayList<>();
        int target = matrix[0][st]%10;
        
        for(int j = st ; j <= end ; j++){
            if(target == matrix[0][j] % 10){
                list.add(new Pair(0 , j , matrix[0][j]));
            }
        }
        
        for(int i = 1 ; i < R ;i++){
            if(target == matrix[i][end] % 10){
                list.add(new Pair(i , end , matrix[i][end]));
            }
        }
        
        for(int i = R-1 ; i > 0 ; i--){
            if(target == matrix[i][st] % 10){
                list.add(new Pair(i , st , matrix[i][st]));
            }
        }
        
        //rotating
        for(int i = 1 ; i < list.size() ; i++){
            Pair p = list.get(i);
            matrix[p.x][p.y] = list.get(i-1).val;
            if(i == list.size()-1){
                Pair p1 = list.get(0);
                matrix[p1.x][p1.y] = p.val;
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		
		for(int j = 0 ; j < C-1 ; j+=2){
		    adjMatrixGenerator(j , j+1 , matrix, R);
		}
		
		for(int i = 0 ; i < R ;i++){
		    for(int j =0 ; j < C ;j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}
class Pair{
    int x , y , val;
    Pair(int x , int y , int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
}