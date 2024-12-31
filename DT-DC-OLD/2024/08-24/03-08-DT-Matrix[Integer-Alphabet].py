# 1 TEST CASE FAILED

def printing_result(count,res):
    index=0
    for i in range(int(count**0.5)):
        for j in range(int(count**0.5)):
            print(res[index],end=" ")
            index+=1
        print()
def printing_function(key):
    res=[]
    for i in range(rows):
        for j in range(cols):
            if(key==1 and matrix[i][j].isalpha()):
                res.append(matrix[i][j])
            elif(key==0 and matrix[i][j].isdigit()):
                res.append(matrix[i][j])
    if(key==1):
        printing_result(alpha_count,res)
    else:
        printing_result(num_count,res)
rows,cols=map(int,input().split())
alpha_count=0
num_count=0
matrix=[]
for i in range(rows):
    matrix.append(input().split())
    for j in range(cols):
        if(matrix[i][j].isalpha()):
            alpha_count+=1
        else:
            num_count+=1
alpha_flag=0
num_flag=0
if(alpha_count**0.5==(int(alpha_count**0.5)*1.0)):
    alpha_flag=1
if(num_count**0.5==(int(num_count**0.5)*1.0)):
    num_flag=1
if(alpha_flag==1 and num_flag==1 and alpha_count==num_count):
    for i in range(rows):
        print(*matrix[i])
elif(alpha_flag==1 and num_flag==1):
    if(alpha_count>num_count):
        printing_function(1)
    else:
        printing_function(0)
elif(alpha_flag==1):
    printing_function(1)
else:
    printing_function(0)
