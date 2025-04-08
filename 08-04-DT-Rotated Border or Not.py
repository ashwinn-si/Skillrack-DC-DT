#Your code below
def helper():
    global matrix1_boundary, matrix2_boundary
    for i in range(0, C):
        matrix1_boundary.append(matrix1[0][i])
        matrix2_boundary.append(matrix2[0][i])
    for i in range(1, R):
        matrix1_boundary.append(matrix1[i][C - 1])
        matrix2_boundary.append(matrix2[i][C - 1])
    for i in range(C - 2, -1, -1):
        matrix1_boundary.append(matrix1[R-1][i])
        matrix2_boundary.append(matrix2[R-1][i])
    for i in range(R - 2, 0, -1):
        matrix1_boundary.append(matrix1[i][0])
        matrix2_boundary.append(matrix2[i][0])

R, C =  map(int, input().split())
matrix1 = [list(map(int, input().split())) for i in range(R)]
matrix2 = [list(map(int, input().split())) for i in range(R)]
matrix1_boundary = []
matrix2_boundary = []
helper()
length = len(matrix1_boundary)
for i in range(length):
    if(matrix1_boundary == matrix2_boundary):
        print("YES")
        quit()
    last = matrix1_boundary.pop()
    matrix1_boundary.insert(0, last)
print("NO")