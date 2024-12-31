'''The program must accept N unique integers as input. The program must print the missing
integers or the missing ranges among the given N integers in ascending order separated by a
comma as the output. The missing range must be represented by the starting value and the
ending value separated by a hyphen.
Example Input/Output t :
Input
6
52 750 502 1
output:
3-49,51,53-74
'''

N=int(input())
numbers=sorted(list(map(int,input().split())))
res=[]
if(numbers[0]!=0):
    numbers=[-1]+numbers
for index in range(len(numbers)-1):
    if(numbers[index+1]-numbers[index]==1):
        pass
    elif(numbers[index+1]-numbers[index]==2):
        res.append(numbers[index]+1)
    else:
        res.append(str(numbers[index]+1)+'-'+str(numbers[index+1]-1))
for i in range(len(res)):
    if(i==len(res)-1):
        print(res[i])
    else:
        print(res[i],end=",")