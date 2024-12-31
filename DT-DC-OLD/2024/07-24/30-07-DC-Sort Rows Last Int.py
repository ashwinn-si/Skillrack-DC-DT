rows,cols=map(int,input().split())
matrix=[list(map(int,input().split())) for i in range(rows)]
for R in sorted(matrix,key=lambda x:x[cols-1]):
    print(*R)