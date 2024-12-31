'''The must accept an integer N as the input The program must print the even integers
that can be formed by shifting the digits to the right in N.
- At least 1 even digit is always present in N.
• The resulting even integers must be printed without leading zeros.

Example Input/Output :

Input
4763

Output
3476 7634
'''

def even_number_checker(n):
    if(n%2==0):
        return True
    else:
        return False
number=input().strip()
len_number=len(number)
for i in range(len_number):
    num=int(number)
    if(even_number_checker(num)):
        print(num,end=" ")
    number=number[-1]+number[:len_number-1]

