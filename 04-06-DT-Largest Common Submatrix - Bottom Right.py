'''Jagadish Solution'''
def get_numbers_input():
    
    return map(int , input().split())

def get_matrix_input(R):
    
    return [input().strip().split() for i in range(0 , R)]

def is_within_bounds(index , N):
    
    return (0 <= index < N)

def print_matrix(starting_row_index , starting_column_index , R , C , matrix):
    
    for i in range(starting_row_index , R):
        
        for j in range(starting_column_index , C):
            
            print(matrix[i][j] , end = " ")
        
        print()

R_1 , C_1 = get_numbers_input()

matrix_1 = get_matrix_input(R_1)

R_2 , C_2 = get_numbers_input()

matrix_2 = get_matrix_input(R_2)

if(matrix_1[(R_1 - 1)][(C_1 - 1)] != matrix_2[(R_2 - 1)][(C_2 - 1)]):
    print(-1)
    quit()

row_index_1 = (R_1 - 1)

column_index_1 = (C_1 - 1)

row_index_2 = (R_2 - 1)

column_index_2 = (C_2 - 1)

while((is_within_bounds(row_index_1 , R_1)) and (is_within_bounds(column_index_1 , C_1)) and (is_within_bounds(row_index_2 , R_2)) and (is_within_bounds(column_index_2 , C_2))):
    
    for i_1 , i_2 in zip(range(row_index_1 , R_1) , range(row_index_2 , R_2)):
        
        for j_1 , j_2 in zip(range(column_index_1 , C_1) , range(column_index_2 , C_2)):
            
            if(matrix_1[i_1][j_1] != matrix_2[i_2][j_2]):
                
                print_matrix((row_index_1 + 1) , (column_index_1 + 1) , R_1 , C_1 , matrix_1)
                
                quit()
    
    row_index_1 -= 1
    
    column_index_1 -= 1
    
    row_index_2 -= 1
    
    column_index_2 -= 1

print_matrix((row_index_1 + 1) , (column_index_1 + 1) , R_1 , C_1 , matrix_1)