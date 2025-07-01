```
#include <math.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct BoundedArray{
    
    int SIZE;
    
    long long int *arr;
} boundedArray;

int get_length_of_number(int N){
    
    return ((N == 0) ? (1) : (((int) log10(abs(N))) + 1));
}

boundedArray* concatEveryTwoIntegers(int N , int *array){
    
    int M = (N / 2);
    
    long long int *new_array = ((long long int *) malloc((M * sizeof(long long int))));
    
    for(int new_array_index = 0 , index = 0 ; (index < N) ; new_array_index += 1 , index += 2){
        
        int number_1 = array[index];
        
        int number_2 = array[(index + 1)];
        
        new_array[new_array_index] = ((number_1 * ((long) pow(10 , get_length_of_number(number_2)))) + number_2);
    }
    
    boundedArray *bounded_array_reference = ((boundedArray *) malloc(sizeof(boundedArray)));
    
    (bounded_array_reference -> SIZE) = M;
    
    (bounded_array_reference -> arr) = new_array;
    
    return bounded_array_reference;
}

int main(){
    
    int SIZE;
    
    scanf("%d", &SIZE);
    
    int arr[SIZE];
    
    for(int index = 0; index < SIZE; index++){
        scanf("%d", &arr[index]);
    }
    
    boundedArray *bArr = concatEveryTwoIntegers(SIZE, arr);
    
    printf("Array: ");
    
    for(int index = 0; index < bArr->SIZE; index++){
        printf("%lld ", bArr->arr[index]);
    }
    
    return 0;
}
```