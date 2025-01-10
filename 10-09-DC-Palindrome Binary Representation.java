import java.util.*;
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int flag = false;
        sc.nextLine();
        for(int i = 0 ; i < N ; i++){
            StringBuffer currNum  = new StringBuffer(Integer.toBinaryString(sc.nextInt()));
            if(currNum.toString().equals(currNum.reverse().toString())){
                System.out.printf("%d ",Integer.parseInt(currNum.toString(),2));
            }
        }
    }
}