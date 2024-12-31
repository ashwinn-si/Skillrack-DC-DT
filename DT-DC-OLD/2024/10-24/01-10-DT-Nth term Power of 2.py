'''The program must accept an integer N as the input. The program must print the N term in
the following sequence.
01012301234567012345678910 11 12 13 14 15012... and soon.
The above sequence is formed using O to (21)-1, O to (22)-1, O to (23)-1, O to (24)-1, .
and so
on.
Note: Optimize your logic to avoid Time Limit Exceeded error.

Input:
5

Output:
2

Explanation:
The 5 term in the above sequence is 2.
So 2 is printed as the output.
'''

n=int(input())
power_2=2
while(n>power_2):
    n-=power_2
    power_2*=2
print(n-1)