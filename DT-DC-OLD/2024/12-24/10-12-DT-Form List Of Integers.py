#Your code below
def helper(N):
    while(N != 0):
        digits[N%10]-=1
        if(digits[N%10] < 0):
            print("NO")
            quit()
        N//=10
digits={ index : freq for index, freq in enumerate(list(map(int,input().split())))}
[helper(i) for i in list(map(int,input().split()))]
print("YES")