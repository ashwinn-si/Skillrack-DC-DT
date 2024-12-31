'''
There are N magical candles arranged in a circular fashion where some candles are glowing
and some are not. These magical candles never melt but each produce a powerful flash at
every X seconds. At each powerful flash of a candle, it illuminates the nearby candles (i.e., the
left and right adjacent candles). The program must accept N integers and an integer X as the
input. The N integers representing the state of N magical candles. O indicates that the candle is
not glowing and 1 indicates that the candle is glowing. The program must print the total
number of seconds it takes to light all N candles as the output.
Note: Initially, at least one candle is glowing among the N candles.

Input:
9 2
0 1 0 0 1 0 0 0 0

Output:
6
'''

#Your code below
N , sec = map(int,input().split())
candles = list(map(int,input().split()))
total_sec = 0
while(sum(candles) != N):
    dummy = candles[::]
    for i in range(N):
        if(i == 0 and candles[i] == 1):
            dummy[i+1] = 1
            dummy[-1] = 1
        elif(i == N-1 and candles[i] == 1):
            dummy[i-1] = 1
            dummy[0] = 1
        elif(candles[i] == 1):
            dummy[i+1] = 1
            dummy[i-1] = 1
    candles = dummy
    total_sec+=1
print(total_sec*sec)