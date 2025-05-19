'''
In a game, there are (N*(N+1))/2 boxes arranged as a triangle based on the following conditions.
- N boxes in the Nth row.
- N-1 boxes in the (N-l)th row.
- N-2 boxes in the (N-2)th row.
- N-3 boxes in the (N-3)th row.
- Similarly, the remaining boxes are arranged as a triangle.
Each box contains a certain number of balls. The number of balls in each box is passed as the input. The program must
print the maximum number of balls that can be collected from the boxes based on the following condition.
- The only box in the 1st row must be picked. For the remaining rows, one of the two adjacent boxes in the next row to
the previously selected box must be picked.

Input:
4
***3
**6 9
*7 6 9
5 2 9 4

Output:
23
'''

N = int(input())
matrix = []
for i in range(N):
    matrix.append(list(map(int, input().strip()[N - i - 1:].split(" "))))
for row in range(N):
    for col in range(row + 1):
        if(row == 0):
            break
        if(col == 0):
            matrix[row][col] = (matrix[row][col] + matrix[row - 1][col])
        elif(col == row):
            matrix[row][col] = matrix[row][col] + matrix[row-1][col - 1]
        else:
            matrix[row][col] = max(matrix[row][col] + matrix[row - 1][col - 1], matrix[row][col] + matrix[row - 1][col])
print(max(matrix[N - 1]))