'''The program must accept a string S and an integer N as the input. The string S contains only
Os and Is. The program must print YES if the string S contains the binary representation of
each integer from 1 to N as a substring. Else the program must print NO as the output.

Input:
110
3

Output:
YES

Explanation:
Heres = 110 and N = 3.
The binary representation of 1 is 1.
The binary representation of 2 is IO.
The binary representation of 3 is 11.
Here the string S contains the binary representation of each integer from 1 to 3 as a substring.
So YES is printed as the output.
'''

string=input().strip()
num=int(input())
for curr_num in range(1,num+1):
    if(bin(curr_num)[2:] not in string):
        print("NO")
        quit()
print("YES")