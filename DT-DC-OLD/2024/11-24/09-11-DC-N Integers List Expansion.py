'''The program must accept two integers N and X as the input. The program must form a list of
integers from 1 to X. Then the program must expand the list based on the following
conditions.
- For each integer K in the list, the program must form a new list of integers by adding the
value K to all the remaining integers present in the original list. Then the program must add all
the integers in the new list to the orginal list
The program must print the first N integers in the generated list as the output

Input:
15 4

Output:
1 2 3 4 3 4 5 3 5 6 5 6 7 4 5
'''

N,X = map(int,input().split())
nums=[i for i in range(1,X+1)]
"base case"
if(N<X):
    print(*nums[:N])
    quit()
currNumIndex = 0
count = len(nums)
while(True):
    for i in range(count):
        if(count==N):
            print(*nums)
            quit()
        if(i != currNumIndex):
            nums.append(nums[i]+nums[currNumIndex])
            count+=1
    currNumIndex+=1