N=int(input())
numbers=input().strip().split()
result=0
for curr_num in numbers:
    digits=[i for i in curr_num]
    if(int(curr_num)%2==0):
        result+=int((''.join(sorted(digits[:len(curr_num)-1],reverse=True)))+digits[-1])
    else:
        result+=int((''.join(sorted(digits[:len(curr_num)-1])))+digits[-1])
print(result)
