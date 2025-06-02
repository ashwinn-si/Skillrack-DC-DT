numbers_set = set()

while(True):
    
    try:
        
        numbers_set |= set(map(int , input().split()))
    
    except:
        
        break

print(*sorted(list(numbers_set)))