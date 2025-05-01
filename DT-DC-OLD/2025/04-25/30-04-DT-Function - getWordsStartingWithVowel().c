#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct BoundedArray{
    
    int SIZE;
    
    char **words;
} boundedArray;

int is_vowel(char character){
    
    char *vowels_string = "aeiouAEIOU";
    
    int index = (strchr(vowels_string , character) - vowels_string);
    
    return ((index >= 0) && (index <= 9));
}

boundedArray* getWordsStartingWithVowel(char string[]){
    
    char **strings_array = (char **) malloc((100008 * sizeof(char *)));
    
    for(int i = 0 ; (i < 100008) ; i++){
        strings_array[i] = (char *) malloc((100008 * sizeof(char)));
    }
    
    int strings_array_index = 0;
    
    char *string_tokenizer = strtok(string , " ");
    
    while(string_tokenizer != NULL){
        
        (is_vowel(string_tokenizer[0])) ? (strcpy(strings_array[strings_array_index++] , string_tokenizer)) : (printf(""));
        
        string_tokenizer = strtok(NULL , " ");
    }
    
    (strings_array_index == 0) ? (sprintf(strings_array[strings_array_index++] , "-1")) : (printf(""));
    
    boundedArray *bounded_array_reference = (boundedArray *) malloc(sizeof(boundedArray *));
    
    bounded_array_reference -> SIZE = strings_array_index;
    
    bounded_array_reference -> words = strings_array;
    
    return bounded_array_reference;
}

int main(){
    
    char str[1001];
    
    scanf("%[^\n]", str);

    boundedArray *bArr = getWordsStartingWithVowel(str);

    for(int index = 0; index < bArr->SIZE; index++){
        printf("%s\n", bArr->words[index]);
    }
    
    return 0;
}
