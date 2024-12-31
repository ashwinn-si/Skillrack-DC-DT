#Your code below
import copy
def helper(X , Y , R , C):
    for pos in [[X+1,Y],[X-1,Y],[X,Y-1],[X,Y+1],[X+1,Y+1],[X-1,Y-1],[X-1,Y+1],[X+1,Y-1]]:
        if(0 <= pos[0] and pos[0] < R and pos[1] >= 0 and pos[1] <C):
            res[pos[0]][pos[1]] = 'W'
R , C = map(int,input().split())
matrix = [input().split() for i in range(R)]
res = copy.deepcopy(matrix)
for i in range(R):
    for j in range(C):
        if(matrix[i][j] == 'W'):
            helper(i , j , R , C)
count = 0
for i in range(R):
    for j in range(C):
        if(res[i][j] == 'W'):
            count+=1
    
print("YES" if(count == R*C) else R*C - count)