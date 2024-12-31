'''The program must accept the names of the students in a class as the input. Each student's
marks is enclosed within the first and the last character of his/her name. The program also
accepts the marks Of those Students. For each student in the Class, the program must print the
name along with the marks he/she scored (without the characters enclosed) as the output
NQtE There are no students in the class having the same first and last characters in the name.
Input:
JAKE RAVI ABDUL AYSHA DIYA
A98L J76E AIOOA D88A R911
Output:
JAKE 76
RAVI 91
ABDUL 98
AYSHA 100
DIYA 88
'''

names=input().strip().split()
marks=input().strip().split()
for nam in names:
    for mark in marks:
        if(nam[0]==mark[0] and nam[-1]==mark[-1]):
            print(nam,mark[1:len(mark)-1])
