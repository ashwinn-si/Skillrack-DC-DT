N = int(input())
numbers = list(map(int,input().split()))
digits = []
res = 0
for num in numbers:
    cpy = num
    printFlag = True
    while(num != 0):
        if(num % 10 not in digits):
            printFlag = False
        digits.append(num%10)
        num //= 10
        if(printFlag):
            res += cpy
print(res if(res > 0) else "-1")