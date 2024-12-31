import math
string=input().strip().replace(" ","*")
no_cols=int(input())
len_string=len(string)
no_rows=math.ceil(len_string/no_cols)
no_hastag=no_cols*no_rows-len_string
curr_index=-1
for i in range(no_rows):
    for j in range(no_cols):
        if(no_hastag!=0):
            print("#",end=" ")
            no_hastag-=1
        else:
            print(string[curr_index],end=" ")
            curr_index-=1
    print()
