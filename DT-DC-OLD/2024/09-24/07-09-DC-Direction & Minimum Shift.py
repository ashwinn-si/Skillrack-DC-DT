'''The program must accept two String SI and S2 the input. The String S2 represents
the rotated version of the string Sl. The program must find the minimum number of characters
M that must be shifted (Left or Right) in Sl to convert Sl to SZ Then the program must print
the direction (L-Left or R-Right or A-Any direction) in which the characters in the string Sl are
shifted and the value Of M as the output. The direction A represents that the string Sl can be
converted to S2 in both directions with the same value M.

Input
hello

Output
L2

Explanation:
Here Sl hello and S2 = Ilohe.
If 3 Characters in Sl are shifted to the right. it becomes Ilohe.
If 2 characters in Sl are shifted to the left. it becomes Ilohe.
Here the minimum is 2, so L2 is printed as the Output,
'''

def right_left_shift(key): #key : True -> left shift | False -> right shift
    cpy=string_1[::]
    count=0
    while(True):
        if(cpy==string_2):
            return count
        if(key):
            cpy=cpy[1:]+cpy[0]
        else:
            cpy=cpy[-1]+cpy[:len(cpy)-1]
        if(cpy==string_1):
            return -1;
        count+=1
        
string_1=input().strip()
string_2=input().strip()
left_shift=right_left_shift(True)
right_shift=right_left_shift(False)
if(left_shift==right_shift):
    print('A'+str(left_shift))
elif(left_shift !=-1 and left_shift<right_shift):
    print("L"+str(left_shift))
else:
    print("R"+str(right_shift)