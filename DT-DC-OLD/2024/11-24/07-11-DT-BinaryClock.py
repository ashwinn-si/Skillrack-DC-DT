'''The program must accept a time T in 24-hr format (HH:MM:SS) as the input. The program
must print the binary clock representation for the given time T.
The following five lines represent the format of the Binary Clock.
The hyphens in each column (from top to bottom) of the binary clock represent the binary
representation of the corresponding digit in the given time (HH:MM:SS). The hash symbols (#)
in the binary clock represent the empty cells.

Input
12:35:49

Output
HH:MM:SS
#0 #0 #1 
#0 01 10 
01 10 00 
10 11 01 
'''
#Your code below
inputTime = input().split(":")
originalString=[]
for i in range(3):
    for j in range(2):
        curr=(bin(int(inputTime[i][j]))[2:])
        if(j==0):
            if(i==0):
                curr="##"+'0'*(2-len(curr))+(curr)
            else:
                curr="#"+'0'*(3-len(curr))+curr
        else:
            curr='0'*(4-len(curr))+curr
        originalString.append(curr)

print("HH:MM:SS")
for i in range(4):
    curr=['','','']
    index=0
    for j in range(0,5,2):
        curr[index]+=originalString[j][i]+originalString[j+1][i]
        index+=1
    for i in curr:
        print(i,end=" ")
    print()