'''
The program must accept a character matrix of size R*C and an integer K as the input. The program must
find the first occurring K*K submatrix where the four corner elements are the same. Then the program must
replace the top-left to bottom-right diagonal and the top-right to bottom-left diagonal elements of the
submatrix with the asterisks. Finally, the program must print the modified character matrix as the output.
Note: In the given matrix, at least one K*K submatrix always has the same element in all four corners.

Input:
7 6
a d z d o t
t g y e g b
y d c d i c
s y x v a l
b g s f g f
u a c r p c
k v z n i h
4

Output:
a d z d o t
t * y e * b
y d * * i c
s y * * a l
b * s f * f
u a c r p c
k v z n i h
'''

#Your code below
def helper1(currI, currJ):
    return matrix[currI][currJ] == matrix[currI][currJ + K - 1] == matrix[currI + K - 1][currJ] == matrix[currI + K - 1][currJ + K - 1]
    
def helper2(currI, currJ):
    pointer1 = currJ
    pointer2 = currJ + K - 1
    for i in range(K):
        matrix[currI + i][pointer1] = '*'
        matrix[currI + i][pointer2] = '*'
        pointer1 += 1
        pointer2 -= 1


R, C = map(int, input().strip("").split())
matrix = [input().split() for i in range(R)]
K = int(input())

for i in range(R - K + 1):
    for j in range(C - K + 1):
        if(helper1(i, j)):
            helper2(i, j)
            for i in range(R):
                print(*matrix[i])
            quit()