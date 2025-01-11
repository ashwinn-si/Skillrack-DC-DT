import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		int matrix [][] = new int[R][C];
		
	    for(int i = 0 ; i < R ; i++){
	        for(int j = 0 ; j < C ; j++){
	            matrix[i][j] = sc.nextInt();
	        }
	    }
	    
		Queue<Integer> numbers = new LinkedList<>();
		Queue<Integer> indexX = new LinkedList<>();
		Queue<Integer> indexY = new LinkedList<>();
		
 		//adding the element and index for unit digit to the queue
		for(int j = 0 ; j < C ; j++){
		    if(matrix[0][j]%10 == matrix[R-1][C-1]%10){
		        numbers.offer(matrix[0][j]);
		        indexX.offer(0);
		        indexY.offer(j);
		    }
		}
		
		for(int i = 1 ; i < R ; i++){
		    if(matrix[i][C-1]%10 == matrix[R-1][C-1]%10){
		        numbers.offer(matrix[i][C-1]);
		        indexX.offer(i);
		        indexY.offer(C-1);
		    }
		}
		
		for(int j = C-2 ; j >= 0 ; j--){
		    if(matrix[R-1][j]%10 == matrix[R-1][C-1]%10){
		        numbers.offer(matrix[R-1][j]);
		        indexX.offer(R-1);
		        indexY.offer(j);
		    }
		}
		
		for(int i = R-2 ; i >= 1 ; i--){
		    if(matrix[i][0]%10 == matrix[R-1][C-1]%10){
		        numbers.offer(matrix[i][0]);
		        indexX.offer(i);
		        indexY.offer(0);
		    }
		}
		
		//rotating the queue clockwise
		int lastX = indexX.poll();
		int lastY = indexY.poll();
		indexX.offer(lastX);
		indexY.offer(lastY);
		
		while(indexX.size() != 0 ){
		    matrix[indexX.poll()][indexY.poll()] = numbers.poll();
		}
        
        for(int i = 0 ; i < R;i++){
            for(int j = 0 ; j < C ;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
	}
}