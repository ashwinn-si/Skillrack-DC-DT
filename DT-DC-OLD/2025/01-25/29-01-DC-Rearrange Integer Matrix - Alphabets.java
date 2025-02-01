import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R  = sc.nextInt();
		int C = sc.nextInt();
		int matrix[][] = new int[R][C];
		sc.nextLine();
		for(int i = 0 ; i < R ;i++){
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		List<Corr> list = new ArrayList<>();
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C  ;j++){
                char ch = sc.next().charAt(0);
                list.add(new Corr(i , j, ch));
            }
        }
        list.sort((a,b) -> a.ch-b.ch);
        int res[][] = new int[R][C];
        int currI = 0;
        int currJ = 0;
        int count = 0;
        for(Corr c : list){
            res[c.x][c.y] = matrix[currI][currJ];
            currJ++;
            if(currJ == C){
                currI++;
                currJ = 0;
            }
            
        }
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ;  j < C ; j++){
                System.out.printf("%d ",res[i][j]);
            }
            System.out.println();
        }
        
	}
}
class Corr{
    int x , y;
    char ch;
    Corr(int x , int y, char ch){
        this.x = x;
        this.y = y;
        this.ch = ch;
    }
}