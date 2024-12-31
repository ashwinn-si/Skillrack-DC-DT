def smallest_digi_finder(num):
    small_digit=9
    while(num!=0):
        if(num%10<small_digit):
            small_digit=num%10
        num//=10
    return(small_digit)
no_digits=int(input())
numbers=list(map(int,input().split()))
res_numbers=[]
for i in numbers:
    res_numbers.append([i,smallest_digi_finder(i)])
    
res_numbers=sorted(res_numbers,reverse=True,key=lambda x:x[0])
res_numbers=sorted(res_numbers,key=lambda x:x[1])

for i in res_numbers:
    print(i[0],end=" ")
