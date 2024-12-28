'''
The program accept a string S containing only Os and Is as the input. The program must split the string S
into t'.vo substring values so that the concatenation ot the number of Os in the left substring and the
number of IS in the right substring is maximum. Then the program must print those two substring values of
S as the output

Input:
001110111
Output:
001110 111
Explanation:
Here S = 001110111_
All possible ways to split the string S are given below.
0 01110111 16
00 1110111 26
001 110111 25
0011 10111 24
00111 0111 23
001110 111 33
0011101 11 32
00111011 1 31
The maximum value is 33 (3 Zeroes in 001110 & 3 in m),
Hence the output is
001110 111
'''

#Your code below
string =input().strip()
res_count = -1
res_index = -1
for i in range(1,len(string)):
    curr_count = (string[:i].count('0'))*10+(string[i:].count('1')) #!main line of logic
    if(curr_count >= res_count):
        res_count = curr_count
        res_index = i
print(string[:res_index],string[res_index:])