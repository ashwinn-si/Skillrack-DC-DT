#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct BoundedArray{
    
    int SIZE;
    
    char **words;
} boundedArray;

boundedArray* customSplit(char *string , char delimiter_character){
    
    int N = strlen(string);
    
    char **word_strings_array = ((char **) malloc((N * sizeof(char *))));
    
    for(int i = 0 ; (i < N) ; i++){
        word_strings_array[i] = ((char *) malloc((N * sizeof(char))));
    }
    
    char *delimiter_string = ((char *) malloc((2 * sizeof(char))));
    
    sprintf(delimiter_string , "%c\0" , delimiter_character);
    
    int word_strings_array_index = 0;
    
    for(char *string_tokenizer = strtok(string , delimiter_string) ; (string_tokenizer != NULL) ; string_tokenizer = strtok(NULL , delimiter_string)){
        sprintf(word_strings_array[word_strings_array_index++] , "%s" , string_tokenizer);
    }
    
    boundedArray *bounded_array_reference = ((boundedArray *) malloc(sizeof(boundedArray)));
    
    bounded_array_reference -> SIZE = word_strings_array_index;
    
    bounded_array_reference -> words = word_strings_array;
    
    return bounded_array_reference;
}

int main(){
    
    char str[1001], delimiter;
    
    scanf("%s\n%c", str, &delimiter);
    
    boundedArray *bArr = customSplit(str, delimiter);
    
    printf("Words:\n");
    
    for(int index = 0 ; index < bArr->SIZE ; index++){
        printf("%s\n", bArr->words[index]);
    }
    
    return 0;
}