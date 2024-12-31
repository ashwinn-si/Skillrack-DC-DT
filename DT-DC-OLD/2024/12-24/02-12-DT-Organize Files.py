'''
The program must accept the names of N files (with extension) and a character CH as the
input The program must sort the fles based on the character CH.
- If CH is or the prograrn must sort the based on name (i.e. file name
without extension).
- If CH is "E' or the program must sort the files based on the extension.
If two or more files have the sarne name or extension. the program must sort those files in the
Order Of their occurrence. Finally. the must print the names Of the N sorted files as the

Input
4
doc2.txt
profile.png
doc1.txt
doc2.txt
N

Output
doc1.txt
doc2.txt
doc2.docx
profile.png
'''

#Your code below
N = int(input())
res = []
for i in range(N):
    string = input().strip().split('.')
    string.append(i)
    res.append(string)
if(input().strip().lower() == 'n'):
    for i in sorted(res,key = lambda x : ( x[0] , x[2] )):
        print(i[0]+'.'+i[1])
else:
    for i in sorted(res,key = lambda x : (x[1] , x[2])):
        print(i[0]+'.'+i[1])