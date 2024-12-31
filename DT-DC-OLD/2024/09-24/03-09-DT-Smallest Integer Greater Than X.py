'''The program must accept a list of unique integers as the input. For each integer X among the
given list of integers, the program must print the smallest integer among the integers greater
than X in the given list. If there is no integer greater than X, then the program must print -l as
the output.

Input:
23117185

Output:
35-182117

Explanation:
The integers in the given list are 2 3 11 7 1 8 5.
The smallest integer among the integers greater than 2 is 3 (3, 5, 7, 8, 11). So 3 is printed.
The smallest integer among the integers greater than 3 is 5 (5, 7, 8, I I). So 5 is printed.
There is no integer greater than II. So -I is printed.
The smallest integer among the integers greater than 7 is 8 (8, 11). So 3 is printed.
The smallest integer among the integers greater than 1 is 2 (2, 3, 5, 7, 8, 11). So 2 is printed.
The smallest integer among the integers greater than 8 is 11, So 11 is printed.
The smallest integer among the integers greater than 5 is 7 (7, 8, 11). So 7 is printed.
'''

numbers=list(map(int,input().split()))
number_cpy=sorted(numbers);
len_num=len(numbers)
for i in range(len_num):
    if(number_cpy.index(numbers[i])==len_num-1):
        print("-1",end=" ")
    else:
        print(number_cpy[number_cpy.index(numbers[i])+1],end=" ")