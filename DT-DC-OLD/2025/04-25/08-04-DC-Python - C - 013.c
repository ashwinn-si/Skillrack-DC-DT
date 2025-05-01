//jagadish code

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define jagadish_DC main

int jagadish_DC(){
    
    int N;
    
    scanf("%d\n" , &N);
    
    for(int i = 0 ; (i < N) ; i++){
        
        char *input_string = (char *) malloc((1008 * sizeof(char)));
        
        scanf("%[^\n]\n" , input_string);
        
        char *string_tokenizer = strtok(input_string , " ");
        
        int row_length = 0;
        
        int row_sum = 0;
        
        while(string_tokenizer != NULL){
            
            row_length++;
            
            row_sum += atoi(string_tokenizer);
            
            string_tokenizer = strtok(NULL , " ");
        }
        
        printf("%d %d\n" , row_length , row_sum);
    }
    
    return 0;
}