#Your code below
def helper(S):
    vowels = []
    for i in S:
        if(i.lower() in 'aeiou'):
            vowels.append(i.lower())
    return(''.join(i for i in sorted(set(vowels))))
N = int(input())
hashmap = {}
for i in range(N):
    currString = input().strip()
    vowelOcc = helper(currString)
    if(vowelOcc not in hashmap):
        hashmap[vowelOcc] = [currString,]
    else:
        a = hashmap[vowelOcc]
        a.append(currString)
        hashmap[vowelOcc] = a
for i in sorted(hashmap):
    if(i == ''):
        print("No vowels -",end=" ")
        print(*hashmap[i],sep=",")
    else:
        print(i,'-',end=" ")
        print(*hashmap[i],sep=",")