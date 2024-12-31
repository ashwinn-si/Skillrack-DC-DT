def checker(small_string,b1_string,b2_string):
    global result_string
    for i in range(len(small_string)):
        for j in range(i+1,len(small_string)+1):
            curr_sub=small_string[i:j]
            if(curr_sub in b1_string and curr_sub in b2_string and len(curr_sub)>len(result_string)):
                result_string=curr_sub
                
s1,s2,s3=input().strip().split()
result_string=""
#we are call the function three times because question la they have asked first occuring substring
checker(s1,s2,s3)
checker(s2,s1,s3)
checker(s3,s1,s2)
print(result_string if(len(result_string)>0) else "-1")
