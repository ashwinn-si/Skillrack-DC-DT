import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int R = sc.nextInt();
      int C = sc.nextInt();
      sc.nextLine();
      char matrix[][] = new char[R][C];
      for(int i = 0 ;i < R ; i++){
        for(int j = 0 ; j < C ; j++){
          matrix[i][j] = sc.next().charAt(0);
        }
      }
      int currI = sc.nextInt()-1;
      int currJ = sc.nextInt()-1;
      int S1 = currI+1; //top vertical
      int S2 = C - currJ ; // right horizontal
      int S3 = R - currI ; // bottom
      int S4 = currJ+1;//left
      if(S1 >= S2 && S1 >= S3 && S1 >= S4){
        printer(currI , 0 , -1 , matrix , true , currJ);
      }else if(S2 >= S3 && S2 >= S4){
        printer(currJ , R , 1 , matrix ,false ,currI);
      }else if(S3 >= S4){
        printer(currI , C ,1, matrix , true , currJ);
      }else{
        printer(currJ , 0 , -1 , matrix , false , currI);
      }
  }
  static void printer(int st , int end , int increment , char matrix[][],boolean Flag , int cons){
    //Flag -> true [col] | false [row]
    for(int i = st ; i <= end ; i+=increment){
      if(Flag){
        System.out.printf("%c",matrix[i][cons]);
      }else{
        System.out.printf("%c",matrix[cons][i]);
      }
    }
  }
}