#jagasish code

names_map = {}

for i in range(0 , int(input())):
    
    input_data = input().strip().split()
    
    name = input_data[0]
    
    starting_time = input_data[1]
    
    ending_time = input_data[2]
    
    names_map[name] = (starting_time , ending_time)

target_time = input().strip()

(lambda names_list : print(*((names_list) if(names_list) else ([-1])) , sep = "\n")) (sorted([key for key , values_list in names_map.items() if((values_list[0] <= target_time <= values_list[1]) and (values_list[1] != target_time))] , key = lambda name : (names_map[name][0] , name)))