'''
The program must accept two lower case alphabets CHI and CH2 as the input. The program must form a
matrix of size 5*5 containing all the lower case alphabets except CHI. The 25 lower case alphabets must be
filled in the matrix starting from the first row (left to right in each row). Then the program must convert the
surrounding alphabets of CH2 in the matrix to upper case. Finally, the program must print the revised 5*5
matrix as the output.

Input:
g n

Output:
a b c d e
f H l J k
I M n O p
q R S T u
v w x y z
'''

#Your code below
ch1, ch2 = input().strip().split()
char = 'a'
matrix = []
for i in range(5):
    curr_row = []
    for j in range(5):
        if(char == ch1):
            char = chr(ord(char) + 1)
            curr_row.append(char)
        else:
            curr_row.append(char)
        char = chr(ord(char) + 1)
    matrix.append(curr_row)
for i in range(5):
    for j in range(5):
        if(matrix[i][j] == ch2):
            offsets = [[0,1],[1,0],[0,-1],[-1,0],[1,1],[1,-1],[-1,-1],[-1,1]]
            for k in range(8):
                newR = i + offsets[k][0]
                newC = j + offsets[k][1]
                if(newR >= 0 and newR < 5 and newC >= 0 and newC < 5):
                    matrix[newR][newC] = (matrix[newR][newC]).upper()
            for i in range(5):
                print(*matrix[i])
            quit()