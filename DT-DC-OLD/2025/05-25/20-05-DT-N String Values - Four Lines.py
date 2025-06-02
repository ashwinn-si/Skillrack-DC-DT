'''
The program must accept N string values of equal length L (where L is always a multiple of 4) as the input. The
program must print the string values based on the following conditions.
- The number of lines to be printed is 4 * N.
- The number of characters to be printed in each line is (L 12).
- The program must divide each string into four substrings of equal length.
- The first four lines contain the substrings of ISt and 2nd string values alternatively.
- The next four lines contain the substrings of 3rd and 4th string values alternatively.
- Similarly, the remaining lines are printed as the output.

Input:
4
PondLionNoteBook
MarkBoysHeadBird
crowdogseggscake
roadmapsjunesilk

Output:
PondMark
LionBoys
NoteHead
BookBird
crowroad
dogsmaps
eggsjune
cakesilk
'''

#Your code below
N = int(input())
input_string = []
result_matrix = []
for row in range(N):
    curr_string = input().strip()
    curr_row = []
    length = len(curr_string)
    for col in range(0, length, length // 4):
        curr_row.append(curr_string[col: col + (length // 4)]);
    input_string.append(curr_row)
    
for row in range(0, N, 2):
    pointer_1 = row
    pointer_2 = row + 1
    for col in range(0, 4):
        print(input_string[pointer_1][col] + input_string[pointer_2][col])