#Your code below
string = input().strip()
index = -1
for i in range(0, len(string)-1):
    if(string[-1] == string[i]):
        index = i
if(index == -1):
    print("-1")
else:
    print(string[index:])
