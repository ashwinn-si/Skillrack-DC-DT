//jagadish bro codee

#include <stdio.h>
#include <stdlib.h>
#define jagadish_DT main

void swap(int i_1 , int j_1 , int i_2 , int j_2 , int R , int C , int matrix[R][C]){
    
    matrix[i_1][j_1] = (matrix[i_1][j_1] ^ matrix[i_2][j_2]);
    
    matrix[i_2][j_2] = (matrix[i_1][j_1] ^ matrix[i_2][j_2]);
    
    matrix[i_1][j_1] = (matrix[i_1][j_1] ^ matrix[i_2][j_2]);
}

void traverse_and_swap_borders(int starting_i_1 , int ending_i_1 , int starting_j_1 , int ending_j_1 , int starting_i_2 , int ending_i_2 , int starting_j_2 , int ending_j_2 , int R , int C , int matrix[R][C]){
    
    for(int j_1 = starting_j_1 , j_2 = starting_j_2 ; ((j_1 <= ending_j_1) && (j_2 <= ending_j_2)) ; j_1++ , j_2++){
        swap(starting_i_1 , j_1 , starting_i_2 , j_2 , R , C , matrix);
    }
    
    for(int i_1 = (starting_i_1 + 1) , i_2 = (starting_i_2 + 1) ; ((i_1 <= ending_i_1) && (i_2 <= ending_i_2)) ; i_1++ , i_2++){
        swap(i_1 , ending_j_1 , i_2 , ending_j_2 , R , C , matrix);
    }
    
    for(int j_1 = (ending_j_1 - 1) , j_2 = (ending_j_2 - 1) ; ((j_1 >= starting_j_1) && (j_2 >= starting_j_2)) ; j_1-- , j_2--){
        swap(ending_i_1 , j_1 , ending_i_2 , j_2 , R , C , matrix);
    }
    
    for(int i_1 = (ending_i_1 - 1) , i_2 = (ending_i_2 - 1) ; ((i_1 > starting_i_1) && (i_2 > starting_i_2)) ; i_1-- , i_2--){
        swap(i_1 , starting_j_1 , i_2 , starting_j_2 , R , C , matrix);
    }
}

int jagadish_DT(){
    
    int R;
    
    int C;
    
    scanf("%d %d\n" , &R , &C);
    
    int matrix[R][C];
    
    for(int i = 0 ; (i < R) ; i++){
        
        for(int j = 0 ; (j < C) ; j++){
            
            scanf("%d " , &matrix[i][j]);
        }
    }
    
    traverse_and_swap_borders(0 , ((R / 2) - 1) , 0 , ((C / 2) - 1) , (R / 2) , (R - 1) , (C / 2) , (C - 1) , R , C , matrix);
    
    traverse_and_swap_borders((R / 2) , (R - 1) , 0 , ((C / 2) - 1) , 0 , ((R / 2) - 1) , (C / 2) , (C - 1) , R , C , matrix);
    
    for(int i = 0 ; (i < R) ; ((i < (R - 1)) ? (printf("\n")) : ("")) , i++){
        
        for(int j = 0 ; (j < C) ; j++){
            
            printf("%d " , matrix[i][j]);
        }
    }
    
    return 0;
}