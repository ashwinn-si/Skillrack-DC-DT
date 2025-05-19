#jagadish Code
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void transposeMatrix(char *file_name_string){
    
    int N = 1000008;
    
    int R_1 = 0;
    
    int C_1 = 0;
    
    FILE *file_pointer_1 = fopen(file_name_string , "r");
    
    char row_string[N];
    
    while(fgets(row_string , N , file_pointer_1) != NULL){
        
        R_1++;
        
        if(C_1 == 0){
            
            char *string_tokenizer = strtok(row_string , " ");
            
            while(string_tokenizer != NULL){
                
                string_tokenizer = strtok(NULL , " ");
                
                C_1++;
            }
        }
    }
    
    int matrix[R_1][C_1];
    
    fclose(file_pointer_1);
    
    FILE *file_pointer_2 = fopen(file_name_string , "r");
    
    for(int i = 0 ; ((i < R_1) && (fgets(row_string , N , file_pointer_2) != NULL)) ; i++){
        
        char *string_tokenizer = strtok(row_string , " ");
        
        for(int j = 0 ; ((j < C_1) && (string_tokenizer != NULL)) ; j++ , string_tokenizer = strtok(NULL , " ")){
            matrix[i][j] = atoi(string_tokenizer);
        }
    }
    
    fclose(file_pointer_2);
    
    int R_2 = C_1;
    
    int C_2 = R_1;
    
    int transposed_matrix[R_2][C_2];
    
    for(int i = 0 ; (i < R_1) ; i++){
        
        for(int j = 0 ; (j < C_1) ; j++){
            
            transposed_matrix[j][i] = matrix[i][j];
        }
    }
    
    FILE *file_pointer_3 = fopen(file_name_string , "w");
    
    for(int i = 0 ; (i < R_2) ; i++){
        
        for(int j = 0 ; (j < C_2) ; j++){
            
            (j == (C_2 - 1)) ? (fprintf(file_pointer_3 , "%d\n" , transposed_matrix[i][j])) : (fprintf(file_pointer_3 , "%d " , transposed_matrix[i][j]));
        }
    }
    
    fclose(file_pointer_3);
} // end of transposeMatrix function

void printFileContent(char *fileName){
    
    FILE *fp = fopen(fileName, "r");
    
    char ch;
    
    while((ch = fgetc(fp)) != EOF){
        printf("%c", ch);
    }
    
    fclose(fp);
}// end of printFileContent function

int main(){
    
    char fileName[31];
    
    scanf("%s", fileName);
    
    transposeMatrix(fileName);
    
    printf("Transpose Matrix:\n");
    
    printFileContent(fileName);
    
    return 0;
}// end of main function
