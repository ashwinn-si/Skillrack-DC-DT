import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix[][] = new int[R][C];
		HashMap<Integer, Integer> rowMax = new HashMap<>();
		HashMap<Integer, Integer> colMax = new HashMap<>();
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		        rowMax.put(i , Math.max(rowMax.getOrDefault(i , 0), matrix[i][j]));
		        colMax.put(j , Math.max(colMax.getOrDefault(j , 0), matrix[i][j]));
		    }
		}
		
		for(int i = 0;  i < R ; i++){
		    for(int j = 0; j  <C ; j++){
		        System.out.printf("%d ", matrix[i][j] != 0 ? Math.min(rowMax.get(i) , colMax.get(j)) : 0);  
		    }
		    System.out.println();
		}
	}
}