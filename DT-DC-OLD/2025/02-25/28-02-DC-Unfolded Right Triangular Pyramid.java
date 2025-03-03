#Your code below
f1, f2, f3, f4 = input().strip().split()
N = int(input())
left = N
mid = 1
star = 0
right = N
for i in range(N):
    string = f4*left + f1*mid + f2*right
    print("*"*star,end="")
    for i in range(len(string)):
        if(i == len(string)-1):
            print(string[i], end="")
        else:
            print(string[i],end=" ")
    print("*"*star)
    left-=1
    right-=1
    mid+=1
    star+=1
star+=1
mid-=1
for j in range(N):
    string = f3*mid
    print("*"*star ,end="")
    for i in range(len(string)):
        if(i == len(string)-1):
            print(string[i],end="")
        else:
            print(string[i],end=" ")
    print("*"*star)
    star+=1
    mid-=1