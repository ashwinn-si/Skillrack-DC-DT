'''
There are N water tanks arranged in a The maximum capacity of each water Onk is
passed as the input to the program. The initial amount of water in each tank is also passed as
the input to the program. If it rains over N tanks for an hour, t litre of water will be filled in
each tank. Ttv program must print the total æ-nount of water that has overflowed frot-n the
tanks when all the N tanks are completew filled with water.

Input
4
10 20 15 10
8 15 12 6

Output
6
'''
#Your code below
N = int(input())
res = 0 
max_cap = list(map(int,input().split()))
curr_cap = list(map(int,input().split()))
#find the max diff btw curr and max cap 
max_diff = -1
for i in range(N):
    if(max_diff < max_cap[i] - curr_cap[i]):
        max_diff = max_cap[i] - curr_cap[i]
for i in range(N):
    if(curr_cap[i] + max_diff > max_cap[i]):
        res += (curr_cap[i] + max_diff)-max_cap[i]
print(res)