'''
The program must accept an integer matrix of size RxC and an integer K as the input. If the integer K is present in the
border of the matrix, the program must print the integers in the border based on the following conditions.
- The program must print the integer K.
- Then the program must print the previous integer of K (moving in clockwise direction) along the border.
- Then the program must print the next integer of K (moving in counter clockwise direction) along the border.
- Similarly, the program must print the remaining integers in the border alternatively by considering the border elements
in clockwise and counter clockwise direction.
If the integer K is not present in the border of the matrix, then the program must print -1 as the output. If the integer K
occurs more than once, then the program must consider the first occurring K in the matrix from the top left of the matrix.

Input:
55
74 21 77 95 58
97 21 35 98 73
94 23 39 38 14
64 47 17 58 54
38 61 22 72 25
54

Output:
54 14 25 73 72 58 22 95 61 77 38 21 64 74 94 97
'''

def layer_traversal(K_i , K_j , R , C , matrix):
    
    border_elements_coordinates_list = []
    
    layer = min(K_i , (R - K_i - 1) , K_j , (C - K_j - 1))
    
    starting_i = layer
    
    ending_i = (R - layer - 1)
    
    starting_j = layer
    
    ending_j = (C - layer - 1)
    
    [border_elements_coordinates_list.append((starting_i , current_j)) for current_j in range(starting_j , (ending_j + 1))]
    
    [border_elements_coordinates_list.append((current_i , ending_j)) for current_i in range((starting_i + 1) , (ending_i + 1))]
    
    [border_elements_coordinates_list.append((ending_i , current_j)) for current_j in range((ending_j - 1) , (starting_j - 1) , -1)]
    
    [border_elements_coordinates_list.append((current_i , starting_j)) for current_i in range((ending_i - 1) , starting_i , -1)]
    
    index = border_elements_coordinates_list.index((K_i , K_j))
    
    clockwise_path_list = (border_elements_coordinates_list[index : ] + border_elements_coordinates_list[ : index])
    
    anti_clockwise_path_list = (border_elements_coordinates_list[(index + 1) : ] + border_elements_coordinates_list[ : (index + 1)])[::-1]
    
    return (clockwise_path_list , anti_clockwise_path_list)

def get_values(coordinates_list , matrix):
    
    return [matrix[i][j] for i , j in coordinates_list]

def is_odd(N):
    
    return ((N & 1) == 1)

R , C = map(int , input().split())

matrix = [list(map(int , input().split())) for i in range(0 , R)]

K = int(input())

K_i = -999

K_j = -999

for i in range(0 , R):
    
    for j in range(0 , C):
        
        if(((i == 0) or (i == (R - 1)) or (j == 0) or (j == (C - 1))) and (matrix[i][j] == K) and (K_i == -999) and (K_j == -999)):
            
            K_i = i
            
            K_j = j
            
            break

if((K_i == -999) or (K_j == -999)):
    print(-1)
    quit()

clockwise_path_list , anti_clockwise_path_list = layer_traversal(K_i , K_j , R , C , matrix)

clockwise_elements_list = get_values(clockwise_path_list , matrix)

anti_clockwise_elements_list = get_values(anti_clockwise_path_list , matrix)

N = ((R * 2) + (C * 2) - 4)

print(clockwise_elements_list[0] , end = " ")

list_1 = anti_clockwise_elements_list

list_2 = clockwise_elements_list

index_1 = 1

index_2 = 1

for count in range(1 , (N - 2 + 1) , 2):
    
    print(list_1[index_1] , list_2[index_2] , end = " ")
    
    index_1 += 1
    
    index_2 += 1

(print(list_1[index_1])) if(is_odd((N - 1))) else ('')
