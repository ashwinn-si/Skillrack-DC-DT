#jagadish bro solution

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int is_odd(int N){
    
    return ((N & 1) != 0);
}

void readMatrixFromFile(char file_name_string[]){
    
    FILE *file_pointer = fopen(file_name_string , "r");
    
    int R;
    
    int C;
    
    int N = 10008;
    
    fscanf(file_pointer , "%d %d\n" , &R , &C);
    
    char ***matrix = ((char ***) malloc((R * sizeof(char **))));
    
    for(int i = 0 ; (i < R) ; i++){
        
        matrix[i] = ((char **) malloc((C * sizeof(char *))));
        
        for(int j = 0 ; (j < C) ; j++){
            matrix[i][j] = ((char *) malloc((N * sizeof(char))));
        }
    }
    
    char *row_string = ((char *) malloc((N * sizeof(char))));
    
    for(int row_index = 0 ; ((row_index < R) && (fscanf(file_pointer , "%[^\n]\n" , row_string) == 1)) ; row_index++){
        
        char *string_tokenizer = strtok(row_string , " ");
        
        for(int column_index = 0 ; ((column_index < C) && (string_tokenizer != NULL)) ; column_index++ , string_tokenizer = strtok(NULL , " ")){
            sprintf(matrix[row_index][column_index] , "%s" , string_tokenizer);
        }
    }
    
    if(isdigit(matrix[0][0][0])){
        
        for(int j = 0 ; (j < C) ; j++){
            
            long column_sum = 0;
            
            for(int i = 0 ; (i < R) ; i++){
                column_sum += atol(matrix[i][j]);
            }
            
            printf("%ld " , column_sum);
        }
    }else{
        
        for(int i = 0 ; (i < R) ; i++){
            
            for(int j = 0 ; (j < C) ; j++){
                
                if(is_odd((j + 1))){
                    
                    printf("%c " , matrix[i][j][0]);
                }
            }
            
            printf("\n");
        }
    }
}

int main(){
    
    char fileName[101];
    
    scanf("%s" , fileName);
    
    readMatrixFromFile(fileName);
    
    return 0;
}
