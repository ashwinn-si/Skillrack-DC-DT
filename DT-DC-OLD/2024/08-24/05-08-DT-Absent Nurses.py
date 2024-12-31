N=int(input())
for i in range(N):
    c=[0,0,0,0,0,0,0]
    flag=1
    curr_string=input().strip()
    for letter in curr_string:
        c[ord(letter)-65]+=1
        if(c[ord(letter)-65]==2):
            flag=0
    if(sum(c)==7 and flag==1):
        print("-1",end="")
    else:
        print(chr(65+c.index(0)),end=" ")
        print(chr(65+c.index(2)),end="")
    print()
