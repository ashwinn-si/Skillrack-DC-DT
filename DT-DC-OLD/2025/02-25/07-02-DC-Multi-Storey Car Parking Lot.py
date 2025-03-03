#jagadish code
R , C = map(int , input().split())

binary_matrix = [list(map(int , input().split())) for i in range(0 , R)]

X = int(input())

empty_slots_indices_map = {row_index : [] for row_index in range(0 , R)}

[empty_slots_indices_map.get(i).append((i , j)) for i in range(0 , R) for j in range(0 , C) if(binary_matrix[i][j] == 0)]

direction = 'L'

path_list = []

for i in range((R - 1) , -1 , -1):
    
    if(i >= (R - X)):
        path_list.append([direction , C])
    elif(empty_slots_indices_map[i]):
        path_list.append([direction , ((empty_slots_indices_map[i][0][1] + 1) if(direction == 'R') else (C - empty_slots_indices_map[i][-1][1]))])
        break
    else:
        path_list.append([direction , C])
    
    direction = ('R') if(direction == 'L') else ('L')
    
    path_list.append(['U'])

[print(*data_list) for data_list in path_list]