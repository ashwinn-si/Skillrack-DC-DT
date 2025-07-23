'''The program must accept a string S containing one or more words and an integer K as the
input. Each word in the string S has an integer at its beginning. The program must modify each
word by adding the value K to the integer in that word. Finally, the program must print the
modified words in reverse order as the output.

Input:
2apples 10mangoes 50ranges 35grapes
5

Output:
40grapes 100ranges 15mangoes 7apples
'''
string=input().split()
k=int(input())
for i in range(len(string)):
    index=0
    for j in range(len(string[i])):
        if(string[i][j].isalpha()):
            index=j
            break
    string[i]=str(int(string[i][:index])+k)+string[i][index:]
print(*string[::-1])