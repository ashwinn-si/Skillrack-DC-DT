import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
		char matrix[][]=new char[N][N];
		
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        matrix[i][j]=sc.next().charAt(0);
		    }
		}
		
		sc.nextLine();
		
		int X=sc.nextInt();
		
		int top_left_pointer=0,bottom_right_pointer=0;
		
		if(N%2==1){
		    
		    top_left_pointer=N/2;
		    
		    bottom_right_pointer=N/2;
		    
		}else{
		    
		    top_left_pointer=(N/2)-1;
		    
		    bottom_right_pointer=N/2;
		    
		}
		
	    bottom_right_pointer+=(X-1);
	    
	    top_left_pointer-=(X-1);
		
		for(int i=0;i<N;i++){
		    
		    for(int j=0;j<N;j++){
		        
		        if(i>=top_left_pointer && i<=bottom_right_pointer && j>=top_left_pointer && j<=bottom_right_pointer){
		            System.out.printf("* ");
		        }else{
		            System.out.printf("%c ",matrix[i][j]);
		        }
		    }
		    System.out.println();
		}
	}
}