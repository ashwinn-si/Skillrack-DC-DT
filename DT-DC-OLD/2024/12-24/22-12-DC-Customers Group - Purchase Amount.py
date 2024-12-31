#Your code below
N = int(input())
hashmap = {}
for i in range(N):
    name,amount = input().split()
    if(int(amount) not in hashmap):
        hashmap[int(amount)] = [name,]
    else:
        curr = hashmap[int(amount)]
        curr.append(name)
        hashmap[int(amount)] = curr
for i in sorted(hashmap,reverse = True):
    print(i,end=" ")
    print(*sorted(hashmap[i]),sep=", ")