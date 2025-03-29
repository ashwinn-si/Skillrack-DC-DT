'''
The program must accept a character matrix of size R*C and a string S as the input. The program must
search the string S in the four edges (Top, Right, Bottom and Left) of the matrix. Then the program must
print a string value representing the edge which contains the string S in any order (forward or reverse). If the
string S is present in two or more edges, then the program must print the first occurring edge in the above
mentioned order. If the string S is not present in all four edges, then the program must print -1 as the output.

Input:
6 7
q u b f y a a
j j l a v i c
p z r a p i t
h a u g v x i
c l v t o c v 
k o z l o u e
active

Output:
Right
'''

def check(A , B , S):
    
    return ((A in S) or (B in S))

R , C = map(int , input().split())

matrix = [input().strip().split() for i in range(0 , R)]

S = input().strip()

reversed_S = S[::-1]

top_row_string = (''.join(matrix[0][j] for j in range(0 , C)))

right_column_string = (''.join(matrix[i][(C - 1)] for i in range(0 , R)))

bottom_row_string = (''.join(matrix[(R - 1)][j] for j in range(0 , C)))

left_column_string = (''.join(matrix[i][0] for i in range(0 , R)))

print(('Top') if(check(S , reversed_S , top_row_string)) else (('Right') if(check(S , reversed_S , right_column_string)) else (('Bottom') if(check(S , reversed_S , bottom_row_string)) else (('Left') if(check(S , reversed_S , left_column_string)) else (-1)))))