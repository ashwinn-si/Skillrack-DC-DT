'''The program must accept N integers and an integer X as the input. The program must print
the count of subarrays having exactly X odd integers as the output.
Boundary Condition(s):
1 N 100
1 <= Each integer value <= IOA5
Input Format:
The first line contains N and X separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains the count of subarrays having exactly X odd integers.
Example Input/Output 1:
Input:
42
3431
Output:
3
Explanation:
All possible subarrays are {3, 4}, {4, 3}, {3, 1}, {3, 4, 3}, {4, 3, 1) and {3, 4, 3,
1}.
There are 3 subarrays having exactly 2 odd integers {3, 4, 3}, {4, 3, I) and {3, 1}.
So 3 is printed as the output.''' #notice the element accessing as it is done different

N,no_odd=map(int,input().split())
numbers=list(map(int,input().split()))
res_count=0
j=1
while(j<=N):
    for i in range(0,N):
        curr_count=0
        if(i+j>N):
            break
        for num in numbers[i:i+j]:
            if(num%2==1):
                curr_count+=1
        if(curr_count==no_odd):
            res_count+=1
    j+=1
print(res_count)
