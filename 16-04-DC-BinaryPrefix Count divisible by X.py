'''
The program must accept two integers N and X as the input. The program must find the binary representation B of the
integer N. Then the program print the number of prefixes in B whose decimal equivalents are divisible by X as the
output.

Input:
52 2

Output:
3

Explanation:
The binary representation of 52 is B = 110100.
All prefixes in B and the corresponding decimal equivalents are given below.
110100 -> 52
11010 -> 26
1101 -> 13
110 -> 6
11 -> 3
1 -> 1
Here 52, 26 and 6 are divisible by 2. So the count 3 is printed as the output.

'''

num, div = map(int, input().strip().split())
binary = bin(num)[2:]
length = len(binary)
print(sum([1 if(int(binary[:i+1],2) % div == 0) else 0 for i in range(length)]))