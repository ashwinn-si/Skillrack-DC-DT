'''The program must accept an array of N integers as the input. The program must print the
integer(s) in a single line until no digit is repeated throughout the integers. In the same way,
the program must print the integers of the given array in remaining lines as the output. If there
is no such integer, the program must print -1 as the output.

Input:
7
12 5 98 54 71 44 123

Output:
12 5 98
54 71
123
'''

N=int(input())

numbers=input().split()

global_digits=[]

curr_row_result=[]

result=[]

global_flag=False

for num in numbers:
    
    curr_numbers_digits=[]
    
    flag = 1 # 1 -> print | 2 -> new line print | 3-> dont print
    for digit in num:
        
        if(digit in curr_numbers_digits): # if the numbers ha repeating digits
            
            flag = 3
            
            break
        
        if(digit in global_digits):
            
            flag = 2
            
        curr_numbers_digits.append(digit)
        
        global_digits.append(digit)
        
    if(flag==3): # if there are repeating digits
    
        global_digits=[]
        
        if(len(curr_row_result)>0):
            
            result.append(curr_row_result)
            
        curr_row_result=[]
        
        continue
    
    elif(flag==2): # if the number should be printed in a new line
    
        if(len(curr_row_result)>0):
            
            result.append(curr_row_result)
            
        curr_row_result=[num,]
        
        global_digits=[i for i in curr_numbers_digits]
        
    else:
        
        curr_row_result.append(num) # if the number should be printed continuously
        
        global_flag=True

result.append(curr_row_result)

if(not global_flag):
    print("-1")
    quit()

else:
    
    for i in result:
        if(len(i)>0):
            print(*i)
    