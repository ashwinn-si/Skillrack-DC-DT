#jagadish code

def get_data(current_i , current_j , flattened_submatrix_list):
    
    return (sum(flattened_submatrix_list) , current_i , current_j , flattened_submatrix_list)

N = int(input())

matrix = [list(map(int , input().split())) for i in range(0 , N)]

K = int(input())

sorted_data_list = sorted([get_data(i , j , [matrix[k][l] for k in range(i , (i + K)) for l in range(j , (j + K))]) for i in range(0 , N , K) for j in range(0 , N , K)] , key = lambda quartet : (-quartet[0] , quartet[1] , quartet[2]))

submatrices_list = [data_list[3] for data_list in sorted_data_list]

submatrices_list_index = 0

for i in range(0 , N , K):
    
    for j in range(0 , N , K):
        
        flattened_submatrix_list = submatrices_list[submatrices_list_index]
        
        flattened_submatrix_list_index = 0
        
        submatrices_list_index += 1
        
        for k in range(i , (i + K)):
            
            for l in range(j , (j + K)):
                
                matrix[k][l] = flattened_submatrix_list[flattened_submatrix_list_index]
                
                flattened_submatrix_list_index += 1

[print(*row_list) for row_list in matrix]