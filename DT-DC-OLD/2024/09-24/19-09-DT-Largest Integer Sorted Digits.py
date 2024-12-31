'''The program must accept an integer N as the input. The program must print the largest
integer which is less than or equal to N, where the digits are sorted in ascending order as the
output.

Input:
322

Output:
299

Explanation:
Here N = 322.
The largest integer is 299, which is less than or equal to 322 and also the digits in 299 are
sorted in increasing order.
So 299 is printed as the output
'''

number=input().strip()
while(True):
    res=''.join(str(j) for j in sorted([int(i) for i in number]))
    if(res==number):
        print(res)
        quit()
    number=str(int(number)-1)