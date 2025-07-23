'''The program must accept the a matrix and print the coloumn with the largest element in the matrix '''

rows,cols=map(int,input().split())
matrix=[list(map(int,input().split())) for i in range(rows)]
cols_val=[]
for i in range(rows):
    cols_val.append(matrix[i].index(max(matrix[i])))
cols_val=sorted(cols_val)
for i in range(rows):
    for j in range(cols_val[0],cols_val[-1]+1):
        if(j in cols_val):
            print(matrix[i][j],end=" ")
    print()