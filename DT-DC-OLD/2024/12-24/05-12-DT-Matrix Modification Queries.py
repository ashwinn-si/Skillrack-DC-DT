'''
The program must accept two integers C and Q queries as the input The queries can be of
any of the following four types
Type 1: An integer X follovæd by the character
Type 2: An integer X followed by the character e
Type 3: An integer X, the character r. an integer Y and the character c.
Type 4; An integer X. the character an integer Y and the character r.
program must form an integer matrix Of size RxC with Os_ For each query, the
must rn•OdiW the matrix based on the conditions.
- If the query type is 1, the program must increment the integers in the Xth row.
• If the query type is 2. the program must increment the integers in the Xth column.
if the query type is 3, the program must increment the integer present in the row and Yth
- If the query type is 4. the program must increment the integer present in column
Finally. the program must print the modified matrix as the output

Input
3 3
5
1r 3c 2r2c 1r 2c

Output
2 3 3
0 2 1
0 1 1

Explanation:
Here Q=5. the given 5 queries are 1r 3c 2r 2c 1r 2c
The 1St query is 1st, so the integers in the 1st row Ue incremented,
The 2nd query is 3c so the integers in the 3rd column are incremented.
The 3rd query is 2r2c. so the integer in the 2nd and 2nd column is incremented.
The 4th query is It, so the integers in the ISt row are incremented.
The query is 2c. so the integers in the 2nd column are increm«lted.
After processing the 5 queries. the matrix becomes
2 3 3
0 2 1
0 1 1
'''

#Your code below
def helper(matrix, N , flag , R , C):
    #flag -> true [row inc]  | false [col inc]
    if(flag):
        for j in range(C):
            matrix[N][j] += 1
    else:
        for i in range(R):
            matrix[i][N] += 1
            
R , C = map(int,input().split())
Q = int(input())
matrix = [[0 for i in range(C)] for i in range(R)]
for curr_Q in input().split():
    alphabets_present = {}
    for i in range(len(curr_Q)):
        if(curr_Q[i] == 'r'):
            alphabets_present['r'] = i
        elif(curr_Q[i] == 'c'):
            alphabets_present['c'] = i
    
    #len -> 1 -> Type 1 and 2 | len -> 2 -> Type 3 and 4
    if(len(alphabets_present) == 1):
        if('r' in alphabets_present):
            helper(matrix,int(curr_Q[0:alphabets_present['r']])-1,True,R,C)
        else:
            helper(matrix , int(curr_Q[0:alphabets_present['c']])-1 , False,R,C);
    else:
        #type 3
        if(alphabets_present['r'] < alphabets_present['c']):
            r = int(curr_Q[0:alphabets_present['r']])-1
            c = int(curr_Q[alphabets_present['r']+1:len(curr_Q)-1])-1
            matrix[r][c]+=1
        else:
            c = int(curr_Q[0:alphabets_present['c']])-1
            r = int(curr_Q[alphabets_present['c']+1:len(curr_Q)-1])-1
            matrix[r][c]+=1
for i in range(R):
    for j in range(C):
        print(matrix[i][j],end=" ")
    print()