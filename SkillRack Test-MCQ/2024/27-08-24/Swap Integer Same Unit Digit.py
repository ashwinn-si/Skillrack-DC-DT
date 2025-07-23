'''The program must accept two integer matrices MI and M2 are of the same size R*C as the
input. The program must swap the integers in the same positions between the given two
matrices only if their unit digits are equal. Finally, the program must print the modified two
matrices as the output.

Input:
452 345 355 836
654 899 959 963
582 879 408 18
932 447 598 110
851 222 979 813
807 738 78 438

Output:
932 345 355 836
654 899 979 813
582 879 78 438
452 447 598 110
851 222 959 963
807 738 408 18
'''

rows,cols=map(int,input().split())
matrix1=[list(map(int,input().split())) for i in range(rows)]
matrix2=[list(map(int,input().split())) for i in range(rows)]
for i in range(rows):
    for j in range(cols):
        if(matrix1[i][j]%10==matrix2[i][j]%10):
            matrix1[i][j],matrix2[i][j]=matrix2[i][j],matrix1[i][j]
for i in range(rows):
    print(*matrix1[i])
for i in range(rows):
    print(*matrix2[i])