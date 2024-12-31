'''
The must accept N integers and an integer K as the input The program must form a
string S of length K with Os The string S indicates the binary representation of an integer. For
each integer X among the N integers program must toggle the characters (O 1 or 1
O) from the Xth character in the string S. Finally, the program must print the decimal equivalent
Of S as the Output

Input
5
2 1 3 1 4

Output
11
'''

#Your code below
def helper(S, N):
    for i in range(N,len(S)):
        S[i] = '1' if(S[i]=='0') else '0'
N , K = map(int,input().split())
res = ['0' for i in range(K)]
for i in list(map(int,input().split())):
    helper(res,i-1)
print(int(''.join(i for i in res),2))