'''The program must accept the name and the marks in three subjects (Maths, Physics,
Chemistry) of N students as the input. The program must sort the students based on the
marks in Maths in descending order. If two or more students have the same marks in Maths,
then the program must sort those students based on the marks in Physics in descending
order. If two or more students have the same marks in Maths and Physics, then the program
must sort those students based on the marks in Chemistry in descending order. If two or more
students have the same marks in Maths, Physics and Chemistry, then the program must sort
the students based on the name in ascending order. Finally, the program must print the name
and the marks in the three subjects of the N students after sorting as the output.

Input:
4
xxyz 85 99 86
stuuuv 91 92 100
efggg 85 99 72
aabbcc 91 92 100

Output:
aabbcc 91 92 100
stuuuv 91 92 100
xxyz 85 99 86
efggg 85 99 72

Explanation:
The students stuuuv and aabbcc scored the same marks in Maths, Physics and Chemistry
(91, 92, 100). So they are sorted based on their names in ascending order.
The students xxyz and efggg scored the same marks in Maths and Physics (85, 99). So they
are sorted in descending order based on the marks in Chemistry.
Hence the output is
aabbcc 91 92 100
stuuuv 91 92 100
xxyz 85 99 86
efggg 85 99 72
'''

n=int(input())
result=[]
for i in range(n):
    curr=input().split()
    curr[1]=int(curr[1])
    curr[2]=int(curr[2])
    curr[3]=int(curr[3])
    result.append(curr)
result=sorted(result,key= lambda x:(-x[1],-x[2],-x[3],x[0]))
for i in result:
    print(*i)