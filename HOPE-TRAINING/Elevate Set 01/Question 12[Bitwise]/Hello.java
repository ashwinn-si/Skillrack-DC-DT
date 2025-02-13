import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int A = (sc.nextInt());
		int B = (sc.nextInt());
        int C = (sc.nextInt());
        int count = 0;
		for(int i = 0 ; i < 32 ; i++){
		    int A_bit = (A >> i) & 1;
		    int B_bit = (B >> i) & 1;
		    int C_bit = (C >> i) & 1;
		    if(C_bit == 0 ){
		        count += (B_bit + A_bit); 
		    }else if(C_bit == 1 && B_bit == 0 && A_bit == 0){
		        count++;
		    }
		}
		System.out.print(count);

	}
}