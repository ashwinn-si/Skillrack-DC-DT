'''The program must accept N pairs Of integers as the input. Each pair contains two integers
representing the starting point S and the ending point E of a path. The program must print YES
if a cyclic path is formed by connecting all the N paths. Else the program must print NO as the
output The two paths PI and P2 can be connected only if the end point of Pl is equal to the
starting point Of P2.

Input:
4
2 3
5 1
3 5
1 2

Output:
YES

Explanation:
The cyclic path formed using the 4 paths is given below
2 -> 3 -> 5 -> 1 ->2
So YES is printed as the output.
'''

n=int(input())
r1=[]
r2=[]
for i in range(n):
    a,b=map(int,input().split())
    r1.append(a)
    r2.append(b)
index=0
first_val=r1[0]
for i in range(n-1):
    curr_val=r2[index]
    if(r2[index] not in r1):
        print("NO")
        quit()
    del r1[index]
    del r2[index]
    index=r1.index(curr_val)
if(r2[0]==first_val):
    print("YES")
else:
    print("NO")