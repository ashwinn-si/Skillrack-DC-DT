#Your code below
N , K  = map(int , input().strip().split())
string = ''.join(str(i) for i in range(0,N+1))
for i in range(len(string)-len(str(K))+1):
    if(string[i:i+len(str(K))] == str(K)):
        for j in range(i,i+len(str(K))):
            print(j,end=" ")
        print()
