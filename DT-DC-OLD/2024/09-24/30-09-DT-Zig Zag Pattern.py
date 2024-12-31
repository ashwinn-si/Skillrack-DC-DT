'''
The program must accept a string S and two integers R, C as the input. The program must
form a matrix of size RxC. Then the program must fill the matrix with the characters of S in
horizontal zig-zag direction. If some cells in the matrix are not filled in, the program must fill
those cells with asterisks.

Input:
environmentcareneeded

Output:
enviro
ctnemn
arenee
***ded

Explanation:
Here S = environmentcareneeded, R = 4 and C = 6.
The number of rows in the matrix must be 4.
The number of columns in the matrix must be 6.
After filling the matrix with the characters of S in horizontal zig-zag direction, the matrix
becomes
enviro
ctnemn
***ded
'''

string=input().strip()
R,C=map(int,input().split())
result=[]
index=0
for i in range(R):
    curr_string=''
    for j in range(C):
        if(index<len(string)):
            curr_string+=string[index]
        else:
            curr_string+='*'
        index+=1
    if(i%2==0):
        result.append(curr_string)
    else:
        result.append(curr_string[::-1])
for i in result:
    print(i)