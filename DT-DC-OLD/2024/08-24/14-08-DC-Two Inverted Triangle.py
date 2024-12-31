'''The program must accept an integer N as the input. The program must generate a matrix of
size RxC with zeroes, where R represents the number of rows N+I in the matrix and C
represents the number of columns (N*2)+1 in the matrix. The program must replace the
zeroes in the matrix based on the following conditions.
- All the zeroes in the first row are replaced with asterisks.
- All the zeroes in the middle column are replaced with asterisks.
- All the zeroes in the diagonal from top-left to the bottom-middle are replaced with asterisks.
- All the zeroes in the diagonal from top-right to the bottom-middle are replaced with
asterisks.
Finally, the program must print the modified matrix as the output.
Input:
4
Output:
//see-img//
'''

N=int(input())
rows=N+1
cols=(N*2)+1
top_left_to_mid_pointer,top_right_to_mid_pointer=0,cols-1
for r in range(rows):
    for c in range(cols):
        if(r==0):
            print('*',end="")
            continue
        if(c==cols//2):
            print('*',end="")
            continue
        if(c==top_left_to_mid_pointer):
            print("*",end="")
            continue
        if(c==top_right_to_mid_pointer):
            print('*',end="")
            continue
        print("0",end="")
    top_left_to_mid_pointer+=1
    top_right_to_mid_pointer-=1
    print()
