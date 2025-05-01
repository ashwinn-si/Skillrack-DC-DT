'''
The program must accept a matrix of size 5*5 representing a 12-hour analog clock where the 12 numbers
are misplaced. The program also accepts two integers NI and N2, where NI represents the number pointed
by the hour handle in the given clock and N2 represents the number pointed by the minute handle in the
given clock. The program must find the original time for the given values NI, N2 and print the original time in
the format HH:MM as the output.
The 5*5 matrix representation of the original clock is given below. The asterisks in the clock represent the
empty spaces.
* 11 12 1 *
10 * * * 2
9 * * * 3
8 * * * 4
* 7 6 5 *

Input:
* 8 9 11 *
3 * * * 5
6 * * * 7
4 * * * 1
* 2 12 10 *
8 10

Output:
11:25
'''

#Your code below
clockValue = {
    (0, 1) : [11, 55],
    (0, 2) : [12, 0],
    (0, 3) : [1, 5],
    (1, 0) : [10, 50],
    (1, 4) : [2, 10],
    (2, 0) : [9, 45],
    (2, 4) : [3, 15],
    (3, 0) : [8, 40],
    (3, 4) : [4, 20],
    (4, 1) : [7, 35],
    (4, 2) : [6, 30],
    (4, 3) : [5, 25]
}

matrix = [input().strip().split() for i in range(5)]
hrHand, minHand = input().split()
hrRes, minRes = 0 ,0
for i in range(5):
    for j in range(5):
        if(matrix[i][j] == hrHand):
            hrRes = clockValue[(i, j)][0]
        if(matrix[i][j] == minHand):
            minRes = clockValue[(i, j)][1]
print(f"{hrRes:02d}:{minRes:02d}")