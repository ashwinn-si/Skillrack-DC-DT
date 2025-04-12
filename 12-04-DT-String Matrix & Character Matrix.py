'''
The program must accept a matrix of size R*C and the position of a cell (X, Y) in the matrix as the input. The matrix
contains string values where the length of each string is always a perfect square. The program must print the characters
of the string value that occurs in the position (X, Y) as a square matrix.

Input:
3 3
four char skillrack
days education well
nutrition moon ELECTROGALVANIZE
2 2

Output:
e d u
c a t
I o n

Explanation:
Here and Y=2, the string value that occurs in the position (2, 2) in the given matrix is education.
The length of the string education is 9. So the characters in the string are printed as a square matrix of size 3*3.
e d u
c a t
I o n

'''

#Your code below
X, Y = map(int,input().strip().split())
matrix = [input().strip().split() for i in range(X)]
X_pos, Y_pos = map(int,input().split())
word = matrix[X_pos - 1][Y_pos - 1]
SIZE = int(len(word) ** 0.5)
index = 0
for i in range(SIZE):
    for j in range(SIZE):
        print(word[index],end=" ")
        index += 1
    print()