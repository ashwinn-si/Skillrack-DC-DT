#jagadish code
# R = 8

C = 8

matrix = [list(input().strip()) for i in range(0 , R)]

upper_deck_value = 0

for j in range(0 , C):
    
    beads_count = 0
    
    i = 1
    
    while((i >= 0) and (matrix[i][(C - j - 1)] == 'O')):
        
        beads_count += 1
        
        i -= 1
    
    upper_deck_value += ((5 * beads_count) * (10 ** j))

lower_deck_value = 0

for j in range(0 , C):
    
    beads_count = 0
    
    i = 3
    
    while((i < R) and (matrix[i][(C - j - 1)] == 'O')):
        
        beads_count += 1
        
        i += 1
    
    lower_deck_value += (beads_count * (10 ** j))

(lambda sum_value : print(sum_value)) ((upper_deck_value + lower_deck_value))