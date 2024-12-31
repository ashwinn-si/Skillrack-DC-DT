s1,s2=input().strip().split()
for alpha_1 in s1:
    res=s2[0]
    res_diff=abs(ord(s2[0])-ord(alpha_2))
    for alpha_2 in s2:
        len_diff=abs(ord(alpha_1)-ord(alpha_2))
        if(len_diff<abs(ord(res)-ord(alpha_1))):
            res=alpha_2
            res_diff=len_diff
        elif(len_diff==res_diff):
            res=alpha_2 if(ord(alpha_2)<ord(res)) else res
    print(alpha_1+res,end=" ")
