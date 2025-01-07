# 3 testcase failed
#Your code below
inputs = input().strip().split()
hashmap = {}
firstChar = []
no_rows = 0
for i in inputs:
    if(i[0] not in hashmap):
        firstChar.append(i[0])
        hashmap[i[0]] = [i]
    else:
        hashmap[i[0]].append(i)
        no_rows = max(len(hashmap[i[0]]) , no_rows)
firstChar = sorted(firstChar)
for i in range(no_rows):
    for j in firstChar:
        if(i < len(hashmap[j])):
            print(hashmap[j][i],end="")
        else:
            print('*'*len(inputs[0]),end="")
    print()