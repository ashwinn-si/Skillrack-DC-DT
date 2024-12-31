#Your code below
N = int(input())
occupied_seats = list(map(int,input().split()))
total_seats = int(input())
seats = [[0,0] for i in range(total_seats//2)]
curr_seat = 1
res_count = 0
for i in range(total_seats//2):
    for j in range(2):
        if(curr_seat in occupied_seats):
            seats[i][j] = 1
        curr_seat+=1
#checking for first row
for i in range(total_seats//2):
    for j in range(2):
        #horizontal_checking
        if( j == 0 and seats[i][1] == 0 and seats[i][0] == 0):
            res_count+=1
        #vertical_checking
        if( i != 0 and seats[i][j] == 0 and seats[i-1][j] == 0):
            res_count+=1
print(res_count)