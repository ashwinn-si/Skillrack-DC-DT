'''
The program must accept a character matrix of size R*C and a string S as the input. The program must find
the first occurring cell X which contains the first character of S in the matrix. Then the program must replace
the characters from the cell X with the characters of the string S horizontally. If it reaches the last row of the
matrix when replacing, then it will start replacing the characters from the first row of the matrix. Finally, the
program must print the modified matrix as the output.
Note: The first character of S always occurs in the given matrix.

Input:
65
y m w h y
1 m v a l
p l g x v
h p o v o
o c e s g
l s d b p
vegetable

Output:
y m w h y
i m v e g
e t a b l
e p o v o
o c e s g
l s d b p
'''

#Your code below
R, C = map(int, input().strip().split())
matrix = []
for i in range(R):
    for j in input().strip().split():
        matrix.append(j)
string = input().strip()
len_s = len(string)
index = matrix.index(string[0])
for i in range(len_s):
    matrix[index % (R * C)] = string[i]
    index += 1

index = 0
for i in range(R):
    for j in range(C):
        print(matrix[index], end = " ")
        index += 1
    print()