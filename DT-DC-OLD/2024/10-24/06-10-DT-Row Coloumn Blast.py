#! ONUMA PURIYALA
'''
The program must accept an integer matrix of size RxC and the positions of N cells as the
input. For each cell among the given N cells, the program must modify the matrix based on the
following conditions.
- The program must decrement the value of the integer present in the given cell by (R+C).
- The program decrement the values of the integers present below the given cell by R-1, R-2,
R-3 and so on (towards bottom).
- The program decrement the values of the integers present above the given cell by R-I, R-2,
R-3 and so on (towards top).
- The program decrement the values of the integers present right to the given cell by C-1, C-2,
C-3 and so on (towards right).
- The program decrement the values of the integers present left to the given cell by C-1, C-2,
C-3 and so on (towards left).
Finally, the program must print the modified matrix as the output.

Input:
66
77 99 22 92 41 65
96 94 83 46 45 71
86 67 58 20 28 23
34 42 87 47 13 26
52 21 75 90 14 66
37 18 43 11 79 82
3
2 2
4 6
1 3

Output:
73 89 10 87 37 59
91 82 73 42 42 65
86 62 54 20 28 18
33 36 81 43 8 14
52 18 73 90 14 61
37 16 42 11 79 78

Explanation:
After modifying the matrix for the cell (2, 2), the matrix becomes
77 94 22 92 41 65
91 82 78 42 42 69 
86 62 58 20 28 23
34 38 87 47 13 26
52 18 75 90 14 66
37 16 43 11 79 82
After modifying the matrix for the cell (4, 6), the matrix becomes
77 94 22 92 41 62
91 82 78 42 42 65
86 62 58 20 28 18
33 36 84 43 8 14
52 18 75 90 14 61
37 1643 11 79 78
After modifying the matrix for the cell (1, 3), the matrix becomes
73 89 10 87 37 59
91 82 73 42 42 65
86 62 54 20 28 18
33 36 81 43 8 14
52 18 73 90 14 61
37 16 42 11 79 78

'''

def modify_matrix(choice , decrement_value , current_i , current_j , R , C , matrix):
    
    while((0 <= current_i < R) and (0 <= current_j < C)):
        
        matrix[current_i][current_j] -= decrement_value
        
        decrement_value -= 1
        
        current_i += choices_map[choice][0]
        
        current_j += choices_map[choice][1]

R , C = map(int , input().split())

matrix = [list(map(int , input().split())) for i in range(0 , R)]

choices_map = {1 : (-1 , 0) , 2 : (1 , 0) , 3 : (0 , -1) , 4 : (0 , 1)}

for i in range(0 , int(input())):
    
    X , Y = map((lambda value : (value - 1)) , (map(int , input().split())))
    
    matrix[X][Y] -= (R + C)
    
    modify_matrix(1 , (R - 1) , (X - 1) , Y , R , C , matrix)
    
    modify_matrix(2 , (R - 1) , (X + 1) , Y , R , C , matrix)
    
    modify_matrix(3 , (C - 1) , X , (Y - 1) , R , C , matrix)
    
    modify_matrix(4 , (C - 1) , X , (Y + 1) , R , C , matrix)

[print(*row_list) for row_list in matrix]