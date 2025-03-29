'''
The program must accept an integer matrix of size R*C as the input. The matrix contains only digits from 1
to 9. The values of R and C are always divisible by 3. The program must find the 3*3 submatrices having all
the digits from 1 to 9. Then the program must sort the digits within those submatrices in ascending order.
Finally, the program must print the modified matrix as the output.

Input:
8 8 4 1 8 5
4 9 7 9 7 2
5 3 3 6 3 4
1 7 2 6 2 3
8 6 3 7 6 4
5 9 4 3 5 1

Output:
8 8 4 1 2 3
4 9 7 4 5 6
5 3 3 7 8 9
1 2 3 6 2 3
4 5 6 7 6 4
7 8 9 3 5 1

'''

#Your code below
def helper1(R, C):
    digits = set()
    
    for i in range(R, R + 3):
        for j in range(C, C+3):
            digits.add(matrix[i][j])
    if(len(digits) == 9):
        return True
    return False

def helper2(R, C):
    count = 1
    for i in range(R, R+3):
        for j in range(C, C+3):
            matrix[i][j] = count
            count += 1
    
R, C = map(int, input().strip().split())
matrix = [input().strip().split() for i in range(R)]
for i in range(0, R, 3):
    for j in range(0, C, 3):
        if(helper1(i, j)):
            helper2(i, j)

for i in range(R):
    print(*matrix[i])