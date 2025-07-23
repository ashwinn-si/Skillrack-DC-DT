'''A robot can move in the four directions N. S. E and W.
N represents that the robot moves one position towards North.
- S represents that the robot moves one position towards South,
- E represents that the robot moves one position towards East
W represents that the robot moves one position towards West
The robot moves based on the given set of instructions S starting from the position (X. Y). The
program must accept the values of X, Y and a string representing the instructions given to the
robot as the input The program must print the coordinates of the final position of the robot as
the output

Input
12
NNENNWWWS

Output
-1 5
'''

x,y=map(int,input().split())
string=input().strip()
for i in range(len(string)):
    if(string[i]=='N'):
        y+=1
    elif(string[i]=='S'):
        y-=1
    elif(string[i]=='E'):
        x+=1
    else:
        x-=1
print(x,y)