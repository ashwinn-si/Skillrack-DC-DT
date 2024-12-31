#diagonal element accessing problem

def diagonal_check(diagonal):
    for i in range(1,len(diagonal)):
        if(diagonal[i-1]<diagonal[i]):
            return(False)
    else:
        return True
    
def diagonal_elements_accessing(curr_i,curr_j):
    curr_diagonal=[]
    while(curr_i>=0 and curr_i<rows and curr_j>=0 and curr_j<cols):
        curr_diagonal.append(matrix[curr_i][curr_j])
        curr_i-=1
        curr_j+=1
    if(not diagonal_check(curr_diagonal)):
        print("NO")
        quit()
        
rows,cols=map(int,input().split())
matrix=[]
for i in range(rows):
    matrix.append(input().strip().split())
#accessing the elements in bottom rows
for j in range(cols-1,-1,-1):
    diagonal_elements_accessing(rows-1,j)

#accessing the elements in first rows
for i in range(rows-2,-1,-1):
    diagonal_elements_accessing(i,0)

print("YES")

