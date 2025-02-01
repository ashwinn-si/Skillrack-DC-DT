#jagadish code
def find_missing_column(list_1 , list_2):
    
    index_1 = 0
    
    N = len(list_1)
    
    index_2 = 0
    
    M = len(list_2)
    
    missing_indices_list = []
    
    while(index_1 < N):
        
        if((index_2 < M) and (list_1[index_1] == list_2[index_2])):
            index_1 += 1
            index_2 += 1
        else:
            missing_indices_list.append(index_1)
            index_1 += 1
    
    return missing_indices_list

R , C = map(int , input().split())

matrix_1 = [list(map(int , input().split())) for i in range(0 , R)]

matrix_2 = [list(map(int , input().split())) for i in range(0 , R)]

starting_row = -999

ending_row = -999

for i in range(0 , R):
    
    N = len(matrix_1[i])
    
    starting_row = (i) if((starting_row == -999) and (N != C)) else (starting_row)
    
    ending_row = (i) if(N != C) else (ending_row)

starting_column , ending_column = find_missing_column(matrix_1[(starting_row + 1)] , matrix_2[(starting_row + 1)])

flag_matrix = [[False for j in range(0 , C)] for i in range(0 , R)]

for i in range(starting_row , (ending_row + 1)):
    
    flag_matrix[i][starting_column] = True
    
    flag_matrix[i][ending_column] = True

for j in range(starting_column , (ending_column + 1)):
    
    flag_matrix[starting_row][j] = True
    
    flag_matrix[ending_row][j] = True

flattened_matrix = [value for i in range(0 , R) for value in min(matrix_1[i] , matrix_2[i] , key = len)]

flattened_matrix_index = 0

answer_matrix = [[(-1) if(flag_matrix[i][j]) else (-999) for j in range(0 , C)] for i in range(0 , R)]

for i in range(0 , R):
    
    for j in range(0 , C):
        
        if(answer_matrix[i][j] == -999):
            
            answer_matrix[i][j] = flattened_matrix[flattened_matrix_index]
            
            flattened_matrix_index += 1

[print(*row_list) for row_list in answer_matrix]