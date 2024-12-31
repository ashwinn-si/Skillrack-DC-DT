'''The program must accept an integer matrix of size RxC as the input. For each layer in the matrix, the program must rotate the integers by one
position in the anticlockwise direction. Then the program must print the modified matrix.
Boundary Condition(s):
2 R, c 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by space.
Output Format:
The first R lines. each contains C integers representing the modified matrix.
Example Input/Output I:
Input:
15 29 31 91
63 64 34 89
79 75 19 28
96 93 48 56
Output:
29 31 91 89
15 34 19 28
63 64 75 56
79 96 93 48'''

def element_accessing_updating(key,curr_layer_elements,pointers,matrix):
    #key=1 only accessing | key=0 updating
    pointer=pointers[::]
    index=0
    for i in range(pointer[2],pointer[1]+1): # top layer
        if(key==1):
            curr_layer_elements.append(matrix[pointer[0]][i])
        else:
            matrix[pointer[0]][i]=curr_layer_elements[index]
            index+=1
    pointer[0]+=1
    for i in range(pointer[0],pointer[3]+1): #right layer
        if(key==1):
            curr_layer_elements.append(matrix[i][pointer[1]])
        else:
            matrix[i][pointer[1]]=curr_layer_elements[index]
            index+=1
    pointer[1]-=1
    for i in range(pointer[1],pointer[2]-1,-1): #bottom layer
        if(key==1):
            curr_layer_elements.append(matrix[pointer[3]][i])
        else:
            matrix[pointer[3]][i]=curr_layer_elements[index]
            index+=1
    pointer[3]-=1
    for i in range(pointer[3],pointer[0]-1,-1): # left layer
        if(key==1):
            curr_layer_elements.append(matrix[i][pointer[2]])
        else:
            matrix[i][pointer[2]]=curr_layer_elements[index]
            index+=1
    pointer[2]+=1
    if(key==1):
        #returing the curr_layer_elements
        return curr_layer_elements[1:]+curr_layer_elements[0:1]
    else:
        #updating the pointers
        pointers[0]+=1
        pointers[1]-=1
        pointers[2]+=1
        pointers[3]-=1
        
rows,cols=map(int,input().split())
matrix=[list(map(int,input().split())) for i in range(rows)]
pointers=[0,cols-1,0,rows-1] #top_pointer,right_pointer,left_pointer,bottom_pointer
while(pointers[0]<pointers[3] and pointers[1]>pointers[2]):
    element_accessing_updating(0,(element_accessing_updating(1,[],pointers,matrix)),pointers,matrix)
    
for i in range(rows):
    print(*matrix[i])
