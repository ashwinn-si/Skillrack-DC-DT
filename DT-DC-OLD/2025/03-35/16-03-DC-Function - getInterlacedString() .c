//jagadish code

/*
The function/method getlnterlacedString accepts four arguments - X, Y, chl and ch2. X and Y represent
two integer values. chl and ch2 represent two characters.
The function/method getlnterlacedString must form a string of length X+Y based on the following
conditions.
- The character chl must occur X times in the string.
- The character ch2 must occur Y times in the string.
- The characters chl and ch2 must be interlaced alternatively in the string.
Finally, the function must return the string value.
Your task is to implement the function getlnterlacedString so that it passes all the test cases.
IMPORTANT: Do not write the main() function as it is already defined.

Input:
5 5
a b

Output:
ababababab
*/

char *getInterlacedString(int X, int Y, char character_1, char character_2)
{

    int N = (X + Y);

    char *string = (char *)malloc((N * sizeof(char)));

    for (int i = 1; ((i <= N) && (X > 0) && (Y > 0)); i++)
    {

        ((i & 1) != 0) ? (strncat(string, &character_1, 1)) : (strncat(string, &character_2, 1));

        ((i & 1) != 0) ? (X--) : (Y--);
    }

    while (X > 0)
    {
        strncat(string, &character_1, 1);
        X--;
    }

    while (Y > 0)
    {
        strncat(string, &character_2, 1);
        Y--;
    }

    return string;
}