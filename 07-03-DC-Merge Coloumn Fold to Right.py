'''
An integer matrix with R rows and C columns is passed as the input. The programs must fold the matrix towards the
right starting from Nth column and merge(add the cell values) the overlapping column values. Then the program must
print the resulting matrix.

Input:
3 5
1 2 3 4 5
2 4 6 8 2
10 20 30 40 50
4

Output:
9 3 2 1
10 6 4 2
90 30 20 10
'''

#Your code below
R, C = map(int, input().split())
matrix = [list(map(int, input().split())) for i in range(R)]
foldIndex = int(input()) - 1
pointer1 = foldIndex
pointer2 = foldIndex + 1
while(pointer2 < C and pointer1 >= 0):
    for i in range(R):
        matrix[i][pointer1] += matrix[i][pointer2]
    pointer1 -= 1
    pointer2 += 1
for i in range(R):
    for j in range(foldIndex, -1, -1):
        print(matrix[i][j], end= " ")
    for j in range(pointer2, C, 1):
        print(matrix[i][j], end=" ")
    print()