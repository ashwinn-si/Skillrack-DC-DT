//jagadish solution

int is_having_unique_digits(int N)
{

    int digits_frequency_array[10] = {0};

    for (int number = N; (number > 0); number = (number / 10))
    {

        int digit = (number % 10);

        digits_frequency_array[digit]++;
    }

    for (int digit = 0; (digit <= 9); digit++)
    {

        if (digits_frequency_array[digit] > 1)
        {

            return 0;
        }
    }

    return 1;
}

boundedArray *getIntegersWithUniqueDigits(int N, int array[])
{

    int *answer_array = (int *)malloc((N * sizeof(int)));

    int answer_array_index = 0;

    for (int i = 0; (i < N); i++)
    {

        if (is_having_unique_digits(array[i]))
        {

            answer_array[answer_array_index++] = array[i];
        }
    }

    (answer_array_index == 0) ? (answer_array[answer_array_index++] = -1) : (printf(""));

    boundedArray *bounded_array_reference = (boundedArray *)malloc(sizeof(boundedArray *));

    bounded_array_reference->SIZE = answer_array_index;

    bounded_array_reference->arr = answer_array;

    return bounded_array_reference;
}
