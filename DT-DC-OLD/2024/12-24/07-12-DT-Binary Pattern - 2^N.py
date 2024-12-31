'''
The program must accept an integer as the program must print the binary
representations the integers from O to (2^N)-1 as the output. Each binary representation
must N bits.

Input:
3

Output
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
'''

#Your code below
N = int(input())
for  i in range(2**N):
    print([j for j in '0'(N-len(bin(i)[2:]))+bin(i)[2:]])