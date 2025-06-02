'''
The program must accept a list of unique words as the input. The program must print all possible pairs of words that
form a palindrome. If there is no such pair, the program must print -1 as the output.

Input:
tiger register regit egit all a la

Output:
tigerregit
tigeregit
regittiger
'''

words = input().strip().split()
flag = True
for i in [words[i] + words[j] for i in range(len(words)) for j in range(len(words)) if(words[i] + words[j] == (words[i] + words[j])[::-1] and i != j)]:
    flag = False
    print(i)
if(flag):
    print("-1")