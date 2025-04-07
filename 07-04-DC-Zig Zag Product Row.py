'''
The program must accept an integer matrix of size R*C and two integers X, Y as the input. The program
must print the product of the integers in the row (left to right) and Y th row (right to left) as the output.

Input:
4 6
1 1 5 3 3 2
7 4 3 7 6 8
9 9 5 2 3 9
8 1 6 9 3 7
2 4

Output:
49 12 27 42 6 64

Explanation:
Here X = 2 and Y = 4.
The second row of the matrix contains 7 43 7 6 8.
The fourth row of the matrix contains 8 1 6 9 3 7.
The product of the integers in the 2nd row (left to right) and 4th row (right to left) is given below.
(7*7) (4*3) (3*9) (7*6) (6*1) (8*8) = 49 12 27 42 6 64

'''

R, C = map(int,input().split())
matrix =[list(map(int,input().split())) for  i in range(R)]
A, B = map(int,input().split())
print(*([matrix[A - 1][j]*matrix[B - 1][C - j - 1] for j in range(C)]))