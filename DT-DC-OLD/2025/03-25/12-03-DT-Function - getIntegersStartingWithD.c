/*Jagadish bro code*/

/*
The function/method getlntegersStartingWithD accepts three arguments - SIZE, arr and D, an integer
representing the size of the array arr, the integer array arr and an integer representing a digit D.
The function/method getlntegersStartingWithD must return an array of integers containing the integers
starting with the digit D in the given array. If there is no such integer in the given array, then the function
must return an array of size 1 with the value -1.
*/

#include <math.h>

int get_length(int N)
{

    return (((int)log10(N)) + 1);
}

int get_first_digit(int N)
{

    return (N / pow(10, (get_length(N) - 1)));
}

boundedArray *getIntegersStartingWithD(int N, int array[], int D)
{

    int *new_array = (int *)malloc((N * (sizeof(int))));

    int new_array_index = 0;

    for (int index = 0; (index < N); index++)
    {

        if (get_first_digit(array[index]) == D)
        {

            new_array[new_array_index++] = array[index];
        }
    }

    (new_array_index == 0) ? (new_array[new_array_index++] = -1) : (printf(""));

    boundedArray *new_bounded_array_reference = (boundedArray *)malloc(sizeof(boundedArray));

    new_bounded_array_reference->arr = new_array;

    new_bounded_array_reference->SIZE = new_array_index;

    return new_bounded_array_reference;
}