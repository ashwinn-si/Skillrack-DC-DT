#Your code below
R, C = map(int,input().split())
matrix=[input().split() for i in range(R)]
totalSum = int(input())
missingCol = -1
missingRow = -1
for i in range(R):
    for j in range(C):
        if(matrix[i][j] == 'M'):
            missingCol = j
            missingRow = i
            break
    if(missingCol != -1):
        break
colSum = 0
for i in range(R):
    if(matrix[i][missingCol] != 'M'):
        colSum += int(matrix[i][missingCol])
matrix[missingRow][missingCol] = str(totalSum - colSum)
for i in range(R):
    print(*matrix[i])