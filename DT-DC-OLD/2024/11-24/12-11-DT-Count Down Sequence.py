'''The program must accept N integers as the input The program must print the countdown
sequences present in the given N integers as the output. A countdown sequence contains all
integers from X to 1. If there is no countdown sequence, the program must print -1 as the
output.

Input:
11
4 5 4 3 2 1 3 2 1 5 1

Output:
5 4 3 2 1
3 2 1

Explanation:
Here N = 11 and the given II integers are 4 5 43 2 1 32 1 5 1.
The ISt countdown sequence contains 5 4 3 2 1, so they are printed.
The 2nd countdown sequence contains 3 2 1, so they are printed.
The 3rd countdown sequence contains 1, so it is printed.

Input:
5
1 2 3 4 5

Output:
1

Input:
7
1 1 1 1 1 1 1

Expected Output:
1
1
1
1
1
1
'''

#Your code below
N = int(input())
nums = list(map(int,input().split()))
currList = []
flag = False
for i in nums:
    if(len(currList)==0):
        currList.append(i)
        continue
    if(currList[-1] > i and currList[-1]-1 == i):
        currList.append(i)
    else:
        if(len(currList)==1 and currList[0]==1):
            flag = True
            print("1")
        currList = [i,]
    if(i == 1):
        print(*currList)
        flag = True
        currList=[]
if(len(currList)==1 and currList[0]==1):
    print("1")
if(not flag):
    print("-1")