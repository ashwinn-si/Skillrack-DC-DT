'''
The program must accept an array of N unique integers (where N is always odd) and an
integer T as the input The program must modify the array T times based on the following
conditions.
- Compare the middle three integers (arrlmid- II, arr[midl, arrlmid+ II) and find the maximum
value among them.
- If arr[mid-l] is the maximum integer, then it must be moved to the beginning of the array.
- If arr[mid+ 1] is the maximum integer, then it must be moved to the end of the array,
- If arr[mid] is the maximum integer, then compare the first integer and the last integer in the
array, then it must be moved to the side with the maximum value.
Finally, the program must print the integers in the modified array as the output.

Input:
7
88 3 49 40 80 9 99
4

Output
49 8 83 9 80 40 99
'''

#Your code below
N = int(input()) // 2
numbers = list(map(int,input().split()))
for i in range(int(input())):
    max_val = max(numbers[N],numbers[N+1],numbers[N-1])
    if(max_val == numbers[N]):
        if(numbers[0] < numbers[-1]):
            numbers.append(numbers[N])
            del numbers[N]
        else:
            numbers.insert(0,numbers[N])
            del numbers[N+1]
    elif(max_val == numbers[N-1]):
        numbers.insert(0,numbers[N-1])
        del numbers[N]
    else:
        numbers.append(numbers[N+1])
        del numbers[N+1]
print(*numbers)