'''The program must accept a character matrix of size RxC and a string S as the input. The
program must replace the characters in the border of the matrix with the characters in the
string S in the clockwise direction. Then the program must print the modified matrix as the
output.

Input:
4 5
@ b c d E
e f 5 h i
b c d e q
k 9 0 1 2
queenbee

Output:
q u e e n
e f 5 h b
b c d e e
k 9 o l e
'''
#can be more optimum
def check_condition(index):
    if(index>=len(string)):
        return False
    else:
        return True
rows,cols=map(int,input().split())
matrix=[input().split() for i in range(rows)]
string=input().strip()
top=0
bottom=rows-1
left=0
right=cols-1
index=0
for i in range(left,right+1):
    if(check_condition(index)):
        matrix[top][i]=string[index]
        index+=1
top+=1
for i in range(top,bottom+1,1):
    if(check_condition(index)):
        matrix[i][right]=string[index]
        index+=1
right-=1
for i in range(right,left-1,-1):
    if(check_condition(index)):
        matrix[bottom][i]=string[index]
        index+=1
bottom-=1
for i in range(bottom,top-1,-1):
    if(check_condition(index)):
        matrix[i][left]=string[index]
        index+=1
left+=1
for i in range(rows):
    print(*matrix[i])