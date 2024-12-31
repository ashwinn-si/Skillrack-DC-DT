'''The program must accept N integers as the input. The program must find the longest subset
among the N integers, whose first integer and the last integer are the same. Then the program
must print the first integer in the longest subset as the output. If there are two or more such
longest subsets, the program must print the largest first integer among the subsets as the
output.
Note: At least one integer is always repeated in the given N integers.

Input:
10
55 44 55 90 66 48 44 52 66 66
Output:
66
'''

N=int(input())
numbers=list(map(int,input().split()))
result_len=0
result_num=-1
for i in range(N):
    for j in range(i+1,N):
        if(numbers[i]==numbers[j]):
            if(result_len<(j-i)):
                result_len=j-i
                result_num=numbers[i]
            if(result_len==(j-i) and result_num<numbers[i]):
                result_num=numbers[i]
print(result_num)
