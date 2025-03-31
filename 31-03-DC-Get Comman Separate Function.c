/*Jagadish Solutiongi */
/*
The function/method getCommaSeparatedValues accepts two arguments SIZE and arr. SIZE represents
the size of the integer array arr.
The function/method getCommaSeparatedValues must return a string representing the comma separated
integer values in the given array.
Your task is to complete the code in the function getCommaSeparatedValues so that it passes all the test
cases.
Note: The size of the given array is always valid so that the length of the comma separated values do not
exceed 100.
IMPORTANT: Do not write the main() function as it is already defined.

Input:
5
12 854 7 6654 22
Output:
csv: 12,854,7,6654,22
*/

char *getCommaSeparatedValues(int N, int array[])
{

    char *csv_string = (char *)malloc(((1008 * N) + N));

    for (int index = 0; (index < N); index++)
    {
        (index == 0) ? (sprintf(csv_string, "%s%d", csv_string, array[index])) : (sprintf(csv_string, "%s,%d", csv_string, array[index]));
    }

    return csv_string;
}