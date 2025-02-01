N = int(input())

T , K = map(int , input().split())

for counter in range(1 , (T + 1)):
    
    M = len(str(N))
    
    position = (M) if(((counter * K) % M) == 0) else ((counter * K) % M)
    
    reverse_position = (M - position)
    
    place_value = (10 ** reverse_position)
    
    N += place_value

print(N)