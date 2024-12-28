'''
The prograrn must accept an inte*t matrix Of Size RXC as input. The program t•nuSt print the OutWt
based on the rollcm•.ng conditions.
• l' the matrix honzontall•/ syrnrc.etnc (bottom halt ot the matrix is equal to water image 01 the halt). the
prcgam print rhe string value 'Horizontally Symmetric".
If the matrix is vertically symmetric (right hatf of the matrix is equal to mirror image of left half). the
prcyam must print the string value Verticany Symmetric•
- If the matrix is both horizontally and vertically syrnrneric, the program must print tt-e string val'* 'BotW.
- Else the program must print -1 as tt'e wtput
If the value of R ot C is odd. tre middle row or column or the matrix will rot be considered våven
dividing the matrix into two haves (horizontally Or vertically),

Input:
55
36 27 10 32 86
51 95 20 54 25
24 18 63 39 76
51 95 20 54 25
36 27 10 32 86

Output:
Horizontally Symmetric

'''

#Your code below
rows,cols = map(int,input().split())
matrix = [list(map(int,input().split())) for i in range(rows)]
rowsFlag = True
colsFlag = True
for  i in range(rows//2):
    if(matrix[i] != matrix[rows-1-i]):
        rowsFlag = False
        break
for j in range(cols//2):
    for i in range(rows):
        if(matrix[i][j] != matrix[i][cols-j-1]):
            colsFlag = False
            break
if(rowsFlag and colsFlag):
    print("Both")
elif(rowsFlag):
    print("Horizontally Symmetric")
elif(colsFlag):
    print("Vertically Symmetric")
else:
    print("-1")