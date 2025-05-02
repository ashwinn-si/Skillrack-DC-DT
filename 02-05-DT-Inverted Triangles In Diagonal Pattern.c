/*
Inverted Triangles in Diagonal Pattern
The program must accept an integer N as the input. The program must print N inverted triangles of asterisks based on
the following conditions.
- The program must print an inverted triangle of asterisks of size 2 in the first two lines.
- Then the program must print an inverted triangle of asterisks of size 3 in the next 3 lines diagonally.
- Then the program must print an inverted triangle of asterisks of size 4 in the next 4 lines diagonally.
- Similarly, the program must print the remaining triangles diagonally as the output.
- The program must print hyphens instead of empty spaces before each line.


Input:
4

Output:
* * 
-* 
--* * * 
---* * 
----* 
-----* * * * 
------* * * 
-------* * 
--------* 
---------* * * * * 
----------* * * * 
-----------* * * 
------------* * 
-------------* 
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int N;
    scanf("%d", &N);
    int currTriangleCount = 0;
    int noEmptySpaces = 0;
    int stValue = 2;
    
    while(currTriangleCount < N){
        for(int row = 0; row < stValue; row++){
            //printing the empty spaces
            for(int a = 0; a < noEmptySpaces ; a++){
                printf("-");
            }
            //printing the stars
            
            int noStars = stValue - row;
            for(int a = 0; a < noStars ; a++){
                printf("* ");
            }
            printf("\n");
            noEmptySpaces++;
        }
        currTriangleCount++;
        stValue++;
    }
}