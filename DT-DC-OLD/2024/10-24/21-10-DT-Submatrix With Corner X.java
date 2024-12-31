/*The program must accept an integer matrix of size NXN and an integer X as the input. The
integer X always occurs once in the given matrix. The program must print all the possible
square submatrices which contain the integer X in one of the four corners as the output. The
square submatrices must be printed in the increasing order of size. If two or more submatrices
have the same size, those square submatrices must be printed in the clockwise direction.

Input
4
83 58 29 70
50 23 59 54
51 86 82 67
10 6037 56
59

Ouput
59
58 29 
23 59 
29 70 
59 54 
59 54 
82 67 
23 59 
86 82 
50 23 59 
51 86 82 
10 60 37 
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
		int arr[][]=new int[N][N];
		
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		sc.nextLine();
		
		int target=sc.nextInt();
		
		int target_i=0;
		int target_j=0;
		
		for(int i=0;i<N;i++){
		    boolean flag=false;
		    for(int j=0;j<N;j++){
		        if(arr[i][j]==target){
    		        target_i=i;
    		        target_j=j;
    		        flag=true;
    		        break;
		        }
		    }
		    if(flag){
		        break;
		    }
		}
		
		int count=1;
		
		System.out.println(target);
		
		while(true){
		    
		    boolean flag=false; // we are checking clockwisely and printing
		    if(checker(target_i-count,target_i,target_j-count,target_j,N)){ 
		        printer(target_i-count,target_i,target_j-count,target_j,arr);
		        flag=true;
		    }
		    if(checker(target_i-count,target_i,target_j,target_j + count,N)){
		        printer(target_i-count,target_i,target_j,target_j+count,arr);
		        flag=true;
		    }
		    if(checker(target_i,target_i+count,target_j,target_j+count,N)){
		        printer(target_i,target_i+count,target_j,target_j+count,arr);
		        flag=true;
		    }
		    if(checker(target_i,target_i+count,target_j-count,target_j,N)){
		        printer(target_i,target_i+count,target_j-count,target_j,arr);
		        flag=true;
		    }
		    if(!flag){
		        break;
		    }
		    count++;
		}
	
	}
	
	static boolean checker(int st_index_i,int end_index_i,int st_index_j,int end_index_j,int N){
	    
	    if(st_index_i>=0 && end_index_i<N && st_index_j>=0 && end_index_j<N){
	        
	        return true;
	        
	    }
	    
	    return false;
	}
	
	static void printer(int st_index_i,int end_index_i,int st_index_j,int end_index_j,int matrix[][]){
	    
	    for(int i=st_index_i;i<=end_index_i;i++){
	        
	        for(int j=st_index_j;j<=end_index_j;j++){
	            
	            System.out.printf("%d ",matrix[i][j]);
	            
	        }
	        
	        System.out.println();
	        
	    }
	    
	}
}