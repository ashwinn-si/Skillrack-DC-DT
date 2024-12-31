'''The program must accept a character matrix of size RxC as the input. The program must
navigate the matrix from the top-left cell based on the following conditions.
- If there is an alphabet below the current cell, then navigate to down.
- Else if there is a digit on the right side of the current cell, then navigate to right.
- Else stop the navigation.
Finally, the program must print all the navigated characters as the output.

Input:
5 5
p 6 q t =
I z 7 h *
t ) i e t
t e t n s

Output:
p6z7i
'''

rows,cols=map(int,input().split())
matrix=[input().strip().split() for i in range(rows)]
curr_i,curr_j=0,0
while(True):
    print(matrix[curr_i][curr_j],end="")
    if(curr_i+1 < rows and (matrix[curr_i+1][curr_j]).isalpha()):
        curr_i+=1
    elif(curr_j+1 <cols and (matrix[curr_i][curr_j+1]).isnumeric()):
        curr_j+=1
    else:
        quit()