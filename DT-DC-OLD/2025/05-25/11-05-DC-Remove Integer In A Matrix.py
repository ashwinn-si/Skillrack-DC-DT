'''
The program must accept an integer matrix of size R*C and the position of a cell (X, Y) in the matrix as the input. The
program must remove the integer at the given position (X, Y) based on the following conditions.
- The program must consider the given matrix in vertical zig-zag fashion(starting from the top-left cell) when removing
the integer (i.e., After removing the integer in the matrix, all the values that occur after the given position must be shifted
by one position in the vertical zig-zag direction).
- The empty cell in the last column of the revised matrix must be filled with -1.
Finally, the program must print the revised R*C matrix as the output.

Input:
4 5
12 22 14 83 18
28 19 46 50 11
66 71 39 87 82
57 51 36 52 60
3 3

Output:
12 22 14 18 11
28 19 46 83 82
66 71 36 50 60
57 51 52 87 -1
'''

#Your code below
R, C = map(int, input().split())
matrix = [list(map(int, input().split())) for i in range(R)]
TR, TC = map(int , input().split())
zig_zag_pattern = []
for j in range(C):
    if(j % 2  == 0):
        for i in range(R):
            if(i != TR - 1 or j != TC - 1):
                zig_zag_pattern.append(matrix[i][j])
    else:
        for i in range(R-1, -1, -1):
            if(i != TR - 1 or j != TC - 1):
                zig_zag_pattern.append(matrix[i][j])
zig_zag_pattern.append(-1)
index = 0
for j in range(C):
    if(j % 2 == 0):
        for i in range(R):
            matrix[i][j] = zig_zag_pattern[index]
            index += 1
    else:
        for i in range(R-1 , -1, -1):
            matrix[i][j] = zig_zag_pattern[index]
            index += 1
for i in range(R):
    print(*matrix[i])