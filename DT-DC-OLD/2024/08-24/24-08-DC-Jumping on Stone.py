'''
There are N stones arranged in a row. Each stone has an integer value. Mr. ABC is standing on
the first stone and he wants to cross or reach the Nti stone based on the following conditions.
- Initially, his jumping capacity J is 1.
- If he stands on the stone with an odd integer. then his jumping capacity J is increased by 2.
- If he stands on the stone with an even integer, then his jumping capacity J is increased by 3.
- If he stands on the stone with a multiple of 9, then his jumping capacity J is decreased by 5.
- His jumping capacity will never go below 1.
- In one jump, he can cross J stones forward from the stone where he stands.
The program must accept N integers representing the N stones as the input. The program
must print the total number of jumps that he needs to cross or reach the Nth stone as the output

Input
7
10 20 3040 53 43 34

Output
2
'''

def checker(n):
    if(n%9==0):
        return -5
    elif(n%2==0):
        return 3
    else:
        return 2
nth_stone=int(input())
stones=list(map(int,input().split()))
jump_density=1
no_jumps=0
curr_stone=0
while(curr_stone<nth_stone-1):
    jump_density+=checker(stones[curr_stone])
    if(jump_density<1):
        jump_density=1
    no_jumps+=1
    curr_stone+=jump_density
print(no_jumps)