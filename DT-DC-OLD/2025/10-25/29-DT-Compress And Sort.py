'''
The program must accept N integers as the input. For each integer X among the N integers, the
program must compress the integer to a smaller value by removing a digit in X. Then the program print
the N revised integers in sorted order.

Input:
5
623 234 59296 894 50

Output:
0 23 23 84 5296

'''
import heapq

def get_digits_list(N):
    
    digits_list = []
    
    while(N > 0):
        
        digit = (N % 10)
        
        digits_list.insert(0 , digit)
        
        N = (N // 10)
    
    return digits_list

def get_N_from_digits_list(digits_list):
    
    N = 0
    
    for digit in digits_list:
        
        if(digit != -999):
            
            N = ((N * 10) + digit)
    
    return N

def get_new_N(N):
    
    digits_list = get_digits_list(N)
    
    flag = True
    
    for index in range(0 , (len(digits_list) - 1)):
        
        if(digits_list[index] > digits_list[(index + 1)]):
            
            flag = False
            
            digits_list[index] = -999
            
            break
    
    return ((N // 10) if(flag) else (get_N_from_digits_list(digits_list)))

N = int(input())

values_list = []

[heapq.heappush(values_list , get_new_N(value)) for value in list(map(int , input().split()))]

while(values_list):
    
    print(heapq.heappop(values_list) , end = " ")