'''
There are N students who have taken a test. The students who have scored same marks are allocated the
same rank. The program must accept the marks of the N students and print the rank of the student.

Input:
5
55 60 55 50 60
4

Output:
3

Explanation:
student.
Students 2 and 5 have scored 60 and are ranked 1.
Students 1 and 3 have scored 55 and are ranked 2.
Student 4 has scored 50 and is ranked 3.
Hence the rank of the 4th student is 3 and is printed as the output.
'''

#Your code below
N = int(input())
marks = list(map(int,input().split()))
print(sorted(set(marks), reverse = True).index(marks[int(input()) - 1]) + 1)