#Your code below
original_hashmap = {}
original_string = list(input().strip())
for i in original_string:
    if(i not in original_hashmap):
        original_hashmap[i] = 1
    else:
        original_hashmap[i] = original_hashmap[i]+1
N = int(input())
for _ in range(N):
    curr_hashmap= {}
    curr_string = list(input().strip())
    for i in curr_string:
        if(i not in curr_hashmap):
            curr_hashmap[i] = 1
        else:
            curr_hashmap[i] = curr_hashmap[i]+1
    if(curr_hashmap != original_hashmap):
        print("NO")
        continue
    #O(2N) LOGIC
    wrong_index=[]
    for i in range(len(curr_string)):
        if(curr_string[i] != original_string[i]):
            wrong_index.append(i)
        if(len(wrong_index)==2):
            break
    #swapping index
    if(len(wrong_index) == 2):
        curr_string[wrong_index[0]], curr_string[wrong_index[1]] = curr_string[wrong_index[1]], curr_string[wrong_index[0]]
        if(curr_string == original_string):
            print("YES")
        else:
            print("NO")
    #we should check if any two characters has repeated
    else:
        for i in curr_hashmap:
            if(curr_hashmap[i]%2 == 0):
                print("YES")
                break
        else:
            print("NO")