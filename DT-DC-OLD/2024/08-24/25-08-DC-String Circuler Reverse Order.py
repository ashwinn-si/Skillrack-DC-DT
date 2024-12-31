'''
The program must accept a string S and an integer N as the input. The program must print the
characters present at the positions of multiples of N in circularly reverse order. Once a
character is printed, the program must remove that character from the string. If the multiple of
N goes beyond the first character, then the characters must be navigated in a cyclic manner till
all the characters are printed.

Input:
apple
4

Output:
ppale
'''
string=list(input().strip()[::-1])
n=int(input())
index=n-1
while(len(string)>0):
    index=index%len(string)
    print(string[index],end="")
    del string[index]
    index+=(n-1)