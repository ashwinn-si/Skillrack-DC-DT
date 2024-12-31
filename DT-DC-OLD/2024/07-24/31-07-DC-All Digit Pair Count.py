def all_digit_checker(A,B):
    digits=[0,0,0,0,0,0,0,0,0,0]
    while(A !=0):
        if(digits[A%10]==0):
            digits[A%10]+=1
        A//=10
    while(B!=0):
        if(digits[B%10]==0):
            digits[B%10]+=1
        B//=10
    if(sum(digits)==10):
        return(True)
    return(False)

no_digits=int(input())
numbers=list(map(int,input().split()))
res_count=0

for i in range(no_digits):
    for j in range(i+1,no_digits):
        if(all_digit_checker(numbers[i],numbers[j])):
            res_count+=1

print(res_count)
