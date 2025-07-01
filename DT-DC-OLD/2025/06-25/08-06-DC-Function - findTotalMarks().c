```
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int get_rows_count(int N , FILE *file_pointer){
    
    int rows_count = 0;
    
    char row_string[N];
    
    while(fgets(row_string , N , file_pointer) != NULL){
        rows_count++;
    }
    
    fclose(file_pointer);
    
    return rows_count;
}

int get_sum(char *row_string){
    
    int sum = 0;
    
    for(char *string_tokenizer = strtok(row_string , " ") ; (string_tokenizer != NULL) ; string_tokenizer = strtok(NULL , " ")){
        sum += atoll(string_tokenizer);
    }
    
    return sum;
}

void read_contents_from_file_and_fill_array(int choice , FILE *file_pointer , int M , int N , char names_array[M][N] , int total_marks_array[M]){
    
    char row_string[N];
    
    for(int index = 0 ; ((index < M) && (fgets(row_string , N , file_pointer) != NULL)) ; index++){
        
        if(choice == 1){
            sscanf(row_string , "%s" , names_array[index]);
        }else{
            total_marks_array[index] = get_sum(row_string);
        }
    }
    
    fclose(file_pointer);
}

void write_contents_to_file_from_arrays(FILE *file_pointer , int M , int N , char names_array[M][N] , int total_marks_array[M]){
    
    for(int index = 0 ; (index < M) ; index++){
        
        if(index < (M - 1)){
            fprintf(file_pointer , "%s %d\n" , names_array[index] , total_marks_array[index]);
        }else{
            fprintf(file_pointer , "%s %d" , names_array[index] , total_marks_array[index]);
        }
    }
    
    fclose(file_pointer);
}

void findTotalMarks(char *file_name_string_1 , char *file_name_string_2){
    
    int N = 100008;
    
    int M = get_rows_count(N , fopen(file_name_string_1 , "r"));
    
    char names_array[M][N];
    
    int total_marks_array[M];
    
    read_contents_from_file_and_fill_array(1 , fopen(file_name_string_1 , "r") , M , N , names_array , total_marks_array);
    
    read_contents_from_file_and_fill_array(2 , fopen(file_name_string_2 , "r") , M , N , names_array , total_marks_array);
    
    write_contents_to_file_from_arrays(fopen(file_name_string_1 , "w") , M , N , names_array , total_marks_array);
} // end of findTotalMarks function

void printFileContent(char *filename){
    
    FILE *fp = fopen(filename,"r");
    
    char ch;
    
    while((ch = fgetc(fp)) != EOF){
        printf("%c", ch);
    }
    
    fclose(fp);
} // end of printFileContent function

int main(){
    
    char file1name[31], file2name[31];
    
    scanf("%s\n%s", file1name, file2name);
    
    findTotalMarks(file1name, file2name);
    
    printf("Students and Total Marks:\n");
    
    printFileContent(file1name);
    
    return 0;
} // end of main function
```