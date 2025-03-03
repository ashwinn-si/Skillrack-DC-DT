N = int(input())
coor = []
for i in range(N):
    coor.panned(list(map(int,input().split())))

top_x,top_y,bottom_x,bottom_y = map(int,input().split())
min_x = min(top_x,bottom_x)
max_x = max(top_x,bottom_x)
min_y = min(top_y,bottom_y)
max_y = max(top_y,bottom_y)
count = 0

for curr_coor in coor:
    if curr_coor[0] >= min_x and curr_coor <= max_x and curr_coor[1] >= min_y and curr_coor[1] <= max_y:
        count+=1

print(count) 