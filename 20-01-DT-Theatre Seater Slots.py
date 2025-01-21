#jagadish bro solution
def get_count(K , N , bits_list):
    
    seat_bookings_count = 0
    
    index = 0
    
    while(index < N):
        
        continuous_0_bits_count = 0
        
        while((index < N) and (bits_list[index] == 0)):
            
            continuous_0_bits_count += 1
            
            index += 1
        
        seat_bookings_count = (seat_bookings_count + (continuous_0_bits_count - K + 1)) if(continuous_0_bits_count >= K) else (seat_bookings_count)
        
        index += 1
    
    return seat_bookings_count

R , C , K = map(int , input().split())

matrix = [list(map(int , input().split())) for i in range(0 , R)]

X , Y , Z = map(int , input().split())

print(sum([(get_count(K , X , row_list[0 : X]) + get_count(K , Y , row_list[X : (X + Y)]) + get_count(K , Z , row_list[(X + Y) : (X + Y + Z)])) for row_list in matrix]))