#Your code below
N = int(input())
numbers = (list(map(int,input().split())))
pairs = []
for i in range(N):
    for j in range(i+1, N):
        if(numbers[i]%10 == numbers[j]%10):
            pairs.append(sorted([numbers[i],numbers[j]]))
for i in sorted(pairs,key = lambda x : (x[0]%10, x[1]%10, x[0],x[1])):
    print(*i)