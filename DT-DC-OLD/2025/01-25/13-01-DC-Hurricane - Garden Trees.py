#jagadish code

N = int(input())

heights_list = list(map(int , input().split()))

X , D =  [(int(X)) if(index == 0) else (X) for index , X in enumerate(input().split())]

start , stop , step = ((0 , (N - 1) , 1)) if(D == 'L') else (((N - 1) , 0 , -1))

offset_value = (1) if(D == 'L') else (-1)

fallen_trees_indices_set = {(0) if(D == 'L') else (N - 1)}

for index in range(start , stop , step):
    
    if(heights_list[index] <= X):
        break
    
    heights_list[(index + offset_value)] = max(heights_list[(index + offset_value)] , (heights_list[index] - X))
    
    fallen_trees_indices_set.add(index)
    
    fallen_trees_indices_set.add((index + offset_value))

print(len(fallen_trees_indices_set))