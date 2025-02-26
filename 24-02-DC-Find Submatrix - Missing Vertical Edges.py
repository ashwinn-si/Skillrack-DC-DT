R, C = map(int, input().split())

matrix1 = [list(map(int, input().strip().split())) for _ in range(R)]

matrix2 = [list(map(int, input().strip().split())) for _ in range(R)]

# Find the row that is less in length
rowIndex = -1
endRowIndex = -1
for i in range(R):
    if len(matrix1[i]) != C:
        if rowIndex == -1:
            rowIndex = i
        endRowIndex = i

# Find the left missing edge
leftEdgeIndex = -1
for j in range(C - 1):
    if matrix1[rowIndex][j] != matrix2[rowIndex][j]:
        leftEdgeIndex = j
        break

# Find the right missing edge
rightEdgeIndex = -1
for j in range(C - 2, -1, -1):
    if matrix1[rowIndex][j] != matrix2[rowIndex][j]:
        rightEdgeIndex = j
        break

for i in range(rowIndex, endRowIndex + 1):
    print(matrix2[i][leftEdgeIndex], matrix1[i][rightEdgeIndex])