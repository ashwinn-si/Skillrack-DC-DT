#Your code below
R , C = map(int,input().split())
matrix = [input().split() for i in range(R)]
count = 1
for i in range(R):
    if( i % 2 == 0):
        print(''.join(j for j in matrix[i][:count if (count < C ) else C]))
    else:
        print(''.join(j for j in matrix[i][C-count if(C - count > 0) else 0:]))
    count+=1