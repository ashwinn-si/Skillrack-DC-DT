original_bin=bin(int(input()))[2:]
st,end=map(int,input().split())
if(len(original_bin)<end):
    original_bin=('0'*(end-len(original_bin)))+original_bin
original_bin_digits=[i for i in original_bin]
for i in range(st-1,end):
    if(original_bin_digits[i]=='0'):
        original_bin_digits[i]='1'
    else:
        original_bin_digits[i]='0'
print(int(''.join(i for i in original_bin_digits),2))
