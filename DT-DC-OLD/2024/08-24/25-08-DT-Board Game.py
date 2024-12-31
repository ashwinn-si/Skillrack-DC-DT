'''
The program must accept an integer matrix of size RxC representing a board as the input. A
player can play on the board with a pawn based on the following conditions.
- Each cell in the board has a value which indicates the number of positions the player can
move forward from that cell.
- The player can start from any cell in the last row of the board or matrix. Then the player can
move towards up by moving in zig-zag manner (left to right and right to left alternatively).
- The player wins when he reaches out from the board.
The program must print the minimum number of moves required to can win the game as the
output.

Input:
3 4
2 3 4 5
7 2 3 4
5 6 1 1

Output:
2
'''

rows,cols=map(int,input().split())
matrix=[list(map(int,input().split())) for i in range(rows)]
change_flag=True
all_possible_moves=[]
for i in range(rows-1,-1,-1):
    if(change_flag):
        change_flag=False
        for j in matrix[i]:
            all_possible_moves.append(j)
    else:
        change_flag=True
        for j in matrix[i][::-1]:
            all_possible_moves.append(j)
res_moves=9999 #use float(inf)
for i in range(cols):
    index=i
    curr_no_moves=0
    while(index<len(all_possible_moves)):
        index+=all_possible_moves[index]
        curr_no_moves+=1
    if(res_moves>curr_no_moves):
        res_moves=curr_no_moves
print(res_moves)