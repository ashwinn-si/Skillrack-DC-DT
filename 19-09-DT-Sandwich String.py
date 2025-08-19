'''
The program must accept a string S as the input. The program must print "YES" if the given string a sandwich
string. Else the program must print "NO" as the output. A sandwich string is a string that is formed by two
identical ends and a different middle. The sandwich string contains only 2 unique characters.

There are many edge cases to handle
'''

string = input().strip()
p1 = 0
N = len(string)

if(N < 3):
    print("NO")
    quit()
    
for i in range(1, N):
    if(string[i] != string[i - 1]):
        p1 = i
        break
    
if(p1 == N - 1 or p1 == 0):
    print("NO")
    quit()
    
if(string[: p1] != string[N - p1: ]):
    print("NO")
    quit()

for i in range(p1 + 1, N - p1):
    if(string[i] != string[i - 1]):
        print("NO")
        quit()

print("YES")