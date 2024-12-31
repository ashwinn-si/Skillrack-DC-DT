import java.util.*;
public class Hello {
    public static boolean rows_checker(int curr_row,int curr_col, int size,int matrix[][]){
        for(int i=curr_row;i<curr_row+size;i++){
            for(int j=curr_col;j<curr_col+size-1;j++){
                if(matrix[i][j]>matrix[i][j+1]){
                    return (false);
                }
            }
        }
        return true;
    }
    public static boolean cols_checker(int curr_row,int curr_col,int size,int matrix[][]){
        for(int j=curr_col;j<curr_col+size;j++){
            for(int i=curr_row;i<curr_row+size-1;i++){
                if(matrix[i][j]>matrix[i+1][j]){
                    return(false);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int rows,cols;
		rows=sc.nextInt();
		cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
		    for(int j=0;j<cols;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int check_matrix_size=sc.nextInt();
		int flag=1;
		for(int i=0;i<rows-check_matrix_size+1;i++){
		    for(int j=0;j<cols-check_matrix_size+1;j++){
		        if(rows_checker(i,j,check_matrix_size,matrix) && cols_checker(i,j,check_matrix_size,matrix)){
		            System.out.printf("YES");
		            flag=0;
		            break;
		        }
		    }
		    if(flag==0){
		        break;
		    }
		}
		if(flag==1){
		    System.out.printf("NO");
		}
		

	}
}
