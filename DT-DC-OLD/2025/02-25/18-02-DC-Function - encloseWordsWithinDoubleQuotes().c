#include <stdlib.h>
#include <string.h>

char* encloseWordsWithinDoubleQuotes(char string_S[] , char string_W[]){
    
    int N = strlen(string_S);
    
    char *new_string_S = (char *) malloc((sizeof(char) * (N * 2)));
    
    char *string_tokenizer = strtok(string_S , " ");
    
    while(string_tokenizer != NULL){
        
        char temp_string[strlen(string_tokenizer)];
        
        (strcmp(string_tokenizer , string_W) == 0) ? (sprintf(temp_string , "\"%s\" " , string_tokenizer)) : (sprintf(temp_string , "%s " , string_tokenizer));
        
        strcat(new_string_S , temp_string);
        
        string_tokenizer = strtok(NULL , " ");
    }
    
    return new_string_S;
}