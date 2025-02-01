import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total1 = 0 , total2 = 0, win1 = 0, win2=0;
		for(int i = 0 ; i < N ; i++){
		    int t1 = sc.nextInt();
		    int t2 = sc.nextInt();
		    if(t1 > t2){
		        win1++;
		    }else if(t1 < t2){
		        win2++;
		    }
		    total1 += t1;
		    total2 += t2;
		    if(i == N-1 && win1 == win2 && total1 == total2){
		        if(t1 > t2){
		            System.out.println("Team A");
		        }else if(t1 < t2){
		            System.out.println("Team B");
		        }else{
		            System.out.println("TIE");
		        }
		        return ;
		    }
		}
		if(win1 > win2){
		    System.out.printf("Team A");
		}else if(win1 < win2){
		    System.out.printf("Team B");
		}else{
		    if(total1 > total2){
		        System.out.printf("Team A");
		    }else{
		        System.out.printf("Team B");
		    }
		}
	}
}