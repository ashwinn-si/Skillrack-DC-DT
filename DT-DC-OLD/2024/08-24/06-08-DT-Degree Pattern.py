def degree_90_270(string):
    for i in range(len_string):
        print(string[i])

def degree_135_315_45_225(rows,cols,string,key):
    #key==1 it is 135/315 degree | key==0 it is 45/225
    for i in range(rows):
        for j in range(cols):
            if(j==cols-1):
                print(string[i],end="")
            else:
                print("*",end="")
        if(key==1):
            cols-=1
        else:
            cols+=1
        print()

string=input().strip()
len_string=len(string)
degree=int(input())%360
if(degree==0):
    print(string)
elif(degree==180):
    print(string[::-1])
elif(degree==90):
    degree_90_270(string)
elif(degree==270):
    degree_90_270(string[::-1])
elif(degree==135):
    degree_135_315_45_225(len_string,len_string,string,1)
elif(degree==315):
    degree_135_315_45_225(len_string,len_string,string[::-1],1)
elif(degree==45):
    degree_135_315_45_225(len_string,1,string,0)
else:
    degree_135_315_45_225(len_string,1,string[::-1],0)
