'''
The program must accept a string S containing integers and words alternatively. The number of integers is always equal
to the number of words in the string S. For each integer X in the string S, the program must print the words that occur
after the integer X in the string X times as the output.

Input:
4hi5hello

Output:
hi hello hi hello hi hello hi hello
hello hello hello hello hello
'''

#Your code below
import re
string = input().strip()
word = re.findall(r'[a-zA-Z]+', string)
number = list(map(int, re.findall(r'\d+', string)))
N = len(word)
for i in range(N):
    no_times = number[i]
    for j in range(no_times):
        for w in word[i:]:
            print(w, end = " ")
    print()