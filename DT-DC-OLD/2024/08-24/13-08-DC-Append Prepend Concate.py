'''The program must accept a string S and Q queries as the input. The query can be any one of
the following.
S++ Append the last character of S to the string S.
++S -> Prepend the first character of S to the string S.
S+l -> Concatenate the string values S and S.
For each query, the program must modify the string S based on the specified query and print
the modified string as the output.

Input:
Task
3
Output:
Taskk
TaskkTaskk
TTaskkTaskk '''


string=input().strip()
N=int(input())
for i in range(N):
    action=input().strip()
    if(action=='S++'):
        string+=string[-1]
    elif(action=='S+1'):
        string+=string
    else:
        string=string[0]+string
    print(string)
