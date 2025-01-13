# jagadish code

R = 8

C = 8

matrix = [['0' for j in range(0 , C)] for i in range(0 , R)]

Q_i , Q_j = map((lambda X : (X - 1)) , (map(int , input().split())))

K_i , K_j = map((lambda X : (X - 1)) , (map(int , input().split())))

# Place Queen Coin

matrix[Q_i][Q_j] = 'Q'

# Simulation of Queen Movement

for current_i , current_j , offset_i , offset_j in [((Q_i - 1) , (Q_j - 1) , -1 , -1) , ((Q_i - 1) , Q_j , -1 , 0) , ((Q_i - 1) , (Q_j + 1) , -1 , 1) , (Q_i , (Q_j + 1) , 0 , 1) , ((Q_i + 1) , (Q_j + 1) , 1 , 1) , ((Q_i + 1) , Q_j , 1 , 0) , ((Q_i + 1) , (Q_j - 1) , 1 , -1) , (Q_i , (Q_j - 1) , 0 , -1)]:
    
    while((0 <= current_i < R) and (0 <= current_j < C)):
        
        matrix[current_i][current_j] = 'q'
        
        current_i += offset_i
        
        current_j += offset_j

# Place Knight Coint

matrix[K_i][K_j] = 'K'

# Simulation of Knight Movement

for current_i , current_j in [((K_i - 1) , (K_j - 2)) , ((K_i - 1) , (K_j + 2)) , ((K_i + 1) , (K_j - 2)) , ((K_i + 1) , (K_j + 2)) , ((K_i - 2) , (K_j - 1)) , ((K_i - 2) , (K_j + 1)) , ((K_i + 2) , (K_j - 1)) , ((K_i + 2) , (K_j + 1))]:
    
    if((0 <= current_i < R) and (0 <= current_j < C)):
        
        matrix[current_i][current_j] = ('x') if(matrix[current_i][current_j] == 'q') else (('k') if(matrix[current_i][current_j] == '0') else (matrix[current_i][current_j]))

[print(*row_list) for row_list in matrix]