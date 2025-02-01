#Your code below
def helper(matrix,X,R,C):
    res = []
    for i in range(0,R-X+1):
        for j in range(0,C-X+1):
            curr_matrix=[]
            for k in range(i,i+X):
                curr_row =[]
                for l in range(j,j+X):
                    curr_row.append(matrix[k][l])
                curr_matrix.append(curr_row)
            res.append(curr_matrix)
    return res
R1 , C1 = map(int , input().split())
matrix1 = [list(map(int,input().split())) for i in range(R1)]
R2 , C2 = map(int,input().split())
matrix2 = [list(map(int,input().split())) for i in range(R2)]
X = int(input())
sub1 = helper(matrix1 , X , R1, C1)
sub2 = helper(matrix2 , X , R2 ,C2)
for i in sub1:
    for j in sub2:
        if( i == j):
            for k in i:
                print(*k)
            quit()
print("-1")