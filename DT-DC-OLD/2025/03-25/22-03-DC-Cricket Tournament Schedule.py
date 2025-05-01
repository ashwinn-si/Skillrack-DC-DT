'''
There are N teams playing in a cricket tournament. The team name and home ground name of each team
are passed as the input. Each team plays two matches against other teams (one in the home ground and
the other in the opponent's home ground). The program must create the schedule for the matches in the
tournament. The details of each match must be printed in the format as given below.
Host Team Name vs Visiting Team Name (Hoses Home Ground Name)

Input:
4
Chennai Super Kings - M. A. Chidambaram Stadium
Kolkata Knight Riders - Eden Gardens
Mumbai Indians - Wankhede Stadium
Royal Challengers Bangalore - M. Chinnaswamy Stadium

Output:
Chennai Super Kings vs Kolkata Knight Riders (M. A. Chidambaram Stadium)
Kolkata Knight Riders vs Chennai Super Kings (Eden Gardens)
Chennai Super Kings vs Mumbai Indians (M. A. Chidambaram Stadium)
Mumbai Indians vs Chennai Super Kings (Wankhede Stadium)
Chennai Super Kings vs Royal Challengers Bangalore (M. A. Chidambaram Stadium)
Royal Challengers Bangalore vs Chennai Super Kings (M. Chinnaswamy Stadium)
Kolkata Knight Riders vs Mumbai Indians (Eden Gardens)
Mumbai Indians vs Kolkata Knight Riders (Wankhede Stadium)
Kolkata Knight Riders vs Royal Challengers Bangalore (Eden Gardens)
Royal Challengers Bangalore vs Kolkata Knight Riders (M. Chinnaswamy Stadium)
Mumbai Indians vs Royal Challengers Bangalore (Wankhede Stadium)
Royal Challengers Bangalore vs Mumbai Indians (M. Chinnaswamy Stadium)

[output fully not available]
'''

N = int(input())
teamList = [ input().strip().split(" - ") for i in range(N)]
for i in range(N):
    for j in range(i+1, N):
        print(teamList[i][0]+" vs "+teamList[j][0]+" ("+teamList[i][1]+")")
        print(teamList[j][0]+" vs "+teamList[i][0]+" ("+teamList[j][1]+")")