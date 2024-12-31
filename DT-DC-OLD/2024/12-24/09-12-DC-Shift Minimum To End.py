'''
The program must accept N integers and an integer K as the input. The program must perform the following
operation K times in the given N integers,
- Shift the minimum integer between the first two integers to the end.
Finally, the program must print the N modified integers as the output,

Input:
5
29 60 84 26 50
4

Output:
84 29 60 26 50

Explanation:
Here N = 5 and K = 4.
The given 5 integers are 29, 60, 84, 26 and 50.
After the ISt shifting operation, the integers become 60, 84, 26,
After the 2nd shifting operation, the integers become 84, 26, 50,
After the 3rd shifting operation, the integers become 84, 50, 29,
After the shifting operation, the integers become 84, 29, 60,
Hence the output is
84 29 60 26 50
50 and 29.
29 and 60.
60 and 26.
26 and 50.
'''

#Your code below
def helper(index_1 , index_2):
    if(numbers[index_1] > numbers[index_2]):
        return index_2
    return index_1

N = int(input())
numbers  = list(map(int,input().split()))
K = int(input())
for i in range(K):
    change_index = helper(0,1)
    if(change_index == 0):
        numbers.append(numbers[0])
        numbers = numbers[1:]
    else:
        num = numbers[1]
        del numbers[1]
        numbers.append(num)
print(*numbers)