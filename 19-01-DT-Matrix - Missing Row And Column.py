#jagadish solution

def get_flattened_matrix(R , C , matrix):
    
    return [matrix[i][j] for i in range(0 , R) for j in range(0 , C)]

R , C = map(int , input().split())

matrix_1 = [list(map(int , input().split())) for i in range(0 , (R - 1))]

row_list = list(map(int , input().split()))

column_list = list(map(int , input().split()))

common_value = list((set(row_list) & set(column_list)))[0]

row_index = column_list.index(common_value)

column_index = row_list.index(common_value)

matrix_2 = [[-999 for j in range(0 , C)] for i in range(0 , R)]

matrix_2[row_index] = row_list

[matrix_2[i].__setitem__(column_index , column_list[i]) for i in range(0 , R)]

flattened_matrix_1 = get_flattened_matrix((R - 1) , (C - 1) , matrix_1)

flattened_matrix_1_index = 0

flattened_matrix_2 = get_flattened_matrix(R , C , matrix_2)

for flattened_matrix_2_index in range(0 , (R * C)):
    
    if(flattened_matrix_2[flattened_matrix_2_index] == -999):
        
        flattened_matrix_2[flattened_matrix_2_index] = flattened_matrix_1[flattened_matrix_1_index]
        
        flattened_matrix_1_index += 1

[(print(value)) if(((index + 1) % C) == 0) else (print(value , end = " ")) for index , value in enumerate(flattened_matrix_2)]