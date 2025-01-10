matrix = [input().split() for i in range(5)]
encrypt = input().strip().split()
for i in encrypt : 
    for j in range(0,len(i),2):
        if('/' in matrix[int(i[j])-1][int(i[j+1])-1]):
            print(matrix[int(i[j])-1][int(i[j+1])-1][0],end="")
        else:
            print(matrix[int(i[j])-1][int(i[j+1])-1],end="")
    print(" ",end="")