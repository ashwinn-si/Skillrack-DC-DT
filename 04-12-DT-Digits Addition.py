'''The must accept M digits and N digits as the input The must form an
integer X using the M digits in the order of their occurrerxe. Then the program must form an
integer Y using the N digits in the order of their occurrence Finally, the program must print the
digits in the Wm Of X and Y separated by a space as the Output

Input:
12
9 2 8 1 3 5 6 7 3 1 1 6
9
7 8 4 6 2 1 9 9 7

Output:
9 2 8 9 2 0 2 9 5 1 1 3

Explanation:
The X is formed using the 12 digits 9 2 81 3 5 6 7 3 1 16.
The Y is formed using the 9 7 8 4 6 2 1 9 9 7.
X 928135673116 and Y 784621997.
The sum of X and Y is 928920295113.
'''

#Your code below
N = int(input())
num1 = int(''.join(i for i in input().split()))
M = int(input())
num2 = int(''.join(i for i in input().split()))
for i in str(num1+num2):
    print(i,end=" ")