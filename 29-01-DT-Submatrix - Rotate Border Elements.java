import java.util.*;
public class Hello {
    static void helper(int mode, int stI, int stJ, List<Trio> arr,char matrix[][]){
        int index = 7;
        int pos[][] = new int[][]{
            {stI,stJ},{stI,stJ+1},{stI,stJ+2},
            {stI+1,stJ+2},{stI+2,stJ+2},
            {stI+2,stJ+1},{stI+2,stJ},
            {stI+1,stJ}
        };
        
        for(int[] currPos : pos){
            if(mode == 1){
                arr.add(new Trio(currPos[0] , currPos[1] , matrix[currPos[0]][currPos[1]]));
            }else{
                Trio t = arr.get(index);
                matrix[currPos[0]][currPos[1]] = t.value;
                if(index == 7){
                    index = 0;
                }else{
                    index++;
                }
            }
        }
    }
    static int[] indexFinder(char ch, int R, int C, char matrix[][]){
        for(int i = 1 ; i < R-1; i++){
            for(int j = 1 ; j < C-1;  j++){
                if(matrix[i][j] == ch){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        char matrix[][] = new char[R][C];
        for(int i = 0 ; i < R;  i++){
            for(int j = 0 ; j < C ; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        String str = sc.next();
        
        for(int i = 0; i < str.length() ; i++){
            int Coor[] = indexFinder(str.charAt(i) , R, C, matrix);
            if(Coor[0] == -1){
                continue;
            }
            List<Trio> arr = new ArrayList<>();
            helper(1, Coor[0]-1, Coor[1]-1, arr, matrix);
            helper(2 , Coor[0]-1,Coor[1]-1, arr, matrix);
        }
        
        for(int i = 0; i < R ; i++){
            for(int j = 0 ;j  <C ; j++){
                System.out.printf("%c ",matrix[i][j]);
            }
            System.out.println();
        }
	}
}
class Trio{
    int i , j ;
    char value;
    Trio(int i ,int j, char value){
        this.i = i;
        this.j = j;
        this.value = value;
    }
}