'''
The program must accept an integer N as the input. An integer is said to be VALID only if the
integer is divisible by the sum of digits. A group of such consecutive VALID integers is a VALID
SET (will always have more than one integer). The program must find out whether the given
integer N is in a VALID SET or not. If it is, the program must print the number of integers in the
VALID SET and print its position in it. Else the program must print -1 as the output.

Input:
6

Output:
10 6

Explanation:
Here N = 6, which is a VALID integer.
The VALID SET which contains 6 is given below.
1 2 3 4 5 6 7 8 9 10
The number of integers in the VALID SET is IO. So IO is printed.
The position of the integer 6 is 6. So 6 is printed.
'''

#Your code below
def sum_helper(n):
    sum1 = 0
    while(n!=0):
        sum1+=n%10
        n//=10
    return sum1
n = int(input())
#base case
if(n % sum_helper(n) != 0):
    print("-1")
    quit()
    
no_elements = 1
left_flag = True
right_flag = True
left_pointer = 1
right_pointer = 1
ans = []
while(left_flag or right_flag):
    if(left_flag):
        if(n - left_pointer != 0 and (n - left_pointer) % sum_helper( n - left_pointer ) == 0):
            no_elements+=1
            ans.append(n-left_pointer)
            left_pointer+=1
            
        else:
            left_flag = False
    if(right_flag):
        if((n + right_pointer) % sum_helper(n + right_pointer) == 0):
            no_elements+=1
            ans.append(n+right_pointer)
            right_pointer+=1
        else:
            right_flag = False
if(no_elements == 1):
    print("-1")
else:
    print(no_elements,left_pointer)