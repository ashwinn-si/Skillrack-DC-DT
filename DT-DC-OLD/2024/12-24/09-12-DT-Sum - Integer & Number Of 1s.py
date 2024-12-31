'''
he program must accept an integer N as the input The program must print "YES' if N is not equal to the
um of any positive integer X and the numbers of Is in the binary representation of X. Else the program
ust print "NO" as the output.

Input:
5

Output:
NO

Explanation:
Here N = 5.
If X = 3, the sum of 3 and the number of Is in the binary representation of 3 is equal to 5.
The binary representation of 3 is 11.
3 + (Number of Is in 11) = (3 + 2) = 5
So NO is printed as the output.
'''

#Your code below
def helper(n):
    return bin(n)[2:].count('1')
N = int(input())
for i in range(1,N+1):
    if(helper(i)+i == N):
        print("NO")
        quit()
print("YES")