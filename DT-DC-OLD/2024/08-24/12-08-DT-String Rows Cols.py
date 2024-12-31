'''The program must accept N string values of equal length L as the input. The program must
generate a matrix of size RxC with asterisks, where the values R and C depend on the value of
N. If N is even, then R = N + L- 1 and R- 1. Else R = N + L -2 and C = R + 1. Then the
program must modify the matrix based on the following conditions.
- The first L asterisks from the first row and first column of the matrix are replaced horizontally
with the characters in the first string.
- The first L asterisks from the second row and second column of the matrix are replaced
vertically with the characters in the second string.
- The first L asterisks from the third row and third column of the matrix are replaced
horizontally with the characters in the third string.
- Similarly, the program must modify the matrix for the remaining string values.
Finally, the program must print the modified matrix as the output.
''' #refer image for smaple inp and output

no_words=int(input())
words=[input().strip() for i in range(no_words)]
len_words=len(words[0])
if(no_words%2==0):
    rows=no_words+len_words-1
    cols=rows-1
else:
    rows=no_words+len_words-2
    cols=rows+1
res_matrix=[['*' for i in range(cols)] for j in range(rows)]
#filling the rows
for i in range(0,no_words,2):
    for j in range(i,i+len_words):
        res_matrix[i][j]=words[i][j-i]

#filling the cols
for i in range(1,no_words,2):
    for j in range(i,i+len_words):
        res_matrix[j][i]=words[i][j-i]

#printing the result
for i in range(rows):
    for j in range(cols):
        print(res_matrix[i][j],end="")
    print()
