'''
The program must accept N integers as the input. For each integer X among the N integers,
the program must find the number of moves required to convert X to 1. There are two types
of moves which are given below.
- If X is odd, then X = (X* 3) + I.
- If X is even, then X = X / 2.
Then the program must sort the N integers in descending order based on the number of
moves required. If two or more integers have the same number of moves, then the program
must sort those integers in descending order. Finally, the program must print the N sorted
integers as the output.

Input:
5
10 7 2 9 3

Output:
9 7 3 1 0 2
'''

def helper(x):
    count = 0
    while(x != 1):
        if(x%2 == 1):
            x = x*3+1
        else:
            x /= 2
        count+=1
    return count
int(input())
print(*[i[0] for i in sorted([[i,helper(i)] for i in list(map(int,input().split()))], key = lambda x:(-x[1],-x[0]))])