'''The program must accept a character matrix of size RxC containing only hexadecimal digits
and an integer X as the input. The program must print YES if the hexadecimal value of X is
present horizontally (left to right) in the matrix. Else the program must print NO as the output.

Input:
F 3 E B 2
A 1 5 F 9
7 A 2 4 8
5 2 D D 6
45

Output:
YES

Explanation:
The hexadecimal value of 45 is 2D.
In the given 4x5 matrix, the hexadecimal value of 45 is present horizontally in the 4th row of
the matrix.
'''

rows,cols=map(int,input().split())
matrix=[input().split() for i in range(rows)]
target=int(input())
for i in range(rows):
    curr_row=matrix[i]
    for j in range(len(curr_row)):
        for k in range(j+1,len(curr_row)):
            if(int(''.join(i for i in curr_row[j:k+1]),16)==target):
                print("YES")
                quit()
print("NO")