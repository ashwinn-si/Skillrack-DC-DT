'''
The program must accept a matrix of size representing R*C cities. Each city may or may not have a cell phone
tower. The presence of a small tower is indicated by the letter S, the presence of a large tower is indicated by the letter
L and the absence of a tower is indicated by O. The two types of the towers give the signal to the cities as given below.
- A small tower will give the signal to the cities around the tower (only the nearest layer) and the city where the tower is
installed.
- A large tower will give the signal to the cities in the two nearest layers around the tower and the city where the tower is
installed.
The program must print the number of cities that receive the signal as the output.

Input:
8 8
00000000
0s000000
00000000
00000S00
00000000
00000L00
00000000
S0000000

Output:
41
'''

offsets1 = [[0, 1],[0, -1],[1, 0],[-1, 0],[1, 1],[1, -1],[-1, 1],[-1, -1]]
offsets2 = [[-2, -2], [-2, -1], [-2, 0], [-2, 1],[-2, 2], [2, -2], [2, -1], [2, 0], [2, 1], [2, 2],[-2, -2], [-1, -2], [0, -2], [1, -2],[2, -2], [-2, 2], [-1, 2], [0, 2],[1, 2],[2, 2]]

def is_valid(curr_row, curr_col, R, C):
    return (0 <= curr_row < R and 0 <= curr_col < C)
    
def signal_marker(row, col, symbol):
    radius = 1 if(symbol == "S") else 2
    for i in range(radius):
        if(i == 0):
            for offset in offsets1:
                new_row = row + offset[0] 
                new_col = col + offset[1]
                if(is_valid(new_row, new_col, R, C)):
                    if(matrix[new_row][new_col] != 'S' and matrix[new_row][new_col] != 'L'):
                        matrix[new_row][new_col] = '#'
        else:
            for offset in offsets2:
                new_row = row + offset[0]
                new_col = col + offset[1]
                if(is_valid(new_row, new_col, R, C)):
                    if(matrix[new_row][new_col] != 'S' and matrix[new_row][new_col] != 'L'):
                        matrix[new_row][new_col] = '#'

R, C = map(int, input().strip().split())
matrix = [input().strip().split() for i in range(R)]
for i in range(R):
    for j in range(C):
        if(matrix[i][j] == 'L' or matrix[i][j] == 'S'):
            signal_marker(i, j, matrix[i][j])
            matrix[i][j] = '#'
count = 0
for i in range(R):
    for j in range(C):
        if(matrix[i][j] == '#'):
            count += 1
print(count)