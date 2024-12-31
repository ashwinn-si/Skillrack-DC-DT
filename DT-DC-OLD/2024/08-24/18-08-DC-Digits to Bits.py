'''The program must accept an integer N as the input The program must replace each digit
in N with 1 and each even digit in N with O. The modified value of N representing a binary
representation. The program must print decimal equivalent of the modified value of N as the output

Input
84536

Output
6
'''

def number_checker(n):
    if(n%2==0):
        return '0'
    else:
        return '1'
number=list(input().strip())
for i in range(len(number)):
    number[i]=number_checker(int(number[i]))
print(int(''.join(i for i in number),2))