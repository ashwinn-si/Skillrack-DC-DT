#jagadish solution
R , C = map(int , input().split())

matrix = [list(map(int , input().split())) for i in range(0 , R)]

row_index , column_index , value = [(value - 1) if(index <= 1) else (value) for index , value in enumerate(map(int , input().split()))]

flattened_matrix_column_wise_list = []

for j in range(0 , C):
    
    column_wise_list = [matrix[i][j] for i in range(0 , R)]
    
    column_wise_list = (column_wise_list) if((j % 2) == 0) else (column_wise_list[::-1])
    
    ((column_wise_list.insert(row_index , value)) if((j % 2) == 0) else (column_wise_list.insert((R - row_index - 1) , value))) if(j == column_index) else ('')
    
    flattened_matrix_column_wise_list += column_wise_list

flattened_matrix_column_wise_list += ([-1] * (R - 1))

flattened_matrix_column_wise_list_index = 0

new_R , new_C = R , (C + 1)

new_matrix = [[-999 for j in range(0 , new_C)] for i in range(0 , new_R)]

for j in range(0 , new_C):
    
    column_wise_list = flattened_matrix_column_wise_list[flattened_matrix_column_wise_list_index : (flattened_matrix_column_wise_list_index + new_R)]
    
    column_wise_list = (column_wise_list) if((j % 2) == 0) else (column_wise_list[::-1])
    
    flattened_matrix_column_wise_list_index += new_R
    
    [new_matrix[i].__setitem__(j , column_wise_list[i]) for i in range(0 , new_R)]

[print(*row_list) for row_list in new_matrix]