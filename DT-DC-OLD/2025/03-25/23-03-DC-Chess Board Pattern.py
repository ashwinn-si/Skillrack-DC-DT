'''
The program must accept two integers M and N as the input. The program must form a matrix of size
(M*N)x(M*N). Then the program must fill the submatrices of size M*M with Os and Is alternatively in vertical
and horizontal directions as shown in the Example Input/Output section. Finally, the program must print the
matrix as the output.

Input:
4 3

Output:
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
1 1 1 1 0 0 0 0 1 1 1 1
1 1 1 1 0 0 0 0 1 1 1 1
1 1 1 1 0 0 0 0 1 1 1 1
1 1 1 1 0 0 0 0 1 1 1 1
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
0 0 0 0 1 1 1 1 0 0 0 0
'''


M , N = map(int , input().split())

R = (M * N)

C = (M * N)

matrix = [[None for j in range(0 , C)] for i in range(0 , R)]

for i , row_number in zip(range(0 , R , M) , range(1 , (N + 1))):
    
    current_bit = (0) if(row_number & 1) else (1)
    
    for j in range(0 , C , M):
        
        for k in range(i , (i + M)):
            
            for l in range(j , (j + M)):
                
                matrix[k][l] = current_bit
        
        current_bit = (0) if(current_bit == 1) else (1)

[print(*row_list) for row_list in matrix]