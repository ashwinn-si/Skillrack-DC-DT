import java.util.*;
public class Hello {
    static void Helper(int N, String str){
        int rowsCols = N;
        boolean flag = (str.charAt(1) == 'l')? true : false;
        if(str.charAt(0) == 't'){
            N = (flag) ? 0 : N-1;
        }else{
            N = (flag) ? N-1 : (2*N)-2; 
        }
        for(int i = 0 ; i < rowsCols ; i++){
            int dummy = N;
            for(int j = 0 ; j < rowsCols ; j++){
                System.out.printf("%d ",dummy);
                dummy = (flag)? dummy+1 : dummy-1;
            }
            System.out.println();
            N = (str.charAt(0) == 't') ? N+1 : N-1;
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.nextLine().strip();
        Helper(N , str);
	}
}