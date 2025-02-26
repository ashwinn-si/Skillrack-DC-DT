#Your code below
N = int(input())
firstName = []
secondName = []
for i in range(N):
    names = input().strip().split()
    firstName.append([names[0], i]);
    secondName.append([names[1], i]);
firstName = sorted(firstName, key = lambda x : (x[0][0], x[1]))
secondName = sorted(secondName, key = lambda x :( x[0][len(x[0])-1], x[1]))
for i in range(N):
    print(firstName[i][0],secondName[i][0])