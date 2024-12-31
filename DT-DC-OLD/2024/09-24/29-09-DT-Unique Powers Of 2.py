'''The program must accept a string S containing only Os and Is as the input. The program must
print the unique powers of 2 that can be formed using the substrings of S. The unique powers
of 2 must be printed in ascending order.
Note: At least one 1 is always present in the string S.

Example Input/Output 1:
Input:
110111000100

Output:
1248

Explanation:
Here S = 110111000100.
The unique powers of 2 formed using the substrings of S are given below.
1 (1), 2 (10), 4 (100) and 8 (1000).
Hence the output is
1248
'''

string=input().strip()
max_value=int(string,2)
curr_value=1
while(True):
    if(max_value<curr_value):
        break
    if(bin(curr_value)[2:] in string):
        print(curr_value,end=" ")
    curr_value*=2