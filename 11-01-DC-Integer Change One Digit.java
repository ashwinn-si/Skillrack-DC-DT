import java.util.*;
public class Hello {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int multiplier = (int)Math.pow(10,(int) (Math.log10(N) + 1 - K));
        int digit = ((N / multiplier) % 10);
        for(int i = 0 ; i < 10 ; i++){
            int curr = N - (multiplier * digit);
            System.out.printf("%d ",curr + (multiplier * i));
        }
    }
}