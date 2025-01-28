#jagadish code
R , C = map(int , input().split())

matrix = [list(map(int , input().split())) for i in range(0 , R)]

M = int(input())

total_seconds = 0

while(not all((matrix[i][j] >= M) for i in range(0 , R) for j in range(0 , C))):
    
    current_overflow_count_list = [0 for j in range(0 , C)]
    
    for j in range(0 , C):
        
        matrix[0][j] += 1
        
        if(matrix[0][j] >= M):
            
            current_overflow_count_list[j] = ((matrix[0][j] - M) * 2)
            
            matrix[0][j] = M
    
    for i in range(1 , R):
        
        next_overflow_count_list = [0 for j in range(0 , C)]
        
        for j in range(0 , C):
            
            matrix[i][j] += current_overflow_count_list[j]
            
            if(matrix[i][j] >= M):
                
                next_overflow_count_list[j] = ((matrix[i][j] - M) * 2)
                
                matrix[i][j] = M
        
        current_overflow_count_list = next_overflow_count_list
    
    total_seconds += 1

print(total_seconds)