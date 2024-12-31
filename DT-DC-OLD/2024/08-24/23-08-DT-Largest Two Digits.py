'''The program must accept an integer N as the input. The program must print the largest
possible two-digit even integer formed using the digits in N as the output.
Note: At least one even digit is always present in N.


Input:
147

Output:
74

Explanation:
Here N = 147, the possible two-digit integers are 14, 17, 41, 47, 71 and 74.
The largest two-digit even integer is 74.
So 74 is printed as the output.
'''

digits=sorted([int(i) for i in input().strip()])
largest_digi=digits[-1]
even_digi=-1
for i in range(len(digits)-2,-1,-1):
    if(digits[i]%2==0):
        even_digi=digits[i]
        break
if(even_digi==-1):
    print((digits[-2]*10)+largest_digi)
else:
    print((largest_digi*10)+even_digi)