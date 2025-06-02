'''
The program must accept a matrix representing
the month of a calenderyear. The size of the
matrix can be or 7*6. In 6*7 matrix, the 7
columns represent the 7 weekdays. In 7+6 matrix,
the 7 rows represent the 7 weekdays. The matrix
contains integers, asterisks and hash symbols.
The asterisks represent the empty spaces in the
month. The hash symbols represent the holidays in
the month The program must print the holidays
along with the weekday in chronological order in
the given month as the output. If there is no
holiday in the given month, then the program must
print -1 as the output.
Nate; The order of the 7 weekdays are Sun, Mon,
Tue. wed, Thu, Fri and sae
Input Format:
The lines containing a matrix representing the
month of a calender year.
Output Format:
The lines containing the holidays along with the
weekday in chronological order.
Example Input/Output 1:
Input
*+12345
6789101112
13 14 #16171819
2021 22 23 24 25 #
# # 29 30 •
Output:
15 Tue
26 Sat
27 sun
28 Mon
Explanation:
In the given month, the holidays are 15, 26, 27 and
28.
So the holidays are printed along with the weekday
in chronological order as below.
15 Tue
26 Sat
27 Sun
28 Mon
'''

def get_flattened_matrix_list(choice , R , C , matrix):
    
    return ([matrix[i][j] for i in range(0 , R) for j in range(0 , C)]) if(choice == 1) else ([matrix[i][j] for j in range(0 , C) for i in range(0 , R)])

def get_matrix_from_flattened_matrix_list(choice , R , C , flattened_matrix_list):
    
    matrix = [[0 for j in range(0 , C)] for i in range(0 , R)]
    
    for index , value in enumerate(flattened_matrix_list):
        
        row_index = (index // C) if(choice == 1) else (index % R)
        
        column_index = (index % C) if(choice == 1) else (index // R)
        
        matrix[row_index][column_index] = value
    
    return matrix

matrix = []

while(True):
    
    try:
        
        matrix.append([(value) if((value == '*') or (value == '#')) else (int(value)) for value in input().strip().split()])
    
    except:
        
        break

R = len(matrix)

C = len(matrix[0])

N = (R * C)

hash_symbols_indices_list = [(i , j) for i in range(0 , R) for j in range(0 , C) if(matrix[i][j] == '#')]

if(len(hash_symbols_indices_list) == 0):
    print(-1)
    quit()

flattened_matrix_list = get_flattened_matrix_list(((1) if(C == 7) else (2)) , R , C , matrix)

starting_value_index = (flattened_matrix_list.index(1)) if(1 in flattened_matrix_list) else ((flattened_matrix_list.index('#')) if('#' in flattened_matrix_list) else (-999))

starting_value = (1) if((flattened_matrix_list[starting_value_index] == 1) or (starting_value_index == 0) or (flattened_matrix_list[(starting_value_index - 1)] == '*')) else (flattened_matrix_list[(starting_value_index - 1)] + 1)

[flattened_matrix_list.__setitem__(index , value) for value , index in zip(range(starting_value , 32) , range(starting_value_index , N))]

complete_matrix = get_matrix_from_flattened_matrix_list(((1) if(C == 7) else (2)) , R , C , flattened_matrix_list)

week_days_numbers_map = {number : week_day for number , week_day in zip(range(0 , 8) , ['Sun' , 'Mon' , 'Tue' , 'Wed' , 'Thu' , 'Fri' , 'Sat'])}

holidays_list = sorted([(complete_matrix[hash_i][hash_j] , ((week_days_numbers_map[hash_j]) if(C == 7) else (week_days_numbers_map[hash_i]))) for hash_i , hash_j in hash_symbols_indices_list] , key = lambda pair : pair[0])

[print(*data_list) for data_list in holidays_list]