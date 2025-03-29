/*
The function/method mergeEven accepts four arguments M, arrl, N and arr2. M represents the size of the
integer array arrl. N represents the size of the integer array arr2. The array arr2 contains only even integers
and the size of arr2 is equal to the number of even integers in arrl.
The function/method mergeEven must form a new array by merging the given two arrays so that each
integer in the array arr2 occurs after the occurrence of the corresponding even integer in the array arrl.
Then the function must return the new array.
Your task is to implement the function mergeEven so that it passes all the test cases.
IMPORTANT: Do not write the main() function as it is already defined.

Input:
12 45 78 56 23 10
100 200 300 400

Output:
Array 1: 12 45 78 56 23 10
Array 2: 100 200 300 400
Merged Array: 12 100 45 78 200 56 300 23 10 400

Explanation:
Here M = 6 and N = 4.
The integers in the ISt array are 12, 45, 78, 56, 23 and 10.
The integers in the 2nd array are 100, 200, 300 and 400.
After merging the two arrays based on the given conditions, the merged array contains
12 100 45 78 200 56 300 23 10 400
100 occurs after the ISt even integer in the first array.
200 occurs after the 2nd even integer in the first array.
300 occurs after the 3rd even integer in the first array.
400 occurs after the 4th even integer in the first array.
*/

int is_even(int N)
{

    return ((N % 2) == 0);
}

int *mergeEven(int array_1_size, int *array_1, int array_2_size, int *array_2)
{

    int N = (array_1_size + array_2_size);

    int *new_array = (int *)malloc((N * sizeof(int *)));

    int new_array_index = 0;

    for (int array_1_index = 0, array_2_index = 0; (array_1_index < array_1_size); array_1_index++)
    {

        if (is_even(array_1[array_1_index]))
        {
            new_array[new_array_index++] = array_1[array_1_index];
            new_array[new_array_index++] = array_2[array_2_index++];
        }
        else
        {
            new_array[new_array_index++] = array_1[array_1_index];
        }
    }

    return new_array;
}