import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		Queue<Integer> robot1 = new LinkedList<>();
		Queue<Integer> robot2 = new LinkedList<>();
		int arr[] = new int[R]; // 1-> robot 1 is present , 2 -> robot 2 is present
		int matrix[][] = new int[R][C];
		for(int i = 0 ; i< R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		        if(matrix[i][j] == 1){
		            robot1.offer(j);
		            arr[i] = 1;
		        }else if(matrix[i][j] == 2){
		            robot2.offer(j);
		            arr[i] = 2;
		        }
		    }
		}
		int time = sc.nextInt();
        int R1Count = robot1.size();
        int R2Count = robot2.size();
        for(int i = 0 ; i < R1Count ; i++){
            int currIndex = robot1.poll();
            int makeToLast = C - currIndex - 1;
            int remainTime = time - makeToLast;
            if(remainTime < 0){
                robot1.offer(currIndex + time);
            }else{
                int steps = remainTime % (C-1);
                int side = remainTime / (C-1);
                if(side % 2 == 0){
                    robot1.offer(C - 1 - steps);
                }else{
                    robot1.offer(0 + steps);
                }
            }
        }
        for(int i = 0 ; i < R2Count ; i++){
            int currIndex = robot2.poll();
            int makeToLast = currIndex;
            int remainTime = time - makeToLast;
            if(remainTime < 0){
                robot2.offer(currIndex - time);
            }else{
                int steps = remainTime % (C-1);
                int side = remainTime / (C-1);
                if(side % 2 == 0){
                    robot2.offer(steps);
                }else{
                    robot2.offer(C - 1 - steps);
                }
            }
        }
        
        for(int i = 0 ; i < R ; i++){
            int insertIndex = (arr[i] == 1) ? robot1.poll() : robot2.poll();
            for(int j = 0 ; j < C ; j++){
                if(j == insertIndex){
                    System.out.printf("%d ",(arr[i] == 1) ? 1 : 2);
                }else{
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
	}
}