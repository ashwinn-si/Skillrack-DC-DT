'''
The program must accept an integer matrix of size
9*9 and an integer N as the input. The integer
matrix contains only nonzero digits and the integer
N contains exactly 9 nonzero digits. For each
column in the matrix, the program must form an
integer by concatenating the first X digits in the
column, where X is the corresponding digit in the
integer N. Finally, the program must print the sum
S of the resulting 9 integers as the output.
Input Format:
The first 9 lines, each contains 9 digits separated
by a space.
The 10th line contains N.
Output Format:
The first line contains S.
Example Input/Output 1:
Input:
354629591
499393652
136627469
813292784
859546693
846182764
829363661
955856265
523555771
234167258
Output:
22710327
'''

R = 9

C = 9

matrix = [list(map(int , input().split())) for i in range(0 , R)]

sum_value = 0

for column_index , digit in enumerate(input().strip()):
    
    number = 0
    
    for row_index in range(0 , int(digit)):
        
        number = ((number * 10) + matrix[row_index][column_index])
    
    sum_value += number

print(sum_value)