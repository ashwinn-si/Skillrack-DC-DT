'''There are N water tanks arranged in a row. The maximum capacity of each water tank is M.
The initial amount of water in each tank is passed as the input to the program. If it rains over
the N tanks for an hour, I litre of water will be filled in each tank. Whenever a tank is full, a boy
drains K litres of water from that the tank. The program must print the amount of water in
each tank after T hours of rain as the output The values of K and T are also passed as the
input.

Input:
4 30
5 15 10 25
4 11

Output : 
16 26 21 28
'''

no_tanks,capacity=map(int,input().split())
tanks=list(map(int,input().split()))
remove_litre,time=map(int,input().split())
for _ in range(time):
    for j in range(no_tanks):
        tanks[j]+=1
        if(tanks[j]==capacity):
            tanks[j]-=remove_litre
print(*tanks)