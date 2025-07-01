'''
String Repeat Pattern
The program must accept two string values Sl
and S2 as the input. The string Sl contains only
alphabets and the string S2 contains only nonzero
digits. The program must print the output based on
the following conditions.
- For each digit D in S2, the program must print the
first P alphabets of the first string D times, where P
represents the position of the digit D in S2.
Note: Both SI and S2 have the same length.

Input:
asdf
4921

Output:
aaaa
asasasasasasasasas
asdasd
asdf
'''

S1 = input().strip()
S2 = input().strip()
N = len(S1)
for i in range(N):
    print(S1[:i + 1]* (int(S2)))
    